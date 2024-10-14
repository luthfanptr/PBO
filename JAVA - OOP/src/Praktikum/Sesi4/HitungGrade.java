package Praktikum.Sesi4;

import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        // Membuat variabel dari scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        // Mengambil input
        System.out.print("Inputan Nilai: ");
        nilai = scan.nextInt();
        // Menghitung gradenya
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }
        // cetak hasil
        System.out.println("Grade : " + grade);
        scan.close();
    }

}
