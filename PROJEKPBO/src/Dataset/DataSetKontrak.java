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
import penggajian4n.Kontrak;

/**
 * Kelas DataSetKontrak digunakan untuk menyimpan kumpulan objek Kontrak.
 */
public class DataSetKontrak {
    private ArrayList<Kontrak> dataKontrak;
    
    public DataSetKontrak() {
        dataKontrak = new ArrayList<>();
    }
    
    public void tambahKontrak(Kontrak kontrak) {
        dataKontrak.add(kontrak);
    }
    
    public void hapusKontrak(int index) {
        if (index >= 0 && index < dataKontrak.size()) {
            dataKontrak.remove(index);
        } else {
            System.out.println("Indeks kontrak tidak valid");
        }
    }
    
    public ArrayList<Kontrak> getDaftarKontrak() {
        return dataKontrak;
    }
}
