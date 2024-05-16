package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca inputan user
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan nama kos
        System.out.print("Masukkan nama kos             : ");
        String nama = scanner.nextLine();

        // Meminta user untuk memasukkan harga kos per bulan
        System.out.print("Masukkan harga kos per tahun  : ");
        int harga = scanner.nextInt();

        // Membuat objek Kos baru dengan nama dan harga yang diberikan oleh user
        Kos kos1 = new Kos(nama, harga);

        // Mengubah nama dan harga kos menjadi nilai baru
        kos1.setNamaKos("Kos Pembangunan");
        kos1.setHargaKos(500000);

        // Menampilkan informasi tentang kos
        System.out.println("\n");
        System.out.println("Setelah Nama Kos Di Ubah");
        System.out.println("=================================");
        System.out.println("Informasi Kos   :");
        System.out.println("Nama Kos        : " + kos1.getNamaKos());
        System.out.println("Harga Kos       : " + kos1.getHargaKos() + " per tahun");
        System.out.println("=================================");

        // Memanggil metode tampilkanInfo() untuk menampilkan informasi kos yang sudah dibuat
        kos1.tampilkanInfo();
        System.out.println(kos1);
    }
}
