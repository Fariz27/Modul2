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
public class BiodataKeluarga {
    private String namaAyah,namaIbu,namaSaudara,nama,Alamat,tempatLahir,tanggalLahir,hobi,citaCita,noTelp;
    Scanner s = new Scanner(System.in);
    public void setNamaAyah() {
        this.namaAyah = s.nextLine();
    }

    public void setNamaIbu() {
        this.namaIbu = s.nextLine();
    }

    public void setNamaSaudara() {
        this.namaSaudara = s.nextLine();
    }

    public void setNama() {
        this.nama = s.nextLine();
    }

    public void setAlamat() {
        this.Alamat = s.nextLine();
    }

    public void setTempatLahir() {
        this.tempatLahir = s.next();
    }

    public void setTanggalLahir() {
        this.tanggalLahir = s.nextLine();
    }

    public void setHobi() {
        this.hobi = s.nextLine();
    }

    public void setCitaCita() {
        this.citaCita = s.nextLine();
    }

    public void setNoTelp() {
        this.noTelp = s.nextLine();
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public String getNamaSaudara() {
        return namaSaudara;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getHobi() {
        return hobi;
    }

    public String getCitaCita() {
        return citaCita;
    }

    public String getNoTelp() {
        return noTelp;
    }
    
    
}
