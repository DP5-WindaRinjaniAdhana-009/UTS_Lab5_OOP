package Soal4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek ComplexFormula
        System.out.println("Pilih Mata Pelajaran (Fisika atau Matematika): ");
        String subject = scanner.nextLine();
        ComplexFormula formula = new ComplexFormula(subject);

        // Input nilai-nilai untuk perhitungan rumus
        System.out.print("Masukkan nilai 1: ");
        double value1 = scanner.nextDouble();
        System.out.print("Masukkan nilai 2: ");
        double value2 = scanner.nextDouble();

        // Membuat objek scanner baru untuk membersihkan newline
        scanner.nextLine();

    }
}
