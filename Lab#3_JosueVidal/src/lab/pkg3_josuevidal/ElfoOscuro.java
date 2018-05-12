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
public class ElfoOscuro extends PersonajesEnemigos {

    Random r = new Random();

    public ElfoOscuro(int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura, String grito, String raza) {
        super(HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, "te vua matar prruu", raza);
        this.setHP(60 + r.nextInt(120));
        this.setAD(30 + r.nextInt(50));
        this.setEficacia(50 + r.nextInt(70));
        this.setPc(0 + r.nextInt(100));
        this.setVelocidad(20);
        this.setNombre("Elfo Oscuro");
    }

}
