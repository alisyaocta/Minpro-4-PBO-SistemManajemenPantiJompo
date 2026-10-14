package model;

public class PenghuniIntensif extends PenghuniPanti implements KunjunganKeluarga {

    // ENCAPSULATION
    private String namaPerawat;
    private String kontrolMedis;
    private String jadwalObat;
    
    private static final double biayaDasar = 5_000_000;
    private static final int durasiKunjungan = 60;

    // CONSTRUCTOR
    public PenghuniIntensif(int idPenghuni, String nama, int usia, String noTelp,
            String jenisKelamin, String kondisi, String namaPerawat, String kontrolMedis, String jadwalObat) {
        super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi);
        this.namaPerawat = namaPerawat;
        this.kontrolMedis = kontrolMedis;
        this.jadwalObat = jadwalObat;
    }

    // GETTER
    public String getNamaPerawat() {
        return namaPerawat;
    }
    public String getKontrolMedis() {
        return kontrolMedis;
    }
    public String getJadwalObat() {
        return jadwalObat;
    }

    // SETTER
    public void setNamaPerawat(String namaPerawat) {
        this.namaPerawat = namaPerawat;
    }
    public void setKontrolMedis(String kontrolMedis) {
        this.kontrolMedis = kontrolMedis;
    }
    public void setJadwalObat(String jadwalObat) {
        this.jadwalObat = jadwalObat;
    }

    // OVERRIDING
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Perawat          : " + namaPerawat);
        System.out.println("Jadwal Kontrol Medis  : " + kontrolMedis);
        System.out.println("Jadwal Pemberian Obat : " + jadwalObat);
    }

    // INTERFACE 
    @Override
    public void prosesKunjungan(String namaPengunjung, String hari, String jam) {
        System.out.println("\n====================================================");
        System.out.println("============= KUNJUNGAN PENGHUNI INTENSIF ==========");
        System.out.println("====================================================");
        System.out.println("Pengunjung            : " + namaPengunjung);
        System.out.println("Mengunjungi           : " + getNama());
        System.out.println("Hari Kunjungan        : " + hari);
        System.out.println("Waktu                 : " + jam + " - " + hitungJamSelesai(jam));
        System.out.println("Lokasi                : Ruang Perawatan");
        System.out.println("Durasi Maksimal       : " + getDurasiKunjunganMenit() + " Menit");
        System.out.println("Pendamping            : " + namaPerawat);
        System.out.println("Catatan               : Wajib izin perawat dan jaga ketenangan");
        System.out.println("====================================================\n");
    }

    @Override
    public int getDurasiKunjunganMenit() {
        return durasiKunjungan;
    }

    // ABSTRACT METHOD
    @Override
    public String getKategori() {
        return "Penghuni Intensif";
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