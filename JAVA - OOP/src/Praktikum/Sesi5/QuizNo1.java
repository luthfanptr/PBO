package Praktikum.Sesi5;

import java.util.Scanner;

public class QuizNo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka: ");
        angka = scan.nextInt();
        if (angka == 0) {
            System.out.println("Angka adalah nol");
        } else if (angka > 0) {
            System.out.println("Angka adalah positif");
        } else {
            System.out.println("Angka adalah negatif");
        }
        scan.close();
    }

}
