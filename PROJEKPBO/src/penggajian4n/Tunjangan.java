/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian4n;

/**
 *
 * @author Acer
 */
public class Tunjangan {
    private int TunjanganMenikah;
    private int TunjanganAnak;
    private int TunjanganMasaKerja;
    private int TunjanganGajiPokok;
    private int GajiTotal;
            
    public Tunjangan (){} //constructor atau pengenal obeject
    
    public Tunjangan(String status){
        setTunjMenikah(status);
    }
    
    public Tunjangan(String status,int anak){
        setTunjMenikah(status);
        setTunjAnak(anak);
    }
    
    public Tunjangan(String status,int anak,int masa){
        setTunjMenikah(status);
        setTunjAnak(anak);
        setTunjMasaKerja(masa);  
    }
     
    public Tunjangan(String status,int anak,int masa, String golongan){
        setTunjMenikah(status);
        setTunjAnak(anak);
        setTunjMasaKerja(masa); 
        setTunjGapok(golongan);
    }
    
    
    public void setTunjMenikah(String status){
        if (status.equals("Menikah")){
            this.TunjanganMenikah=1000000;
        } else {
            this.TunjanganMenikah=0;
        }
            
    }
    
    public int getTunjanganMenikah(){
        return this.TunjanganMenikah;
    }
    
    public void setTunjAnak(int jumlah){
        //1..3 :600000
        if (jumlah>= 1 && jumlah <=3){
            this.TunjanganAnak=600000;
        }else if (jumlah>= 4 && jumlah <=6){
        //4..6 :800000
            this.TunjanganAnak=800000;
        }else {
        //7..n :1000000
            this.TunjanganAnak=1000000;
       }
    }
    public int getTunjanganAnak(){
        return this.TunjanganAnak;
    }
    
    public void setTunjMasaKerja(int masa){
        if (masa >=0 && masa<=4 ){
            //0..4 thn : 400000
            this.TunjanganMasaKerja=400000;
        }else if (masa >=5 && masa <=9 ){
            //5..9 thn : 900000
            this.TunjanganMasaKerja=900000;
        }else{
            //10..n thn : 1200000
            this.TunjanganMasaKerja=1200000;
        }
    }
    public int getTunjanganMasakerja(){
        return this.TunjanganMasaKerja;
    }
    
    public void setTunjGapok(String gol){
        if(gol.equals("Golongan 1")){
            this.TunjanganGajiPokok=3000000;
        } else if (gol.equals("Golongan 2")){
            this.TunjanganGajiPokok=3500000;
        } else {
            this.TunjanganGajiPokok=4000000;
        }
    }
    
    public int getTunjanganPokok(){
        return this.TunjanganGajiPokok;
    }
    
    public int GajiTotal(){
        return getTunjanganAnak()+ getTunjanganMenikah()
                + getTunjanganMasakerja()+getTunjanganPokok(); 
    }
        
}
