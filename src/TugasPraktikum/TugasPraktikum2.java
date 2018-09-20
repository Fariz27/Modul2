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
public class TugasPraktikum2 {
    private double jariJari,Diameter,LuasPermukaan,Volume;
     Scanner s = new Scanner(System.in);
    public void setJariJari() {
        this.jariJari = s.nextDouble();
    }
    public double showJariJari() {
        return jariJari;
    }

    public double showDiameter() {
        this.Diameter = jariJari*2;
        return Diameter;
    }

    public double showLuasPermukaan() {
        this.LuasPermukaan=4*Math.PI*jariJari*jariJari;
        return LuasPermukaan;
    }

    public double showVolume() {
        this.Volume=4/3*Math.PI*jariJari*jariJari*jariJari;
        return Volume;
    }
    
}
