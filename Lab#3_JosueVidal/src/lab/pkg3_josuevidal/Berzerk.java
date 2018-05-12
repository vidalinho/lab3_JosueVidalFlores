/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_josuevidal;

/**
 *
 * @author josue
 */
public class Berzerk extends personajesAliados {

    public Berzerk(String colorPiel, String colorCabello, int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura, String grito, String raza) {
        super(colorPiel, colorCabello, HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, "miaauw", raza);
         this.setAD(80);
        this.setEficacia(80);
        this.setPc(30);
        this.setSuerte(15);
        this.setVelocidad(20);
    }

    public Berzerk() {
    }

 

}
