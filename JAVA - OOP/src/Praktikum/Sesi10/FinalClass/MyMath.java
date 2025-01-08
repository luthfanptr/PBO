package Praktikum.Sesi10.FinalClass;

public final class MyMath { // pakai final atau tidak pun bisa
    public final double PT = 3.1416; // empat digit pecahan
    public final double luasLingkaran(double radius) {
        return PT * radius * radius;
    }

    public final double kelilingLingkaran(double radius) {
        return 2 * PT * radius;
    }

    public final double sin(double derajat) {
        return Math.sin(Math.toRadians(derajat));
    }

    public final double cos(double derajat) {
        return Math.cos(Math.toRadians(derajat));
    }

    public final double tan(double derajat) {
        return Math.tan(Math.toRadians(derajat));
    }

    public final double pangkat(double x, double y) {
        return Math.pow(x, y);
    }
}
