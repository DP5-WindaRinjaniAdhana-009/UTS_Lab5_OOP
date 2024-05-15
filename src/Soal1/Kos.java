package Soal1;


class Kos {
    private String namaKos;
    private int hargaKos;

    public Kos(String nama, int harga) {
        namaKos = nama;
        hargaKos = harga;
    }

    public void setNamaKos(String nama) {
        namaKos = nama;
    }

    public String getNamaKos() {
        return namaKos;
    }

    public void setHargaKos(int harga) {
        hargaKos = harga;
    }

    public int getHargaKos() {
        return hargaKos;
    }

}
