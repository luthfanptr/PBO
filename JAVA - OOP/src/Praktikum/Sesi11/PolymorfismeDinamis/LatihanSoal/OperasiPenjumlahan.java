package Praktikum.Sesi11.PolymorfismeDinamis.LatihanSoal;

class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a + b;
    }

    @Override
    protected void tampil() {
        System.out.println("Penjumlahan: " + a + " + " + b + " = " + c);
    }
}