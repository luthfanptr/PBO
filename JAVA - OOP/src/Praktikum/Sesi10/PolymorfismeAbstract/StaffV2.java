package Praktikum.Sesi10.PolymorfismeAbstract;

public class StaffV2 extends PegawaiV2 {
    private String bagian;
    public StaffV2(String nama, String NIP, String bagian) {
        super(nama, NIP);
        setBagian(bagian);
    }

    public void setBagian(String namabagian) {
        bagian = namabagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void kirimEmail(String to, String subjek, String isi) {
        System.out.println("Kirim ke " + to + " dengan judul " + 
        subjek + " dengan isi  : " + isi);
    }
}
