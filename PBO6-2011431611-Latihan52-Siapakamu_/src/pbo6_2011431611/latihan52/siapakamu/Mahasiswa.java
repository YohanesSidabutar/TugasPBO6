/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6_2011431611.latihan52.siapakamu;
/**
 *
 * @author
 * Nama : Yohanes Sidabutar
 * Kelas : PBO FS112B
 * NIM : 2011431611
 */
public class Mahasiswa extends Manusia {
    
    private String nama;
    private int umur;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void KelasApa (String kelas) {
        System.out.println("Saya "+ nama +" umur "+ umur +" tahun sedang belajar di kelas " + kelas);
    }
    
    public void SiapaKamu () {
        System.out.println("Saya Mahasiswa");
    }
    
}
