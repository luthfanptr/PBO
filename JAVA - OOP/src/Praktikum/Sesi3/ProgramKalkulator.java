package Praktikum.Sesi3;

import java.util.Scanner;

public class ProgramKalkulator {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("||\tProgram Kalkulator\t||");
        System.out.println("||------------------------------||");
        System.out.println("||\tLuthfan Putra Prakarsa\t||");
        System.out.println("||==============================||\n");

        Scanner inputUser = new Scanner(System.in);
        float a, b;
        String Opsi;

        do {

            System.out.print("\nMasukkan angka pertama: ");
            a = inputUser.nextFloat();

            System.out.print("Masukkan angka kedua: ");
            b = inputUser.nextFloat();

            System.out.println("\nPilih Operator yang ingin dipakai (1-4):");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (x)");
            System.out.println("4. Pembagian (:)");
            System.out.print("Pilihan : ");
            int Pilihan = inputUser.nextInt();

            float hasil = 0;

            switch (Pilihan) {
                case 1:
                    hasil = a + b;
                    System.out.println("\nAnda memilih operasi penjumlahan");
                    System.out.println("Hasilnya adalah: " + hasil);
                    break;

                case 2:
                    hasil = a - b;
                    System.out.println("\nAnda memilih operasi pengurangan");
                    System.out.println("Hasilnya adalah: " + hasil);
                    break;

                case 3:
                    hasil = a * b;
                    System.out.println("\nAnda memilih operasi perkalian");
                    System.out.println("Hasilnya adalah: " + hasil);
                    break;

                case 4:
                    if (b != 0) {
                        hasil = a / b;
                        System.out.println("\nAnda memilih operasi pembagian");
                        System.out.println("Hasilnya adalah: " + hasil);
                    } else {
                        System.out.println("Tidak dapat membagi dengan Nol");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia, silakan coba lagi");
                    break;
            }
            System.out.print("Ingin kembali melanjutkan program? [Y/N]: ");
            Opsi = inputUser.next();

        } while (Opsi.equalsIgnoreCase("Y"));
        System.out.println("Terima kasih telah menggunakan program ini\n Selamat tinggal");
        inputUser.close();
    }
}