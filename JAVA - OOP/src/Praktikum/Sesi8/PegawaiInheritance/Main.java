package Praktikum.Sesi8.PegawaiInheritance;

public class Main {
    public static void main(String[] args) {
        // membuat sebuah object
        // "pegawai" merupakan class, lalu "Pegawai" merupakan objek yang akan dibuat, lalu "new pegawai();" merupakan konstruktor.
        Pegawai Pegawai = new Pegawai();
        Manajer Manajer = new Manajer();
        Kasir Kasir = new Kasir();
        Koki Koki = new Koki();
        Pelayan Pelayan = new Pelayan();
        Satpam Satpam = new Satpam();


        // memasukkan nilai variabel menggunakan objek.
        Manajer.nama = "sifa";
        Manajer.id_pegawai = 1;
        Manajer.gaji = "7 Juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = 2;
        Kasir.gaji = "1,2 Juta";

        Koki.nama = "Reza";
        Koki.id_pegawai = 3;
        Koki.gaji = "2 Juta";

        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = 4;
        Pelayan.gaji = "1,2 Juta";

        Satpam.nama = "Aldi";
        Satpam.id_pegawai = 2;
        Satpam.gaji = "1 Juta";
        // nilai tersebut akan dimasukkan kedalam variabel yang ada pada superclass.
        // memanggil fungsi pada superclass
        Pegawai.menampilkan();
        // menampilkan nilai variabel pada superclass dan memasukannya ke dalam fungsi yang ada pada class
        Manajer.menampilkan();
        Manajer.tugas();

        Kasir.menampilkan();
        Kasir.tugas();

        Koki.menampilkan();
        Koki.tugas();

        Pelayan.menampilkan();
        Pelayan.tugas();

        Satpam.menampilkan();
        Satpam.tugas();
    }
}
