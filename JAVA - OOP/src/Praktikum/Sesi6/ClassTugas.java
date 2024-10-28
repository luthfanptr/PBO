package Praktikum.Sesi6;

class Buku {
    String judul;
    String penulis;
    int tahunTerbit;
    double harga;

    // Konstruktor
    Buku(String judul, String penulis, int tahunTerbit, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    void cekDiskon() {
        if (harga > 100000) {
            System.out.println("\nBuku ini mendapatkan potongan diskon 10%");
            double Diskon = harga * 0.1;
            double hargaDiskon = harga - Diskon;
            System.out.println("----------------------------------------");
            System.out.println("Harga Setelah Diskon:");
            System.out.println("Rp. " + hargaDiskon);
        } else {
            System.out.println("\nTidak tersedia diskon untuk buku ini");
        }
    }

    void printBuku() {
        System.out.println("Judul Buku : " + this.judul);
        System.out.println("Penulis Buku : " + this.penulis);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("Harga Buku : Rp. " + this.harga);
    }
}

public class ClassTugas {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005, 150000);
        Buku buku2 = new Buku("Negeri 5 Menara", "A.Fuadi", 2009, 90000);

        buku1.printBuku();
        buku1.cekDiskon();
        System.out.println("\n========================================\n");
        buku2.printBuku();
        buku2.cekDiskon();

    }
}