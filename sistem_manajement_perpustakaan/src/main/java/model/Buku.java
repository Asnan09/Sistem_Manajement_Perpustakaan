package com.mycompany.sistem_manajement_perpustakaan.model;

public class Buku {
    private String judul;     // Menyimpan judul buku
    private String penulis;   // Menyimpan nama penulis
    private int tahunTerbit;  // Menyimpan tahun terbit

    // Constructor untuk menginisialisasi objek Buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}

