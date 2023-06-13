/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;

/**
 *
 * @author ACER
 */


import java.util.ArrayList;
import penggajian4n.Tunjangan;

/**
 * Kelas DataSetTunjangan digunakan untuk menyimpan kumpulan objek Tunjangan.
 */
public class DataSetTunjangan {
    private ArrayList<Tunjangan> dataTunjangan;
    
    public DataSetTunjangan() {
        dataTunjangan = new ArrayList<>();
    }
    
    public void tambahTunjangan(Tunjangan tunjangan) {
        dataTunjangan.add(tunjangan);
    }
    
    public void hapusTunjangan(int index) {
        if (index >= 0 && index < dataTunjangan.size()) {
            dataTunjangan.remove(index);
        } else {
            System.out.println("Indeks tunjangan tidak valid");
        }
    }
    
    public ArrayList<Tunjangan> getDaftarTunjangan() {
        return dataTunjangan;
    }
}

