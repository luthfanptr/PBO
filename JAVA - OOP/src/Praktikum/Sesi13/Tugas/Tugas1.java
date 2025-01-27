package Praktikum.Sesi13.Tugas;

import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {
        // Membuat dua objek List untuk warna dan warnaDihapus
        List<String> warna = new ArrayList<>(Arrays.asList("MAGENTA", "RED", "WHITE", "BLUE", "CYAN"));
        List<String> warnaDihapus = new ArrayList<>(Arrays.asList("RED", "WHITE", "BLUE"));

        // Menghapus elemen yang terdapat di warnaDihapus dari warna
        warna.removeAll(warnaDihapus);

        // Menampilkan hasil akhir
        System.out.println("Warna : " + warna);
    }
}
