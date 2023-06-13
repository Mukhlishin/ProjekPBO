/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian4n;

/**
 *
 * @author Acer
 */
public class Pegawai extends Tunjangan {
    private String Nip;
    private String Nama;
    
    public Pegawai(){
    }
    
    public void setNip(String Nip){
        this.Nip=Nip;
    }
    public String getNip(){
        return this.Nip;
    }
    
    public void setNama(String Nama){
        this.Nama=Nama;
    }
    
    public String getNama (){
        return this.Nama;
    }
}

