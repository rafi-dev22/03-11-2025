package SoalUkl;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.println("PERHITUNGAN BIAYA EKSPEDISI");

        System.out.println("Masukan Berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.println("Masukan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.println("Masukan panjang paket (cm): ");
        Double panjang = input.nextDouble();

        System.out.println("Masukan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.println("Masukan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        double biayaperkg;

        if (jarak <= 10) {
            biayaperkg = 4250;
        }else {
            biayaperkg = 6000;

            double biaya = berat * biayaperkg;

            if (volume > 100) {
                biaya+= 50000;
            }
            System.out.println();

            System.out.println("Hasil");
            System.out.println("vol paket :" + volume + " cm^3");
            System.out.println("harga :" + biayaperkg + " BiayaAnda");

            

        }
        }



    }
    

