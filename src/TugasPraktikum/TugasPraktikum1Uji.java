/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;
import java.util.Scanner;
/**
 *
 * @author Fariz
 */
public class TugasPraktikum1Uji {
   public static void main(String[] args){
       TugasPraktikum1 a = new TugasPraktikum1();
       Scanner s = new Scanner(System.in);
       boolean benar,tambah=true;
       int jlhpng=0,png,max=5,pw;
       double berat;
       a.Mobil(max);
       System.out.println("Max penumpang mobil adalah\t: "+max);
       System.out.print("Masukan Password\t: ");
       pw=s.nextInt();
       benar=a.setpassword(pw);
       if(benar){
           System.out.println("--Password benar--");
           do{
               System.out.print("Jumlah penumpang yang akan ditamabah : ");
               png=s.nextInt();
               jlhpng+=png;
               boolean ada=a.addpenumpang(jlhpng);
               if(ada){
               System.out.print("Masukan Berat Penumpang (Kg) : ");
               berat=s.nextDouble();
               a.setBeratPenumpang(berat);}
               System.out.println("Total berat seluruh penumpang sekarang: "+a.getBeratpenumpang()+".Kg");
               System.out.println("Tambah penumpang lagi? (ya/tidak)");
               String pilih=" ";
               pilih=s.next();
               if(pilih.equalsIgnoreCase("ya")){
                   tambah=true;
               }else{tambah=false;}
           }while(tambah);
           System.out.println("Jumlah berat penumpang sekarang adalah : "+a.getBeratpenumpang()+"Kg");
           System.out.println("Jumlah Penumpang sekarang adalah       : "+a.getpenumpang());
           System.out.println("Rata-Rata Berat Penumpang adalah       : "+a.getAverage()+"Kg");
           
           
       }
}
}
