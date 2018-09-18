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
public class TugasPraktikum1 {
    private int penumpang;
    private int maxpenumpang;
    private double beratpenumpang;
    private double maxberatpenumpang;
    private double average;

    
    public void Mobil(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
    }

    public boolean addpenumpang(int penumpang){
        boolean ada = true;
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("penumpang melebihi kuota");
            ada=false;
        }
        else{
            this.penumpang+=temp;
        }return ada;
    }
    public boolean setpenumpang(int password){
        boolean benar=false;
        if(password==24){
            System.out.println("Password Benar");
            benar=true;
        }else{
            System.out.println("Password Salah");
        }
        return benar;
    }
    public void setBeratPenumpang(double berat){
        this.beratpenumpang+=berat;
    }

    public double getBeratpenumpang() {
        return beratpenumpang;
    }

    public double getMaxberatpenumpang() {
        return maxberatpenumpang;
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus Sekarang\t= "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah\t= "+maxpenumpang);
    }
    public double getAverage(){
        average=beratpenumpang/penumpang ;
        return average;
    }
    public double getpenumpang(){
        return this.penumpang;
    }
}
