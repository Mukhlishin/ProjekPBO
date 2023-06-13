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
 * Kelas Jabatan digunakan untuk menyimpan informasi jabatan pegawai.
 */
public class Jabatan {
    private String nama;
    private double gajiPokok;

    public Jabatan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @Override
    public String toString() {
        return "Jabatan{" +
                "nama='" + nama + '\'' +
                ", gajiPokok=" + gajiPokok +
                '}';
    }
}
