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
import penggajian4n.Departemen;

/**
 * Kelas DataSetDepartemen digunakan untuk menyimpan kumpulan objek Departemen.
 */
public class DataSetDepartemen {
    private ArrayList<Departemen> dataDepartemen;
    
    public DataSetDepartemen() {
        dataDepartemen = new ArrayList<>();
    }
    
    public void tambahDepartemen(Departemen departemen) {
        dataDepartemen.add(departemen);
    }
    
    public void hapusDepartemen(int index) {
        if (index >= 0 && index < dataDepartemen.size()) {
            dataDepartemen.remove(index);
        } else {
            System.out.println("Indeks departemen tidak valid");
        }
    }
    
    public ArrayList<Departemen> getDaftarDepartemen() {
        return dataDepartemen;
    }
}
