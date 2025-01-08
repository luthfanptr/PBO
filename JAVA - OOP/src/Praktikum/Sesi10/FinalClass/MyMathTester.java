package Praktikum.Sesi10.FinalClass;

public class MyMathTester {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        System.out.println("PI : " + m.PT);
        // m.PI = 25.0; //pasti error
        System.out.println("Luas Lingkaran : " + m.luasLingkaran(10));
        System.out.println("Keliling Lingkaran : " + m.kelilingLingkaran(10));
        System.out.println("Sin(30) : " + m.sin(30));
        System.out.println("Cos(30) : " + m.cos(30));
        System.out.println("Tan(30) : " + m.tan(30));
        System.out.println("2^8 : " + m.pangkat(2, 8));
    }
}
