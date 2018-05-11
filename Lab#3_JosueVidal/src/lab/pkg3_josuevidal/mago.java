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
public class mago extends personajesAliados {

    private int ap = 50;

    public mago(String colorPiel, String colorCabello, int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura) {
        super(colorPiel, colorCabello, HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura);
        this.setHP(120);
        this.setAP(50);
        this.setAD(20);
        this.setEficacia(70);
        this.setPc(2);
        this.setSuerte(20);
        this.setVelocidad(10);
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

}
