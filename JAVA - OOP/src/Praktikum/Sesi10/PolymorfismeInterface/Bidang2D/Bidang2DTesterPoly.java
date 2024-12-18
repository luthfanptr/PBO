package Praktikum.Sesi10.PolymorfismeInterface.Bidang2D;

public class Bidang2DTesterPoly {
    public static void main(String[] args) {
        Bidang2D bidang;
        Lingkaran l = new Lingkaran();
        l.radius = 10;
        Bujursangkar b = new Bujursangkar();
        b.sisi = 15;
        bidang = l; //bidang2d sebagai lingkaran
        System.out.println("Luas : " + bidang.getLuas() + " Keliling : " + bidang.getKeliling());
        bidang = b; //bidang2d sebagai bujursangkar
        System.out.println("Luas : " + bidang.getLuas() + " Keliling : " + bidang.getKeliling());

    }
}
