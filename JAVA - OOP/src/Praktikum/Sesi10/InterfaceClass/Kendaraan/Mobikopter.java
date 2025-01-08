package Praktikum.Sesi10.InterfaceClass.Kendaraan;

public class Mobikopter implements Mobil, Helikopter {
    private String nama;
    Mobikopter(String nama){
        this.nama = nama;
    }

    public void berjalan(){
        System.out.println(nama + " sedang berjalan");
    }

    public void terbang(){
        System.out.println(nama + " sedang terbang");
    }
}
