package Praktikum.Sesi12.Quiz2.No2;

interface Transportasi {
    int getId();
    void tampil();
    void setData();
}

class Gojek implements Transportasi {
    private int harga;
    private int id;

    public Gojek() {
        this.harga = 0;
        this.id = 0;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Harga: " + harga);
    }

    @Override
    public void setData() {
        // Contoh set data
        this.id = 1;
        this.harga = 15000;
    }
}

class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    public Bayar() {
        this.jarak = 0;
        this.total = 0;
        this.nama = "";
    }

    public Bayar(int id) {
        super();
        this.setData(); // Set data dari Gojek
        this.nama = "Pengguna " + id;
        this.jarak = 10; // Contoh jarak default
        this.total = this.jarak * 2000 + super.getId() * 100;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total: Rp " + total);
    }

    @Override
    public void setData() {
        super.setData();
        this.jarak = 10;
        this.nama = "Anonim";
        this.total = this.jarak * 2000;
    }
}

public class Main {
    public static void main(String[] args) {
        Bayar transaksi = new Bayar(1);
        transaksi.tampil();
    }
}
