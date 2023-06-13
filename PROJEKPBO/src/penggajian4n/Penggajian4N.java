/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penggajian4n;
import Dataset.dataSetPegawai;
import forms.frameUtama;

/**
 *
 * @author Acer
 */
public class Penggajian4N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pegawai myobj = new Pegawai(); //itu dari konstruktor
        myobj.setTunjMenikah("Menikah");
        myobj.setTunjGapok("Golongan 2");
        myobj.setTunjMasaKerja(4);
        myobj.setTunjAnak(2);
        System.out.println( myobj.GajiTotal());
        
        
        String[] nama= new String[3];
        nama[0]="Azijah";
        nama[1]="Nadia";
        nama[2]="Rahmi";
        System.out.print(nama[2]);
        
        int tahun[]= {2010,2023};
        System.out.print(tahun[0]);
        
        ArrayList <String> kota = new ArrayList <String>();
        kota.add("Banjarmasin");
        kota.add("Banjarbaru");
        kota.add("Marabahan");
        System.out.println("Jumlah Array List : "+ String.valueOf(kota.size()));
        System.out.println(kota.get(1));
        kota.remove(1);
        System.out.println(kota.get(1));
        
        
        dataSetPegawai mydata= new dataSetPegawai();
        mydata.tambahGolongan("Golongan 1");
        mydata.tambahGolongan("Golongan 2");
        System.out.println(mydata.getDatasetGolongan().get(0));
        
        mydata.status("Menikah");
        System.out.println(mydata.getDatasetStatus().get(0));
        
        mydata.jmlanak(2);
        System.out.println( mydata.getDatasetjmlanak().get(0));
        
        mydata.Masakerja(2);
        System.out.println( mydata.getDatasetMasakerja().get(0));
*/
        
        frameUtama formsaya = new frameUtama();
        formsaya.setVisible(true);
    }
    
}
