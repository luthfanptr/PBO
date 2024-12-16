package Praktikum.Sesi11.PolymorfismeDinamis.LatihanSoal;

public class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a * b;
    }

    @Override
    protected void tampil() {
        System.out.println("Penjumlahan: " + a + " x " + b + " = " + c);
    }
}
