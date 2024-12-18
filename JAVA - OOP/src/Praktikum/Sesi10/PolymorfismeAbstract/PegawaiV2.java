package Praktikum.Sesi10.PolymorfismeAbstract;

public abstract class PegawaiV2 {
    private String NIP;
    private String nama;
    public PegawaiV2(String nama, String NIP) {
        this.nama = nama;
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return NIP;
    }
    public abstract void kirimEmail(String to, String subjek, String isi);
}