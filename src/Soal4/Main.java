package Soal4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek ComplexFormula
        System.out.println("Pilih Mata Pelajaran (Fisika atau Matematika): ");         String subject = scanner.nextLine();
        ComplexFormula formula = new ComplexFormula(subject);

        // Periksa apakah perhitungan menggunakan rumus fisika atau matematika
        if (subject.equalsIgnoreCase("Fisika")) {
            System.out.println("Pilih rumus Fisika:");
            System.out.println("1. Energi Kinetik");
            System.out.println("2. Gaya Gravitasi");
            System.out.println("Ketik nomor yang ingin anda hitung dibawah ini:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("================================");
                    System.out.print("Masukkan massa (kg)      : ");
                    double mass = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan (m/s) : ");
                    double velocity = scanner.nextDouble();
                    double kineticEnergy = formula.calculateKineticEnergy(mass, velocity);
                    System.out.println("================================");
                    System.out.println("Hasil Perhitungan Energi Kinetik Adalah : " + kineticEnergy + " Joules");
                    break;
                case 2:
                    System.out.println("==================================");
                    System.out.print("Masukkan massa pertama (kg) : ");
                    double mass1 = scanner.nextDouble();
                    System.out.print("Masukkan massa kedua (kg)   : ");
                    double mass2 = scanner.nextDouble();
                    System.out.print("Masukkan jarak (m)          : ");
                    double distance = scanner.nextDouble();
                    double gravitationalForce = formula.calculateGravitationalForce(mass1, mass2, distance);
                    System.out.println("===================================");
                    System.out.println("Hasil Perhitungan Gaya Gravitasi Adalah : " + gravitationalForce + " Newtons");
                    break;
                default:
                    System.out.println("Info!! Pilihan yang anda tidak valid.");
            }
        } else if (subject.equalsIgnoreCase("Matematika")) {
            System.out.println("Pilih rumus Matematika:");
            System.out.println("1. Volume Tabung");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("Ketik nomor yang ingin anda hitung dibawah ini:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("=============================");
                    System.out.print("Masukkan jari-jari (r) : ");
                    double radiusCyl = scanner.nextDouble();
                    System.out.print("Masukkan tinggi (h)    : ");
                    double heightCyl = scanner.nextDouble();
                    double volumeCyl = formula.calculateCylinderVolume(radiusCyl, heightCyl);
                    System.out.println("=============================");
                    System.out.println("Hasil Perhitungan Volume Tabung Adalah : " + volumeCyl + " unit³");
                    break;
                case 2:
                    System.out.println("===============================");
                    System.out.print("Masukkan panjang sisi (s) : ");
                    double side = scanner.nextDouble();
                    double surfaceArea = formula.calculateCubeSurfaceArea(side);
                    System.out.println("===============================");
                    System.out.println("Hasil Perhitungan Luas Permukaan Kubus Adalah : " + surfaceArea + " unit²");
                    break;
                default:
                    System.out.println("Info!! Pilihan yang Anda pilih tidak valid.");
            }
        } else {
            System.out.println("Info!! Mata pelajaran yang Anda pilih tidak valid.");
        }
    }
}
