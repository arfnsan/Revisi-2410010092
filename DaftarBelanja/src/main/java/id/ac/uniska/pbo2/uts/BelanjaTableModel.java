//Nama : Muhammad Arifin Ikhsan | NPM : 2410010092

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arsan
 */
public class BelanjaTableModel extends AbstractTableModel {
    
    private final String[] kolom = {
        "Nama Barang",
        "Kategori",
        "Harga",
        "Jumlah",
        "Subtotal"
    };
    
    private final List<Barang> daftarBarang = new ArrayList<>();

    private final NumberFormat rupiah =
        NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    public BelanjaTableModel() {
        rupiah.setMaximumFractionDigits(0);
        rupiah.setMinimumFractionDigits(0);
    }

    @Override
    public int getRowCount() {
        return daftarBarang.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Barang barang = daftarBarang.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> barang.getNama();
            case 1 -> barang.getKategori();
            case 2 -> rupiah.format(barang.getHarga());
            case 3 -> barang.getJumlah();
            case 4 -> rupiah.format(barang.getSubtotal());
            default -> null;
        };
    }

    public void tambahBarang(Barang barang) {
        int baris = daftarBarang.size();

        daftarBarang.add(barang);

        fireTableRowsInserted(baris, baris);
    }

    public long getTotal() {
        long total = 0;

        for (Barang barang : daftarBarang) {
            total += barang.getSubtotal();
        }

        return total;
    }

    public long getDiskon() {
        if (getTotal() >= 100000) {
            return getTotal() / 10;
        }

        return 0;
    }

    public long getBayar() {
        return getTotal() - getDiskon();
    }

    public String formatRupiah(long nilai) {
        return rupiah.format(nilai);
    }

    public void hapusSemua() {
        daftarBarang.clear();
        fireTableDataChanged();
    }
    
}
