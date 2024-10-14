package Praktikum.Sesi4;

import java.util.Scanner;

public class RestoranTugas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] makanan = { "Ayam Bakar", "Ayam Goreng", "Ikan Bakar", "Bebek Goreng" };
        int[] hargaMakan = { 20_000, 17_000, 15_000, 25_000 };

        String[] minuman = { "Es Teh", "Es Jeruk", "Teh Hangat", "Air Putih" };
        int[] hargaMinum = { 3_000, 5_000, 3_000, 1_500 };

        String[] dessert = { "Puding", "Coklat", "Kue" };
        int[] hargaDsrt = { 5_000, 15_000, 25_000 };

        int i, totalHarga = 0;
        int Menu, Jumlah;
        StringBuilder struk = new StringBuilder();
        boolean lanjut = true;

        do {
            System.out.println("\nSelamat Datang Di Restoran Mini Luthfan");
            System.out.println("========================================");
            System.out.println("Silakan Pilih Menu:");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Dessert");
            System.out.println("4. Keluar Dari Program");
            System.out.print("Pilihan: ");
            int Pilihan = scan.nextInt();

            switch (Pilihan) {
                case 1:
                    System.out.println("\nBerikut Adalah Menu Makanan yang Tersedia");
                    System.out.println("===========================================");
                    for (i = 0; i < makanan.length; i++) {
                        System.out.println((i + 1) + ". " + makanan[i] + " - " + hargaMakan[i]);
                    }
                    System.out.print("Masukkan Nomer Menu Yang Ingin Anda Pilih: ");
                    Menu = scan.nextInt() - 1;

                    if (Menu < 0 || Menu >= makanan.length) {
                        System.out.println("Pilihan tidak valid, silakan coba lagi");
                        break;
                    }

                    System.out.print("\nMasukkan Jumlah Yang Ingin Di Beli: ");
                    Jumlah = scan.nextInt();

                    // struk
                    totalHarga += hargaMakan[Menu] * Jumlah;
                    struk.append(makanan[Menu])
                            .append(" x")
                            .append(Jumlah)
                            .append(" - Rp ")
                            .append(hargaMakan[Menu] * Jumlah)
                            .append("\n");
                    break;

                case 2:
                    System.out.println("\nBerikut Adalah Menu Minuman yang Tersedia");
                    System.out.println("===========================================");
                    for (i = 0; i < minuman.length; i++) {
                        System.out.println((i + 1) + ". " + minuman[i] + " - " + hargaMinum[i]);
                    }
                    System.out.print("Masukkan Nomer Menu Yang Ingin Anda Pilih: ");
                    Menu = scan.nextInt() - 1;

                    if (Menu < 0 || Menu >= minuman.length) {
                        System.out.println("Pilihan tidak valid, silakan coba lagi");
                        break;
                    }

                    System.out.print("\nMasukkan Jumlah Yang Ingin Di Beli: ");
                    Jumlah = scan.nextInt();

                    // struk
                    totalHarga += hargaMinum[Menu] * Jumlah;
                    struk.append(minuman[Menu])
                            .append(" x")
                            .append(Jumlah)
                            .append(" - Rp ")
                            .append(hargaMinum[Menu] * Jumlah)
                            .append("\n");
                    break;

                case 3:
                    System.out.println("\nBerikut Adalah Menu Dessert yang Tersedia");
                    System.out.println("===========================================");
                    for (i = 0; i < dessert.length; i++) {
                        System.out.println((i + 1) + ". " + dessert[i] + " - " + hargaDsrt[i]);
                    }
                    System.out.print("Masukkan Nomer Menu Yang Ingin Anda Pilih: ");
                    Menu = scan.nextInt() - 1;

                    if (Menu < 0 || Menu >= dessert.length) {
                        System.out.println("Pilihan tidak valid, silakan coba lagi");
                        break;
                    }

                    System.out.print("\nMasukkan Jumlah Yang Ingin Di Beli: ");
                    Jumlah = scan.nextInt();

                    // struk
                    totalHarga += hargaDsrt[Menu] * Jumlah;
                    struk.append(dessert[Menu])
                            .append(" x")
                            .append(Jumlah)
                            .append(" - Rp ")
                            .append(hargaDsrt[Menu] * Jumlah)
                            .append("\n");
                    break;

                case 4:
                    System.out.println("Terima Kasih Telah Menggunakan Program Ini.\nSelamat Tinggal");
                    scan.close();
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid. Coba Lagi");
                    break;
            }
            System.out.print("Apakah Ada Menu Yang Ingin Dipesan Lagi? [Y/N]: ");
            char pil = scan.next().charAt(0);
            lanjut = Character.toUpperCase(pil) == 'Y';

        } while (lanjut);

        if (totalHarga > 0) {
            System.out.println("===================================");
            System.out.println("\tStruk Pembelian\t");
            System.out.println("===================================");
            System.out.print(struk.toString());
            System.out.println("-----------------------------------");
            System.out.println("Total Harga: Rp " + totalHarga);
            System.out.println("===================================");
        } else {
            System.out.println("Tidak ada transaksi yang dilakukan");
        }
        System.out.println("Terima Kasih telah berkunjung di Restoran Luthfan.\nSampai Jumpa Lagi!");

    }

}