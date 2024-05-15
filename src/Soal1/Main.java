package Soal1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama kos: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan harga kos per bulan: ");
        int harga = scanner.nextInt();

        Kos kos1 = new Kos(nama, harga);

        kos1.setNamaKos("Kos Indah");
        kos1.setHargaKos(500000);
    }
}

