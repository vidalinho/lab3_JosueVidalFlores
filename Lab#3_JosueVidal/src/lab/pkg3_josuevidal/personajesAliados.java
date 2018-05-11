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
public class personajesAliados extends Personajes {

    private int Suerte = 20;
    private String colorPiel;
    private String colorCabello;

    public personajesAliados(String colorPiel, String colorCabello, int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura) {
        super(HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura);
        this.colorPiel = colorPiel;
        this.colorCabello = colorCabello;
    }

    

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }
    public int getSuerte() {
        return Suerte;
    }

    public void setSuerte(int Suerte) {
        this.Suerte = Suerte;
    }

}
