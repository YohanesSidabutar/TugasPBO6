/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2011431611.latihan56.umurbarangantik;

/**
 *
 * @author Funtsu
 * Nama : Yohanes Sidabutar
 * Kelas : PBO FS112B
 * Nim : 2011431611
 */
public class BarangAntik {
    int umur;
    
    public BarangAntik (int umur) {
        this.umur = umur;
    }
    public void tampilUmur() {
        Radio r = new Radio(234);
        System.out.println("Umur barang antik ini adalah    : " + umur + " tahun ");
    }
    
}
