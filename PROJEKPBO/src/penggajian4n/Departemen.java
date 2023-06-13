/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian4n;

/**
 * Kelas Departemen digunakan untuk menyimpan informasi departemen pegawai.
 */
public class Departemen {
    private String nama;
    private String lokasi;

    public Departemen(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    
    public String toString() {
        return "Departemen{" +
                "nama='" + nama + '\'' +
                ", lokasi='" + lokasi + '\'' +
                '}';
    }
}

