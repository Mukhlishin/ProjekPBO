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
import penggajian4n.Alamat;

/**
 * Kelas DataSetAlamat digunakan untuk menyimpan kumpulan objek Alamat.
 */
public class DataSetAlamat {
    private ArrayList<Alamat> dataAlamat;
    
    public DataSetAlamat() {
        dataAlamat = new ArrayList<>();
    }
    
    public void tambahAlamat(Alamat alamat) {
        dataAlamat.add(alamat);
    }
    
    public void hapusAlamat(int index) {
        if (index >= 0 && index < dataAlamat.size()) {
            dataAlamat.remove(index);
        } else {
            System.out.println("Indeks alamat tidak valid");
        }
    }
    
    public ArrayList<Alamat> getDaftarAlamat() {
        return dataAlamat;
    }
}
