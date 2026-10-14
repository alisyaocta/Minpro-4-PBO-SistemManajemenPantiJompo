package controller;

import java.util.List;
import java.util.Scanner;
import model.PenghuniIntensif;
import model.PenghuniMandiri;
import model.PenghuniPanti;
import model.dao.PantiDAO;
import utility.InputValidasi;

public class PantiService {

    private final PantiDAO dao;
    private final Scanner scanner;

    private static final String[] hariValid = {
        "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"
    };

    public PantiService(Scanner scanner) {
        this.dao = new PantiDAO();
        this.scanner = scanner;
    }

    public boolean isIdExist(int id) {
        return dao.cariById(id) != null;
    }

    // TAMBAH PENGHUNI
    public void tambahPenghuni() {
        System.out.println("\n====================================================");
        System.out.println("============== PILIH KATEGORI PENGHUNI =============");
        System.out.println("====================================================");
        System.out.println("| 1. Penghuni Mandiri                              |");
        System.out.println("| 2. Penghuni Intensif                             |");
        System.out.println("| 3. Kembali Ke Menu Utama                         |");
        System.out.println("====================================================");

        int jenis = InputValidasi.bacaInt(scanner, "\nPilih Kategori (1-3) : ");
        if (!InputValidasi.validasiPilihanMenu(jenis, 3) || jenis == 3) {
            return;
        }

        int idPenghuni;
        do {
            idPenghuni = InputValidasi.bacaInt(scanner, "ID Penghuni Panti : ");
        } while (!InputValidasi.validasiIdPenghuni(idPenghuni)
                || !InputValidasi.validasiIdDuplikat(idPenghuni, this));

        String nama;
        do {
            System.out.print("Nama Penghuni Panti : ");
            nama = scanner.nextLine();
        } while (!InputValidasi.validasiNama(nama));

        int usia;
        do {
            usia = InputValidasi.bacaInt(scanner, "Usia Penghuni Panti : ");
        } while (!InputValidasi.validasiUsia(usia));

        String noTelp;
        do {
            System.out.print("Nomor Telepon Keluarga : ");
            noTelp = scanner.nextLine();
        } while (!InputValidasi.validasiNoTelp(noTelp));

        String jenisKelamin;
        do {
            System.out.print("Jenis Kelamin (Laki Laki/ Perempuan): ");
            jenisKelamin = scanner.nextLine();
        } while (!InputValidasi.validasiJenisKelamin(jenisKelamin));

        String kondisi;
        do {
            System.out.print("Kondisi Kesehatan Penghuni : ");
            kondisi = scanner.nextLine();
        } while (!InputValidasi.validasiKondisi(kondisi));

        PenghuniPanti penghuniBaru;
        if (jenis == 1) {
            System.out.print("Hobi : ");
            String hobi = scanner.nextLine();

            System.out.print("Kegiatan Harian : ");
            String kegiatanHarian = scanner.nextLine();

            penghuniBaru = new PenghuniMandiri(idPenghuni, nama, usia, noTelp,
                    jenisKelamin, kondisi, hobi, kegiatanHarian);
        } else {
            System.out.print("Nama Perawat : ");
            String namaPerawat = scanner.nextLine();

            System.out.print("Jadwal Kontrol Medis : ");
            String kontrolMedis = scanner.nextLine();

            System.out.print("Jadwal Pemberian Obat : ");
            String jadwalObat = scanner.nextLine();

            penghuniBaru = new PenghuniIntensif(idPenghuni, nama, usia, noTelp,
                    jenisKelamin, kondisi, namaPerawat, kontrolMedis, jadwalObat);
        }

        if (dao.tambahPenghuni(penghuniBaru)) {
            System.out.println("\n====================================================");
            System.out.println("======= DATA PENGHUNI BARU BERHASIL DITAMBAH =======");
            System.out.println("====================================================\n");
        }
    }

    // TAMPILKAN PENGHUNI
    public void tampilkanPenghuni() {
        List<PenghuniPanti> semua = dao.ambilSemuaPenghuni();
        if (semua.isEmpty()) {
            tampilkanDataKosong();
            return;
        }

        System.out.println("\n====================================================");
        System.out.println("============== PILIH KATEGORI PENGHUNI =============");
        System.out.println("====================================================");
        System.out.println("| 1. Tampilkan Seluruh Data Penghuni               |");
        System.out.println("| 2. Tampilkan Data Penghuni Mandiri               |");
        System.out.println("| 3. Tampilkan Data Penghuni Intensif              |");
        System.out.println("| 4. Kembali Ke Menu Utama                         |");
        System.out.println("====================================================");

        int pilihan = InputValidasi.bacaInt(scanner, "\nPilih Kategori (1-4): ");
        if (!InputValidasi.validasiPilihanMenu(pilihan, 4) || pilihan == 4) {
            return;
        }

        boolean adaData = false;

        System.out.println("\n====================================================");
        if (pilihan == 1) {
            System.out.println("=========== SELURUH DATA PENGHUNI PANTI ============");
        } else if (pilihan == 2) {
            System.out.println("============ DATA PENGHUNI PANTI MANDIRI ===========");
        } else {
            System.out.println("=========== DATA PENGHUNI PANTI INTENSIF ===========");
        }
        System.out.println("====================================================");

        for (PenghuniPanti p : semua) {
            boolean cocok = pilihan == 1
                    || (pilihan == 2 && p instanceof PenghuniMandiri)
                    || (pilihan == 3 && p instanceof PenghuniIntensif);

            if (cocok) {
                p.tampilkanInfo();
                System.out.println("====================================================");
                adaData = true;
            }
        }

        if (!adaData) {
            System.out.println("======== TIDAK ADA DATA UNTUK KATEGORI INI =========");
            System.out.println("====================================================");
        }
        System.out.println();
    }

    // HAPUS PENGHUNI
    public void hapusPenghuni() {
        if (dao.ambilSemuaPenghuni().isEmpty()) {
            tampilkanDataKosong();
            return;
        }

        int idTarget = InputValidasi.bacaInt(scanner, "Masukkan ID Penghuni yang Ingin Dihapus: ");
        if (!InputValidasi.validasiHapusPenghuni(idTarget, this)) {
            return;
        }

        if (dao.hapusPenghuni(idTarget)) {
            System.out.println("\n====================================================");
            System.out.println("========== DATA PENGHUNI BERHASIL DIHAPUS! =========");
            System.out.println("====================================================\n");
        }
    }

    // UPDATE DATA PENGHUNI
    public void updatePenghuni() {
        if (dao.ambilSemuaPenghuni().isEmpty()) {
            tampilkanDataKosong();
            return;
        }

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n====================================================");
            System.out.println("========= UPDATE DATA PENGHUNI RUMAH SENJA =========");
            System.out.println("====================================================");
            System.out.println("| 1. Update Umur Penghuni                          |");
            System.out.println("| 2. Update Kondisi Penghuni                       |");
            System.out.println("| 3. Update Informasi Khusus Penghuni Mandiri      |");
            System.out.println("| 4. Update Informasi Khusus Penghuni Intensif     |");
            System.out.println("| 5. Kembali Ke Menu Utama                         |");
            System.out.println("====================================================");

            int pilihan = InputValidasi.bacaInt(scanner, "\nPilih Menu (1-5): ");
            if (!InputValidasi.validasiPilihanMenu(pilihan, 5)) {
                continue;
            }

            switch (pilihan) {
                case 1, 2 -> {
                    int idTarget = InputValidasi.bacaInt(scanner, "Masukkan ID Penghuni: ");
                    PenghuniPanti p = dao.cariById(idTarget);
                    if (p == null) {
                        tampilkanIdTidakDitemukan();
                        break;
                    }

                    System.out.println("\nCatatan: Tekan [Enter] Jika Tidak Ingin Mengubah Data!");

                    int usiaBaru = p.getUsia();
                    String kondisiBaru = p.getKondisi();

                    if (pilihan == 1) {
                        Integer usiaInput = bacaUsiaOpsional();
                        if (usiaInput == null) {
                            tampilkanTidakAdaPerubahan();
                            break;
                        }
                        usiaBaru = usiaInput;
                    } else {
                        String kondisiInput = bacaKondisiOpsional();
                        if (kondisiInput == null) {
                            tampilkanTidakAdaPerubahan();
                            break;
                        }
                        kondisiBaru = kondisiInput;
                    }

                    if (dao.updateUsiaKondisi(idTarget, usiaBaru, kondisiBaru)) {
                        System.out.println("\n====================================================");
                        System.out.println("============ DATA BERHASIL DIPERBARUI! ============");
                        System.out.println("====================================================\n");
                    }
                }

                case 3 -> {
                    int idTarget = InputValidasi.bacaInt(scanner, "Masukkan ID Penghuni Mandiri: ");
                    PenghuniPanti p = dao.cariById(idTarget);

                    if (p instanceof PenghuniMandiri pm) {
                        System.out.println("\nCatatan: Tekan [Enter] Jika Tidak Ingin Mengubah Data!");
                        boolean berubah = false;

                        System.out.print("Masukkan Hobi Baru: ");
                        String hobiBaru = scanner.nextLine();
                        if (!hobiBaru.trim().isEmpty()) {
                            pm.setHobi(hobiBaru.trim());
                            berubah = true;
                        }

                        System.out.print("Masukkan Kegiatan Harian Baru: ");
                        String kegiatanBaru = scanner.nextLine();
                        if (!kegiatanBaru.trim().isEmpty()) {
                            pm.setKegiatanHarian(kegiatanBaru.trim());
                            berubah = true;
                        }

                        if (berubah && dao.updateMandiri(pm)) {
                            System.out.println("\n====================================================");
                            System.out.println("======= KEGIATAN HARIAN BERHASIL DIPERBARUI! =======");
                            System.out.println("====================================================\n");
                        } else if (!berubah) {
                            tampilkanTidakAdaPerubahan();
                        }
                    } else {
                        System.out.println("\n======================================================");
                        System.out.println("= ERROR: ID TIDAK DITEMUKAN / BUKAN PENGHUNI MANDIRI =");
                        System.out.println("======================================================\n");
                    }
                }

                case 4 -> {
                    int idTarget = InputValidasi.bacaInt(scanner, "Masukkan ID Penghuni Intensif: ");
                    PenghuniPanti p = dao.cariById(idTarget);

                    if (p instanceof PenghuniIntensif pi) {
                        System.out.println("\nCatatan: Tekan [Enter] Jika Tidak Ingin Mengubah Data!");
                        boolean berubah = false;

                        System.out.print("Masukkan Nama Perawat Baru: ");
                        String perawatBaru = scanner.nextLine();
                        if (!perawatBaru.trim().isEmpty()) {
                            pi.setNamaPerawat(perawatBaru.trim());
                            berubah = true;
                        }

                        System.out.print("Masukkan Jadwal Kontrol Medis Terbaru: ");
                        String kontrolBaru = scanner.nextLine();
                        if (!kontrolBaru.trim().isEmpty()) {
                            pi.setKontrolMedis(kontrolBaru.trim());
                            berubah = true;
                        }

                        System.out.print("Masukkan Jadwal Obat Baru: ");
                        String obatBaru = scanner.nextLine();
                        if (!obatBaru.trim().isEmpty()) {
                            pi.setJadwalObat(obatBaru.trim());
                            berubah = true;
                        }

                        if (berubah && dao.updateIntensif(pi)) {
                            System.out.println("\n====================================================");
                            System.out.println("====== INFORMASI TERBARU BERHASIL DIPERBARUI! ======");
                            System.out.println("====================================================\n");
                        } else if (!berubah) {
                            tampilkanTidakAdaPerubahan();
                        }
                    } else {
                        System.out.println("\n=====================================================");
                        System.out.println("= ERROR: ID TIDAK DITEMUKAN/BUKAN PENGHUNI INTENSIF =");
                        System.out.println("=====================================================\n");
                    }
                }

                case 5 -> berjalan = false;
            }
        }
    }

    // CARI PENGHUNI
    public void cariPenghuni() {
        if (dao.ambilSemuaPenghuni().isEmpty()) {
            tampilkanDataKosong();
            return;
        }

        System.out.println("\n====================================================");
        System.out.println("================ CARI DATA PENGHUNI ================");
        System.out.println("====================================================");
        System.out.println("| 1. Cari Berdasarkan Nama                         |");
        System.out.println("| 2. Cari Berdasarkan ID                           |");
        System.out.println("| 3. Kembali Ke Menu Utama                         |");
        System.out.println("====================================================");

        int pilihan = InputValidasi.bacaInt(scanner, "\nPilih Menu (1-3): ");
        if (!InputValidasi.validasiPilihanMenu(pilihan, 3) || pilihan == 3) {
            return;
        }

        if (pilihan == 1) {
            System.out.print("Masukkan Nama Penghuni Panti: ");
            cariPenghuni(scanner.nextLine());
        } else {
            int id = InputValidasi.bacaInt(scanner, "Masukkan ID Penghuni Panti: ");
            cariPenghuni(id);
        }
    }

    // OVERLOADING: cari berdasarkan nama
    public void cariPenghuni(String namaTarget) {
        boolean ditemukan = false;

        for (PenghuniPanti p : dao.ambilSemuaPenghuni()) {
            if (p.getNama().equalsIgnoreCase(namaTarget.trim())) {
                if (!ditemukan) {
                    tampilkanHeaderHasil();
                }
                p.tampilkanInfo();
                System.out.println("====================================================");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            tampilkanIdTidakDitemukan();
        }
        System.out.println();
    }

    // OVERLOADING: cari berdasarkan ID
    public void cariPenghuni(int idTarget) {
        PenghuniPanti p = dao.cariById(idTarget);

        if (p == null) {
            tampilkanIdTidakDitemukan();
        } else {
            tampilkanHeaderHasil();
            p.tampilkanInfo();
            System.out.println("====================================================");
        }
        System.out.println();
    }

    // JADWAL KUNJUNGAN KELUARGA
    public void kunjungiPenghuni() {
        if (dao.ambilSemuaPenghuni().isEmpty()) {
            tampilkanDataKosong();
            return;
        }

        int idTarget = InputValidasi.bacaInt(scanner, "Masukkan ID Penghuni yang Dikunjungi: ");
        PenghuniPanti p = dao.cariById(idTarget);

        if (p == null) {
            tampilkanIdTidakDitemukan();
            return;
        }

        String namaPengunjung;
        do {
            System.out.print("Nama Pengunjung: ");
            namaPengunjung = scanner.nextLine();
        } while (!InputValidasi.validasiNama(namaPengunjung));

        String hari = bacaHariKunjungan();
        String jam = bacaJamKunjungan();

        if (dao.tambahKunjungan(idTarget, namaPengunjung.trim(), hari, jam)) {
            p.prosesKunjungan(namaPengunjung.trim(), hari, jam);
        }
    }

    private String bacaHariKunjungan() {
        while (true) {
            System.out.print("Hari Kunjungan (Senin-Minggu): ");
            String input = scanner.nextLine().trim();
            for (String hari : hariValid) {
                if (hari.equalsIgnoreCase(input)) {
                    return hari;
                }
            }
            System.out.println("\n====================================================");
            System.out.println("====== ERROR: HARI HARUS SENIN SAMPAI MINGGU! ======");
            System.out.println("====================================================\n");
        }
    }

    private String bacaJamKunjungan() {
        while (true) {
            System.out.print("Jam Kunjungan (HH:mm, contoh 14:30): ");
            String input = scanner.nextLine().trim();
            if (input.matches("([01]\\d|2[0-3]):[0-5]\\d")) {
                return input;
            }
            System.out.println("\n====================================================");
            System.out.println("==== ERROR: FORMAT JAM HARUS HH:mm (MIS. 09:30) ====");
            System.out.println("====================================================\n");
        }
    }

    private Integer bacaUsiaOpsional() {
        while (true) {
            System.out.print("Update Usia Penghuni: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                return null;
            }
            try {
                int usia = Integer.parseInt(input);
                if (InputValidasi.validasiUsia(usia)) {
                    return usia;
                }
            } catch (NumberFormatException e) {
                System.out.println("\n====================================================");
                System.out.println("========= ERROR: INPUT HARUS BERUPA ANGKA! =========");
                System.out.println("====================================================\n");
            }
        }
    }

    private String bacaKondisiOpsional() {
        while (true) {
            System.out.print("Update Kondisi Terbaru Penghuni: ");
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                return null;
            }
            if (InputValidasi.validasiKondisi(input)) {
                return input.trim();
            }
        }
    }

    private void tampilkanDataKosong() {
        System.out.println("\n====================================================");
        System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
        System.out.println("====================================================\n");
    }

    private void tampilkanHeaderHasil() {
        System.out.println("\n====================================================");
        System.out.println("============== HASIL PENCARIAN PENGHUNI ============");
        System.out.println("====================================================");
    }

    private void tampilkanTidakAdaPerubahan() {
        System.out.println("\n====================================================");
        System.out.println("========= TIDAK ADA DATA YANG DIPERBARUI ===========");
        System.out.println("====================================================\n");
    }

    private void tampilkanIdTidakDitemukan() {
        System.out.println("\n====================================================");
        System.out.println("======= ERROR: DATA PENGHUNI TIDAK DITEMUKAN! ======");
        System.out.println("====================================================\n");
    }
}