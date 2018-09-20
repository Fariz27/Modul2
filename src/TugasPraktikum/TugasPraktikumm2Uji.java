/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Fariz
 */
public class TugasPraktikumm2Uji {
    public static void main(String[] args){
        TugasPraktikum2 b = new TugasPraktikum2();
        System.out.print("Masukan Jari-Jari Bola\t: ");
        b.setJariJari();
        System.out.println("Diameter Bola\t\t: "+b.showDiameter());
        System.out.println("Luas Permukaan Bola\t: "+b.showLuasPermukaan());
        System.out.println("Volume Bola\t\t: "+b.showVolume());
    }
}
