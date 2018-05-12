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
public class Personajes {

    private int HP ;
    private int AP;
    private int AD ;
    private int Eficacia ;
    private int Pc ;
    private int Velocidad ;
    private int edad;
    private String nombre;
    private int peso;
    private int estatura;
    private String grito;
    private String raza;

    public Personajes(int HP, int AP, int AD, int Eficacia, int Pc, int Velocidad, int edad, String nombre, int peso, int estatura, String grito, String raza) {
        this.HP = HP;
        this.AP = AP;
        this.AD = AD;
        this.Eficacia = Eficacia;
        this.Pc = Pc;
        this.Velocidad = Velocidad;
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.grito = grito;
        this.raza = raza;
    }

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Personajes() {
    }
 
   

   
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public int getEficacia() {
        return Eficacia;
    }

    public void setEficacia(int Eficacia) {
        this.Eficacia = Eficacia;
    }

    public int getPc() {
        return Pc;
    }

    public void setPc(int Pc) {
        this.Pc = Pc;
    }


    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
}
