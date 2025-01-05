package Praktikum.Sesi12.Quiz2.No2;

interface Transportasi {
    void tampil();
    void setData();
    int getId();
}

class Gojek implements Transportasi {
    private int id;
    private int harga;

    public Gojek() {
        this.id = 0;
        this.harga = 0;
    }

    @Override
    public void tampil() {
        System.out.println("ID : " + id);
        System.out.println("Harga : " + harga);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setData() {
        this.id = 1;
        this.harga = 20000;
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
        super(); // memanggil konstruktor parent class
        this.setData();
        this.nama = "Pengguna " + id;
        this.jarak = 10;
        this.total = this.jarak * 2000 + super.getId() * 100;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama : " + nama);
        System.out.println("Jarak: " + jarak + " KM");
        System.out.println("Total: Rp " + total);
    }

    @Override
    public void setData() {
        super.setData();
        this.jarak = 10;
        this.nama = "Amorim";
        this.total = this.jarak * 2000;
    }
}

public class Main {
    public static void main(String[] args) {
        Bayar transaksi = new Bayar(1);
        transaksi.tampil();
    }
}