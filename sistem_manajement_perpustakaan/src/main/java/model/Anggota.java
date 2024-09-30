package com.mycompany.sistem_manajement_perpustakaan.model;

import java.util.ArrayList;

public class Anggota {
    private String nama;
    private String nomorAnggota;
    private ArrayList<Buku> bukuDipinjam;

    public Anggota(String nama, String nomorAnggota) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.bukuDipinjam = new ArrayList<>();
    }

    public void pinjamBuku(Buku buku) {
        this.bukuDipinjam.add(buku);
    }

    public String getNama() {
        return nama;
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }

    public ArrayList<Buku> getBukuDipinjam() {
        return bukuDipinjam;
    }
}
