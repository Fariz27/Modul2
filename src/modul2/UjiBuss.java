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
public class UjiBuss {
    public static void main(String[] args){
        Bus busMini=new Bus();
        busMini.setPenumpang(5);
        busMini.setMaxPenumpang(15);
        busMini.cetak();
        int pnmg=busMini.getPenumpang();
        busMini.setPenumpang(pnmg+=5);
        busMini.setPenumpang(pnmg-=2);
        busMini.setPenumpang(pnmg+=8);
        busMini.cetak();
        
    }
}


