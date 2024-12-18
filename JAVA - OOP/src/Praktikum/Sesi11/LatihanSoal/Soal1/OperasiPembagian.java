package Praktikum.Sesi11.LatihanSoal.Soal1;

public class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a / b;
    }

    @Override
    protected void tampil() {
        System.out.println("Penjumlahan: " + a + " : " + b + " = " + c);
    }
}
