package Praktikum.Sesi8.PegawaiInheritance;

public class Koki extends Pegawai{
    @Override
    public void menampilkan()
    {
        System.out.println("Nama : " + nama);
        System.out.println("Id Pegawai : " + id_pegawai);
        System.out.println("Gaji : " + gaji);
    }

    public void tugas(){
        System.out.println("Tugas : Memasak dan Membuat minuman");
        System.out.println("------------------------------------------------");
    }
}
