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
public class Manusia  extends SiapaKamu{
    
    private String nim;
    private String kelas;
    
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getKelas() {
        return kelas;
    }

    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void Siapakamu() {
        System.out.println("Saya Manusia");
    }
    
}
