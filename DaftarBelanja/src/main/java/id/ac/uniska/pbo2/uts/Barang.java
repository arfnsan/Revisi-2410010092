//Nama : Muhammad Arifin Ikhsan | NPM : 2410010092

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author arsan
 */
public class Barang {
    
    private String nama;
    private Kategori kategori;
    private long harga;
    private int jumlah;
    
    public Barang(String nama, Kategori kategori,
                  long harga, int jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public long getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public long getSubtotal() {
        return harga * jumlah;
    }
}
