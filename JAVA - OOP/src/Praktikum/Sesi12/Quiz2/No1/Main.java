package Praktikum.Sesi12.Quiz2.No1;

class Dosen {
    private String nik;
    private String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}

class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        super.view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        super.view();
        System.out.println("Fakultas: " + fakultas);
    }
}

public class Main {
    public static void main(String[] args) {
        Rektor rektor = new Rektor("111", "Dr. Tri", 2010);
        Dekan dekan = new Dekan("1234", "Dr. Bagus", "Teknik Informatika");
        Dosen dosen = new Dosen("1357", "Budi");

        System.out.println("Data Rektor:");
        rektor.viewRektor();

        System.out.println("\nData Dekan:");
        dekan.viewDekan();

        System.out.println("\nData Dosen:");
        dosen.view();
    }
}
