/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_josuevidal;

import java.util.Random;

/**
 *
 * @author josue
 */
public class Bruja extends PersonajesEnemigos {

    private Random r = new Random();

    public Bruja(int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura, String grito, String raza) {
        super(HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, "buuuu!", raza);
         this.setHP(60 + r.nextInt(80));
        this.setAP(20 + r.nextInt(40));
        this.setAD(5 + r.nextInt(10));
        this.setEficacia(10 + r.nextInt(30));
        this.setPc(1);
        this.setVelocidad(3 + r.nextInt(7));
    }

   

}
