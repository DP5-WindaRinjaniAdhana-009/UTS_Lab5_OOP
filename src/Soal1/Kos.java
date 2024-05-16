package Soal1;

// Class Kos
class Kos {
    // Variabel instance
    private String namaKos;
    private int hargaKos;

    // Constructor
    public Kos(String nama, int harga) {
        namaKos = nama;
        hargaKos = harga;
    }

    // Method setter untuk namaKos
    public void setNamaKos(String nama) {
        namaKos = nama;
    }

    // Method getter untuk namaKos
    public String getNamaKos() {
        return namaKos;
    }

    // Method setter untuk hargaKos
    public void setHargaKos(int harga) {
        hargaKos = harga;
    }

    // Method getter untuk hargaKos
    public int getHargaKos() {
        return hargaKos;
    }

    // Method Overloading: menampilkan informasi kos
    public void tampilkanInfo() {
        System.out.println("\n");
        System.out.println("Hasil akhir");
        System.out.println("=================================");
        System.out.println("Nama Kos    : " + namaKos);
        System.out.println("Harga Kos   : " + hargaKos + " per tahun");
        System.out.println("=================================");
    }

    // Method Overriding: menampilkan pesan selamat datang
    @Override
    public String toString() {
        return "Selamat datang di " + namaKos;
    }
}
