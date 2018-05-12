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
public class Arquero extends personajesAliados {

    public Arquero(String colorPiel, String colorCabello, int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura, String grito, String raza) {
        super(colorPiel, colorCabello, HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, "wooof!", raza);
        this.setHP(150);

        this.setAD(50);
        this.setEficacia(85);
        this.setPc(60);
        this.setSuerte(20);
        this.setVelocidad(15);

    }

    public Arquero() {
    }

    

}
