package Praktikum.Sesi6;

class Mobil { //! Tanpa Return
    String aktifitas;
    String warna;
    int kecepatan;

    public Mobil() {
        // Nilai default jika diperlukan
        this.aktifitas = "belum diketahui";
        this.warna = "belum diketahui";
        this.kecepatan = 0;
    }

    public Mobil(String aktifitas, String warna, int kecepatan) {
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void cekKecepatan() {
        if (kecepatan == 0) {
            aktifitas = "parkir";
        }
    }

    void cetakAtribut() {
        System.out.println("Aktifitas = " + aktifitas);
        System.out.println("warna = " + warna);
        System.out.println("Kecepatan = " + kecepatan);

    }
}

public class ClassMobil {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();//klo gamau nambah nilai default hrs declare param disini
        mobilku.kecepatan = 0;
        mobilku.warna = "merah";
        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }
}