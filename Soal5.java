package SoalUkl;

import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===  Hitung Rata-rata Nilai Ujian ===");


        System.out.print("Masukkan jumlah siswa: ");
        while (!input.hasNextInt()) {
            System.out.println("Input tidak valid! Masukkan angka bulat.");
            System.out.print("Masukkan jumlah siswa: ");
            input.next();
        }
        int jumlahSiswa = input.nextInt();

        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0!");
            input.close();
            return;
        }

        double totalNilai = 0;

      
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");

            while (!input.hasNextDouble()) {
                System.out.println("Input tidak valid! Masukkan angka (0 - 100).");
                System.out.print("Masukkan nilai siswa ke-" + i + ": ");
                input.next();
            }

            double nilaiSiswa = input.nextDouble();

            if (nilaiSiswa < 0 || nilaiSiswa > 100) {
                System.out.println("Nilai harus berada di antara 0 dan 100!");
                input.close();
                return;
            }

            totalNilai += nilaiSiswa;
        }

        input.close();

        double rataRata = totalNilai / jumlahSiswa;
        System.out.printf("Rata-rata nilai dari %d siswa adalah: %.2f%n", jumlahSiswa, rataRata);
    }
}






