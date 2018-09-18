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
public class Latihan3Uji {
    public static void main(String args[]){
        Latihan3 siswa = new Latihan3();
        siswa.setName("Fariz Akbar Ade Rian");
        siswa.setAbsen(23);
        siswa.setAddress("Kediri");
        System.out.println("Nama\t: "+ siswa.getName()+"\nAbsen\t: "+ siswa.getAbsen()+"\nAddress\t: "+siswa.getAddress());
    }
}
