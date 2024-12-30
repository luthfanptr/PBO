package Praktikum.Sesi12.Quiz2.No1;

public class Main {
    public static void main(String[] args) {
        Rektor rektor = new Rektor("111", "Dr. Tri", 2010);
        Dekan dekan = new Dekan("1234", "Dr. Bagus", "Teknik Informatika");
        Dosen dosen = new Dosen("1357", "Budi");

        System.out.println("Data Rektor:");
        rektor.viewRektor();

        System.out.println("\nData Dekan:");
        dekan.viewDekan();

        System.out.println("\nData Dosen:");
        dosen.view();
    }
}
