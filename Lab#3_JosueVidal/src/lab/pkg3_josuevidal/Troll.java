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
public class Troll extends PersonajesEnemigos {

    private Random ran = new Random();

    public Troll(int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura, String grito, String raza) {
        super(HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, "SCOOBY DOOO PA PA", raza);
        this.setHP(50 + ran.nextInt(80));
        this.setAD(30 + ran.nextInt(50));
        this.setEficacia(50 + ran.nextInt(65));
        this.setPc(15 + ran.nextInt(20));
        this.setVelocidad(10);
        this.setNombre("Troll");
    }

}
