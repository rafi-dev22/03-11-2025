package SoalUkl;

import java.util.Scanner;

public class Soal4 {

    // Fungsi untuk menghitung volume tabung
    // Rumus: volume = π * r^2 * h
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, h;

        System.out.println("=== Yok hitung Volume Tabung ===");

        
        System.out.print("Masukkan jari-jari alas (r): ");
        while (!input.hasNextDouble()) {
            System.out.print("Masukkan jari-jari alas (r): ");
            input.next(); 
        }
        r = input.nextDouble();

        
        System.out.print("Masukkan tinggi tabung (h): ");
        while (!input.hasNextDouble()) {
            System.out.print("Masukkan tinggi tabung (h): ");
            input.next();
        }
        h = input.nextDouble();


        if (r < 0 || h < 0) {
            System.out.println("Jari-jari dan tinggi harus bernilai positif!");
        } else {
            double volume = hitungVolumeTabung(r, h);
            System.out.printf("Volume tabung dengan r = %.2f dan h = %.2f adalah %.4f\n", r, h, volume);
        }

        input.close();
    }
}

