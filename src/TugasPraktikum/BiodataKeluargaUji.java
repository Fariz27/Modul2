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
public class BiodataKeluargaUji {
    public static void main(String[] args){
        BiodataKeluarga b = new BiodataKeluarga();
        System.out.print("Masukan Nama\t\t: ");
        b.setNama();
        System.out.print("Masukan Nama Ayah\t: ");
        b.setNamaAyah();
        System.out.print("Masukan Nama Ibu\t: ");
        b.setNamaIbu();
        System.out.print("Masukan Nama Saudara\t: ");
        b.setNamaSaudara();
        System.out.print("Masukan Alamat\t\t: ");
        b.setAlamat();
        System.out.print("Masukan Tempat Lahir\t: ");
        b.setTempatLahir();
        System.out.print("Masukan Tanggal Lahir\t: ");
        b.setTanggalLahir();
        b.setTanggalLahir();
        System.out.print("Masukan Hobi\t\t: ");
        b.setHobi();
        System.out.print("Masukan Cita-cita\t: ");
        b.setCitaCita();
        System.out.print("Masukan No Telepon\t: ");
        b.setNoTelp();
        System.out.println("--------------------"); 
        System.out.println("------Biodata-------");
        System.out.println("Nama\t\t: "+b.getNama());
        System.out.println("Nama Ayah\t: "+b.getNamaAyah());
        System.out.println("Nama Ibu\t: "+b.getNamaIbu());
        System.out.println("Nama Saudara\t: "+b.getNamaSaudara());
        System.out.println("Alamat\t\t:"+b.getAlamat());
        System.out.println("TTL\t\t: "+b.getTempatLahir()+", "+b.getTanggalLahir());
        System.out.println("Hobi\t\t: "+b.getHobi());
        System.out.println("Cita-cita\t: "+b.getCitaCita());
        System.out.println("No Telepon\t: "+b.getNoTelp());
    }
    
}
