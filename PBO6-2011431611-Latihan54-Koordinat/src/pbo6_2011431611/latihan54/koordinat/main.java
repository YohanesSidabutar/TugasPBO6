/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6_2011431611.latihan54.koordinat;

/**
 *
 * @author asus
 * Nama : Yohanes Sidabutar
 * Kelas :PBO FS112B
 * Nim : 2011431611
 */
public class main {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        warnaKoordinat wk = new warnaKoordinat(10, 4, "Jingga");
        Koordinat k = new Koordinat(10, 4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + k.x + ", " + " y : " + k.y);
    }
}
