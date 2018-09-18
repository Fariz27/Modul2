/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author Fariz
 */
public class Latihan2Uji {
    public static void main(String[] args){
        Latihan2 busBesar = new Latihan2();
        busBesar.bus(40);
        busBesar.cetak();
        busBesar.addPenumpang(15);
        busBesar.cetak();
        busBesar.addPenumpang(5);
        busBesar.cetak();
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}
