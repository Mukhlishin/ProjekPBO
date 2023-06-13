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
import penggajian4n.Jabatan;

/**
 * Kelas DataSetJabatan digunakan untuk menyimpan kumpulan objek Jabatan.
 */
public class DataSetJabatan {
    private ArrayList<Jabatan> dataJabatan;
    
    public DataSetJabatan() {
        dataJabatan = new ArrayList<>();
    }
    
    public void tambahJabatan(Jabatan jabatan) {
        dataJabatan.add(jabatan);
    }
    
    public void hapusJabatan(int index) {
        if (index >= 0 && index < dataJabatan.size()) {
            dataJabatan.remove(index);
        } else {
            System.out.println("Indeks jabatan tidak valid");
        }
    }
    
    public ArrayList<Jabatan> getDaftarJabatan() {
        return dataJabatan;
    }
}
