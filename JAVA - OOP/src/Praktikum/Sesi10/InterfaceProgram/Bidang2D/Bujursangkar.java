package Praktikum.Sesi10.InterfaceProgram.Bidang2D;

public class Bujursangkar implements Bidang2D {
    public double sisi;
    public double getKeliling() {
        return 4 * sisi;
    }
    public double getLuas() {
        return sisi * sisi;
    }
}
