/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class dataSetPegawai {
    private ArrayList<String> Golongan;
    private ArrayList<String> Status;
    private ArrayList<Integer> JmlAnak;
    private ArrayList<Integer> Masakerja;
    private ArrayList<String> Nama;
    
    public dataSetPegawai (){
        Golongan= new ArrayList<String>();
        Status= new ArrayList<String>();
        JmlAnak= new ArrayList<Integer>();
        Masakerja= new ArrayList<Integer>();
        Nama = new ArrayList<String>();
    }
    
     public void tambahNama(String value){
        Nama.add(value);
    }
     public ArrayList<String> getDatasetNama(){
        return this.Nama;
    }
     
     public void tambahGolongan(String value){
        Golongan.add(value);
    }
     public ArrayList<String> getDatasetGolongan(){
        return this.Golongan;
    }
     
     public void status(String value){
         Status.add(value);
     }
     public ArrayList<String> getDatasetStatus(){
         return this.Status;
     }
     
     public void jmlanak(int x){
         JmlAnak.add(x);
     }
     public ArrayList<Integer> getDatasetjmlanak(){
         return this.JmlAnak;
     }
     
     public void Masakerja(int y){
         Masakerja.add(y);
     }
     public ArrayList<Integer> getDatasetMasakerja(){
         return this.Masakerja;
     }
     
     public void tambahData(String gol, String Status, int jmlanak, int Masakerja, String Nama){
         this.Nama.add(Nama);
         this.Golongan.add(gol);
         this.Status.add(Status);
         this.JmlAnak.add(jmlanak);
         this.Masakerja.add(Masakerja);
         
     }
    
    
}
 