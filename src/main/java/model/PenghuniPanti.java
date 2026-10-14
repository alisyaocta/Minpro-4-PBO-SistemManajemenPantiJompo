package model;

public abstract class PenghuniPanti implements KunjunganKeluarga{

    // ENCAPSULATION
    private final int idPenghuni;
    private final String nama;
    private int usia;
    private String noTelp;
    private final String jenisKelamin;
    private String kondisi;

    // CONSTRUCTOR
    public PenghuniPanti(int idPenghuni, String nama, int usia, String noTelp,
                         String jenisKelamin, String kondisi) {
        this.idPenghuni = idPenghuni;
        this.nama = nama;
        this.usia = usia;
        this.noTelp = noTelp;
        this.jenisKelamin = jenisKelamin;
        this.kondisi = kondisi;
    }

    // GETTER
    public final int getIdPenghuni() { return idPenghuni; }
    public final String getNama() { return nama; }
    public int getUsia() { return usia; }
    public String getNoTelp() { return noTelp; }
    public final String getJenisKelamin() { return jenisKelamin; }
    public String getKondisi() { return kondisi; }

    // SETTER
    public void setUsia(int usia) { this.usia = usia; }
    public void setNoTelp(String noTelp) { this.noTelp = noTelp; }
    public void setKondisi(String kondisi) { this.kondisi = kondisi; }

    // OVERRIDING 
    public void tampilkanInfo() {
        System.out.println("ID Penghuni           : " + idPenghuni);
        System.out.println("Kategori Penghuni     : " + getKategori());
        System.out.println("Nama Penghuni         : " + nama);
        System.out.println("Usia Penghuni         : " + usia + " Tahun");
        System.out.println("Jenis Kelamin         : " + jenisKelamin);
        System.out.println("No.Telepon Keluarga   : " + noTelp);
        System.out.println("Kondisi Kesehatan     : " + kondisi);
        System.out.println("Biaya Bulanan         : Rp" + String.format("%,.0f", hitungBiayaBulanan()));
    }
    
    public double hitungBiayaBulanan(int jumlahBulan) {
        return hitungBiayaBulanan() * jumlahBulan;
    }

    // ABSTRACT METHOD
    public abstract String getKategori();
    public abstract double hitungBiayaBulanan();
}