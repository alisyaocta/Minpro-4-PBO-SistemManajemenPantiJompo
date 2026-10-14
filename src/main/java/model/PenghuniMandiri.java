package model;

public class PenghuniMandiri extends PenghuniPanti implements KunjunganKeluarga {

    // ENCAPSULATION
    private String hobi;
    private String kegiatanHarian;
    
    private static final double biayaDasar = 2_500_000;
    private static final int durasiKunjungan = 120;
    
    // CONSTRUCTOR
    public PenghuniMandiri(int idPenghuni, String nama, int usia, String noTelp,
            String jenisKelamin, String kondisi, String hobi, String kegiatanHarian) {
        super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi);
        this.hobi = hobi;
        this.kegiatanHarian = kegiatanHarian;
    }

    // GETTER
    public String getHobi() {
        return hobi;
    }
    public String getKegiatanHarian() {
        return kegiatanHarian;
    }

    // SETTER
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
    public void setKegiatanHarian(String kegiatanHarian) {
        this.kegiatanHarian = kegiatanHarian;
    }

    // OVERRIDING
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Hobi                  : " + hobi);
        System.out.println("Kegiatan Harian       : " + kegiatanHarian);
    }

    // INTERFACE 
    @Override
    public void prosesKunjungan(String namaPengunjung, String hari, String jam) {
        System.out.println("\n====================================================");
        System.out.println("============== KUNJUNGAN PENGHUNI MANDIRI ==========");
        System.out.println("====================================================");
        System.out.println("Pengunjung            : " + namaPengunjung);
        System.out.println("Mengunjungi           : " + getNama());
        System.out.println("Hari Kunjungan        : " + hari);
        System.out.println("Waktu                 : " + jam + " - " + hitungJamSelesai(jam));
        System.out.println("Lokasi                : Taman / Ruang Tamu");
        System.out.println("Durasi Maksimal       : " + getDurasiKunjunganMenit() + " Menit");
        System.out.println("Catatan               : Boleh menemani " + getNama() + " untuk " + hobi);
        System.out.println("====================================================\n");
    }

    @Override
    public int getDurasiKunjunganMenit() {
        return durasiKunjungan;
    }

    // ABSTRACT METHOD
    @Override
    public String getKategori() {
        return "Penghuni Mandiri";
    }

    @Override
    public double hitungBiayaBulanan() {
        return biayaDasar;
    }
    
    private String hitungJamSelesai(String jam) {
        String[] bagian = jam.split(":");
        int totalMenit = Integer.parseInt(bagian[0]) * 60
                + Integer.parseInt(bagian[1])
                + getDurasiKunjunganMenit();
        totalMenit %= 24 * 60;
        return String.format("%02d:%02d", totalMenit / 60, totalMenit % 60);
    }
}