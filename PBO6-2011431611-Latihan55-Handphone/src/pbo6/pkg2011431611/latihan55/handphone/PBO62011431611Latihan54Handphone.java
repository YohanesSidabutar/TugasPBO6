/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2011431611.latihan55.handphone;

/**
 *
 * @author Funtsu
 * Nama : Yohanes Sidabutar
 * Kelas : PBO FS112B
 * Nim : 2011431611
 */
public class PBO62011431611Latihan54Handphone {

    /**
     * @param args the command line arguments
     */
    protected static String manufacture, operatingSystem, model;
    protected static int harga;
    
    public static void main(String[] args) {
        Handphone h = new Handphone(manufacture, operatingSystem, model, harga);
        h.displayProduct();
    }
    
}
