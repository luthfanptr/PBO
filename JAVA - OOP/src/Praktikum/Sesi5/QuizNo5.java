package Praktikum.Sesi5;

import java.util.Scanner;

public class QuizNo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int batasBawah = input.nextInt();

        System.out.print("Masukkan batas atas: ");
        int batasAtas = input.nextInt();

        for(int i = batasBawah; i <= batasAtas; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        input.close();
    }
    
}
