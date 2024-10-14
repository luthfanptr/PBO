package Praktikum.Sesi4;

import java.util.Scanner;
//import javax.print.DocFlavor.STRING;

public class LampuLaluLintas {
    public static void main(String[] args) {
        // membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        // Mengambil Input
        System.out.print("Inputkan Nama Warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;

            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;

            case "hijau":
                System.out.println("Lampu hijau, silakan jalan");
                break;
            default:
                System.out.println("Warna lampu salah");
                break;
        }
        scan.close();
    }

}
