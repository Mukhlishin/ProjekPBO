/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian4n;

/**
 *
 * @author ACER
 */

/**
 * Kelas Kontrak digunakan untuk menyimpan informasi kontrak kerja pegawai.
 */
public class Kontrak {
    private String nomorKontrak;
    private String tanggalMulai;
    private String tanggalSelesai;

    public Kontrak(String nomorKontrak, String tanggalMulai, String tanggalSelesai) {
        this.nomorKontrak = nomorKontrak;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
    }

    public String getNomorKontrak() {
        return nomorKontrak;
    }

    public void setNomorKontrak(String nomorKontrak) {
        this.nomorKontrak = nomorKontrak;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public String getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(String tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    @Override
    public String toString() {
        return "Kontrak{" +
                "nomorKontrak='" + nomorKontrak + '\'' +
                ", tanggalMulai='" + tanggalMulai + '\'' +
                ", tanggalSelesai='" + tanggalSelesai + '\'' +
                '}';
    }
}

