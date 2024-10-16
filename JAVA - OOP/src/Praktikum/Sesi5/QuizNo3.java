package Praktikum.Sesi5;

import java.util.Scanner;

public class QuizNo3 {
    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Masukkan angka: ");
            input = scan.nextInt();
        } while (input != 0);
        System.out.println("Program berhenti");
        scan.close();
    }
}
