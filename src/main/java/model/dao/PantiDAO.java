package model.dao;

import config.Koneksi;
import model.PenghuniIntensif;
import model.PenghuniMandiri;
import model.PenghuniPanti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class PantiDAO {

    private static final String KAT_MANDIRI = "Penghuni Mandiri";
    private static final String KAT_INTENSIF = "Penghuni Intensif";

    private final Connection conn;

    public PantiDAO() {
        this.conn = Koneksi.getConnection();
    }

    // CREATE
    public boolean tambahPenghuni(PenghuniPanti p) {
        String sqlInduk = "INSERT INTO penghuni_panti "
                + "(id_penghuni, nama, usia, no_telp, jenis_kelamin, kondisi, kategori) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            conn.setAutoCommit(false);

            try (PreparedStatement ps = conn.prepareStatement(sqlInduk)) {
                ps.setInt(1, p.getIdPenghuni());
                ps.setString(2, p.getNama());
                ps.setInt(3, p.getUsia());
                ps.setString(4, p.getNoTelp());
                ps.setString(5, p.getJenisKelamin());
                ps.setString(6, p.getKondisi());
                ps.setString(7, p.getKategori());
                ps.executeUpdate();
            }

            if (p instanceof PenghuniMandiri pm) {
                String sqlMandiri = "INSERT INTO penghuni_mandiri "
                        + "(id_penghuni, hobi, kegiatan_harian) VALUES (?, ?, ?)";
                try (PreparedStatement ps = conn.prepareStatement(sqlMandiri)) {
                    ps.setInt(1, pm.getIdPenghuni());
                    ps.setString(2, pm.getHobi());
                    ps.setString(3, pm.getKegiatanHarian());
                    ps.executeUpdate();
                }
            } else if (p instanceof PenghuniIntensif pi) {
                String sqlIntensif = "INSERT INTO penghuni_intensif "
                        + "(id_penghuni, nama_perawat, kontrol_medis, jadwal_obat) VALUES (?, ?, ?, ?)";
                try (PreparedStatement ps = conn.prepareStatement(sqlIntensif)) {
                    ps.setInt(1, pi.getIdPenghuni());
                    ps.setString(2, pi.getNamaPerawat());
                    ps.setString(3, pi.getKontrolMedis());
                    ps.setString(4, pi.getJadwalObat());
                    ps.executeUpdate();
                }
            }

            conn.commit();
            return true;
        } catch (SQLException e) {
            rollbackAman();
            System.out.println("Gagal Menambahkan Data Penghuni Panti Rumah Senja - " + e.getMessage());
            return false;
        } finally {
            setAutoCommitAman(true);
        }
    }

    // READ SEMUA 
    public List<PenghuniPanti> ambilSemuaPenghuni() {
        List<PenghuniPanti> daftar = new ArrayList<>();
        String sql = "SELECT p.*, m.hobi, m.kegiatan_harian, "
                + "i.nama_perawat, i.kontrol_medis, i.jadwal_obat "
                + "FROM penghuni_panti p "
                + "LEFT JOIN penghuni_mandiri m ON p.id_penghuni = m.id_penghuni "
                + "LEFT JOIN penghuni_intensif i ON p.id_penghuni = i.id_penghuni "
                + "ORDER BY p.id_penghuni";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                daftar.add(mapRow(rs));
            }
        } catch (SQLException e) {
            System.out.println("Gagal Mengambil Data Penghuni Panti Rumah Senja - " + e.getMessage());
        }
        return daftar;
    }

    // READ BY ID
    public PenghuniPanti cariById(int id) {
        String sql = "SELECT p.*, m.hobi, m.kegiatan_harian, "
                + "i.nama_perawat, i.kontrol_medis, i.jadwal_obat "
                + "FROM penghuni_panti p "
                + "LEFT JOIN penghuni_mandiri m ON p.id_penghuni = m.id_penghuni "
                + "LEFT JOIN penghuni_intensif i ON p.id_penghuni = i.id_penghuni "
                + "WHERE p.id_penghuni = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapRow(rs);
                }
            }
        } catch (SQLException e) {
            System.out.println("Gagal Mencari Data Penghuni Panti Rumah Senja - " + e.getMessage());
        }
        return null;
    }

    // UPDATE
    public boolean updateUsiaKondisi(int id, int usia, String kondisi) {
        String sql = "UPDATE penghuni_panti SET usia = ?, kondisi = ? WHERE id_penghuni = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, usia);
            ps.setString(2, kondisi);
            ps.setInt(3, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Gagal Memperbarui Usia atau Kondisi Penghuni Panti - " + e.getMessage());
            return false;
        }
    }

    // UPDATE PENGHUNI MANDIRI
    public boolean updateMandiri(PenghuniMandiri pm) {
        String sql = "UPDATE penghuni_mandiri SET hobi = ?, kegiatan_harian = ? WHERE id_penghuni = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, pm.getHobi());
            ps.setString(2, pm.getKegiatanHarian());
            ps.setInt(3, pm.getIdPenghuni());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Gagal Memperbarui Data Penghuni Mandiri - " + e.getMessage());
            return false;
        }
    }

    // UPDATE PENGHUNI INTENSIF
    public boolean updateIntensif(PenghuniIntensif pi) {
        String sql = "UPDATE penghuni_intensif SET nama_perawat = ?, kontrol_medis = ?, jadwal_obat = ? "
                + "WHERE id_penghuni = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, pi.getNamaPerawat());
            ps.setString(2, pi.getKontrolMedis());
            ps.setString(3, pi.getJadwalObat());
            ps.setInt(4, pi.getIdPenghuni());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Gagal Memperbarui Data Penghuni Intensif - " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean hapusPenghuni(int id) {
        String sql = "DELETE FROM penghuni_panti WHERE id_penghuni = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Gagal Menghapus Data Penghuni Panti Jompo - " + e.getMessage());
            return false;
        }
    }

    // KUNJUNGAN
    public boolean tambahKunjungan(int idPenghuni, String namaPengunjung, String hari, String jam) {
        String sql = "INSERT INTO kunjungan_keluarga (id_penghuni, nama_pengunjung, hari, jam) "
                + "VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idPenghuni);
            ps.setString(2, namaPengunjung);
            ps.setString(3, hari);
            ps.setTime(4, Time.valueOf(jam + ":00"));
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Gagal Menyimpan Jadwal Kunjungan - " + e.getMessage());
            return false;
        }
    }

    // HELPER
    private PenghuniPanti mapRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id_penghuni");
        String nama = rs.getString("nama");
        int usia = rs.getInt("usia");
        String noTelp = rs.getString("no_telp");
        String jk = rs.getString("jenis_kelamin");
        String kondisi = rs.getString("kondisi");
        String kategori = rs.getString("kategori");

        if (KAT_MANDIRI.equals(kategori)) {
            return new PenghuniMandiri(id, nama, usia, noTelp, jk, kondisi,
                    rs.getString("hobi"), rs.getString("kegiatan_harian"));
        }
        return new PenghuniIntensif(id, nama, usia, noTelp, jk, kondisi,
                rs.getString("nama_perawat"), rs.getString("kontrol_medis"), rs.getString("jadwal_obat"));
    }

    private void rollbackAman() {
        try {
            conn.rollback();
        } catch (SQLException e) {
            System.out.println("Rollback Gagal! - " + e.getMessage());
        }
    }

    private void setAutoCommitAman(boolean nilai) {
        try {
            conn.setAutoCommit(nilai);
        } catch (SQLException e) {
            System.out.println("Gagal Mengatur Autocommit! - " + e.getMessage());
        }
    }
}