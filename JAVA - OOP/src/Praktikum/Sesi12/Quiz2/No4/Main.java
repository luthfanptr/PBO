package Praktikum.Sesi12.Quiz2.No4;

abstract class Animal {
    private String nama;
    private String sifat;
    private int ukuran;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }
}

// Interface AVES
interface Aves {
    void setJenisAves(String jenisAves);

    String getJenisAves();

    void setBisaTerbang(boolean bisaTerbang);

    boolean getBisaTerbang();
}

final class Mamalia extends Animal {
    private String jalan;
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    public Mamalia() {

    }

    public Mamalia(String nama) {
        setNama(nama);
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getJalan() {
        return jalan;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }
}

// Child Class

class Ayam extends Animal implements Aves {
    private String jenisAyam;
    private String adu;
    private boolean bisaDiadu;
    private String jenisAves;
    private boolean bisaTerbang;

    public Ayam() {} //Konstruktor default

    public Ayam(String nama, int ukuran) {
        setNama(nama);
        setUkuran(ukuran);
    }

    public void setAdu(String adu) {
        this.adu = adu; 
    }

    public String getAdu() {
        return adu;
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu){
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }

    @Override
    public void setJenisAves(String jenisAves){
        this.jenisAves = jenisAves;
    }

    @Override
    public String getJenisAves() {
        return jenisAves;
    } 

    @Override
    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    @Override
    public boolean getBisaTerbang() {
        return bisaTerbang;
    }
}

class Merpati extends Animal implements Aves {
    private String jenisAves;
    private boolean bisaTerbang;

    public Merpati(){} //Konstruktor default tanpa parameter

    public Merpati(String nama, int ukuran) {
        setNama(nama);
        setUkuran(ukuran);
    }

    @Override 
    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    @Override
    public String getJenisAves(){
        return jenisAves;
    }

    @Override
    public void setBisaTerbang(boolean bisaTerbang){
        this.bisaTerbang = bisaTerbang;
    }

    @Override
    public boolean getBisaTerbang(){
        return bisaTerbang;
    }
}

public class Main {
    public static void main(String[] args) {
        Mamalia mamalia = new Mamalia("Sapi");
        mamalia.setJalan("Berjalan di darat");
        mamalia.setBisaJalan(true);
        mamalia.setJumlahKaki(4);
        mamalia.setJenisMamalia("Herbivora");

        System.out.println("Mamalia " + mamalia.getNama());
        System.out.println("Jalan: " + mamalia.getJalan());
        System.out.println("Bisa Jalan: " + mamalia.getBisaJalan());
        System.out.println("Jumlah Kaki: " + mamalia.getJumlahKaki());
        System.out.println("Jenis Mamalia: " + mamalia.getJenisMamalia());

        System.out.println("\n=======================================");
        Ayam ayam = new Ayam("Ayam Kampung", 15);
        ayam.setJenisAves("Unggas");
        ayam.setBisaTerbang(false);
        ayam.setJenisAyam("Pedaging");
        ayam.setBisaDiadu(false);
        ayam.setAdu("Tidak untuk diadu");


        System.out.println("\nAyam: " + ayam.getNama());
        System.out.println("Jenis Aves: " + ayam.getJenisAves());
        System.out.println("Bisa Terbang: " + ayam.getBisaTerbang());
        System.out.println("Jenis Ayam: " + ayam.getJenisAyam());
        System.out.println("Bisa Diadu: " + ayam.getBisaDiadu());
        System.out.println("Adu: " + ayam.getAdu());

        System.out.println("\n=======================================");
        Merpati merpati = new Merpati("Merpati Putih", 10);
        merpati.setJenisAves("Burung");
        merpati.setBisaTerbang(true);

        System.out.println("\nMerpati: " + merpati.getNama());
        System.out.println("Jenis Aves: " + merpati.getJenisAves());
        System.out.println("Bisa Terbang: " + merpati.getBisaTerbang());

    }
}
