package SoalUkl;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        if (angka < 0) {
            System.out.println("Bilangan harus positif!");
        } else if (angka > 20) {
            System.out.println("Angka terlalu besar! Maksimal 20 agar tidak terjadi overflow.");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= angka; i++) {
                faktorial *= i;
            }

            System.out.println(angka + "! = " + faktorial);
        }

        input.close();
    }
}


 
