package Praktikum.Sesi4;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        // deklarasi variabel dan Scanner
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);
        // mengambil input
        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();
        // proses
        if (kartu.equalsIgnoreCase("ya")){
            if (belanjaan > 500_000){
                diskon = 50_000;
            }else if ( belanjaan > 100_000){
                diskon = 15_000;
            }else {
                diskon = 0;
            }
        }else{
            if (belanjaan > 100_000){
                diskon = 5_000;
            }else {
                diskon = 0;
            }
        }
        // total yang harus dibayar
        bayar = belanjaan - diskon;
        // output
        System.out.println("Total Bayar: Rp " + bayar);
        scan.close();
    }
    
}
