//Nama : Muhammad Arifin Ikhsan | NPM : 2410010092

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author arsan
 */
public enum Kategori {
    ALAT_TULIS("Alat Tulis"),
    MAKANAN("Makanan"),
    MINUMAN("Minuman"),
    LAINNYA("Lainnya");

    private final String nama;

    Kategori(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }
}
