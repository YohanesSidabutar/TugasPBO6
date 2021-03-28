/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2011431611.latihan56.umurbarangantik;

/**
 *
 * @author asus
 * Nama : Yohanes Sidabutar
 * Kelas : PBO FS112B
 * Nim : 2011431611
 */
public class main {
     public static void main(String[] args) {
        Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama Barang Antik   : " + r.getName());
        r.tampilUmur();
    }
}
