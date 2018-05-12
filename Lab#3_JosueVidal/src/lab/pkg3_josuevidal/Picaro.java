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
public class Picaro extends personajesAliados {

    public Picaro(String colorPiel, String colorCabello, int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura, String grito, String raza) {
        super(colorPiel, colorCabello, HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, "ESketiiit!", raza);
        this.setHP(150);

        this.setAD(55);
        this.setEficacia(85);
        this.setPc(60);
        this.setSuerte(50);
        this.setVelocidad(30);
    }

    public Picaro() {
    }

}
