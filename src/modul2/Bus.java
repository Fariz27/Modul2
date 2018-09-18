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
public class Bus {
    private int penumpang;
    private int maxPenumpang;
    
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+ maxPenumpang);
        
    }

    public int getPenumpang() {
        return penumpang;
    }

    public int getMaxPenumpang() {
        return maxPenumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }
}
