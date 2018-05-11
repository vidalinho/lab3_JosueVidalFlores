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
public class Bruja extends PersonajesEnemigos {

    public Bruja(int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura) {
        super(HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura);
         this.setHP(150);
     
        this.setAD(55);
        this.setEficacia(85);
        this.setPc(60);
       
        this.setVelocidad(30);
    }


   
    
    
}
