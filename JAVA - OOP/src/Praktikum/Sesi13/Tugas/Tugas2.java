package Praktikum.Sesi13.Tugas;

import java.util.*;

class Mahasiswa {
    private String nrp;
    private String nama;
    private float nilai;

    public Mahasiswa(String nrp, String nama, float nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    public float getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa{nrp='" + nrp + "', nama='" + nama + "', nilai=" + nilai + "}";
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        // Membuat Queue untuk menyimpan data Mahasiswa
        Queue<Mahasiswa> queueMahasiswa = new LinkedList<>();
        Random random = new Random();

        // Menambahkan 10 data Mahasiswa dengan nilai random
        for (int i = 1; i <= 10; i++) {
            String nrp = "NRP" + i;
            String nama = "Nama" + i;
            float nilai = 60 + random.nextFloat() * 40; // Random nilai antara 60-100
            queueMahasiswa.add(new Mahasiswa(nrp, nama, nilai));
        }

        // Menampilkan data Mahasiswa sebelum diurutkan
        System.out.println("Data Mahasiswa sebelum diurutkan:");
        queueMahasiswa.forEach(System.out::println);

        // Memindahkan data dari Queue ke List untuk pengurutan
        List<Mahasiswa> listMahasiswa = new ArrayList<>(queueMahasiswa);

        // Mengurutkan data berdasarkan nilai menggunakan Comparator
        listMahasiswa.sort(Comparator.comparing(Mahasiswa::getNilai).reversed());

        // Menampilkan data Mahasiswa setelah diurutkan
        System.out.println("\nData Mahasiswa setelah diurutkan berdasarkan nilai:");
        listMahasiswa.forEach(System.out::println);
    }
}
