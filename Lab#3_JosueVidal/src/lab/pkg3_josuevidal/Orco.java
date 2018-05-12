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
public class Orco extends PersonajesEnemigos{
private Random r = new Random();
    public Orco(int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura, String grito, String raza) {
        super(HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, "boom boom ", raza);
        this.setHP(70 + r.nextInt(90));
        this.setAD(30 + r.nextInt(45));
        this.setEficacia(20 + r.nextInt(50));
        this.setPc(60);
        this.setVelocidad(20);
        this.setNombre("Orco");
    }

   

   
    
}
