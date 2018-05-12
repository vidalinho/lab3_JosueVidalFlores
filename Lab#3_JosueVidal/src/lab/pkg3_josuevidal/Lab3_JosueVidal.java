/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_josuevidal;

import java.util.*;
import java.util.Random;

/**
 *
 * @author josue
 */
public class Lab3_JosueVidal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        Personajes p = new Personajes();
        personajesAliados per = new personajesAliados();
        Scanner lea = new Scanner(System.in);

        int opc = 1;
        int c = 0, movimientos = 50;
        String colorPiel = "", colorCabello = "", nombre = "", grito = "", raza = "";
        int HP = 0, AP = 0, AD = 0, Eficacia = 0, Pc = 0, Velocidad = 0, edad = 0, peso = 0, estatura = 0;
        while (opc == 1 || opc == 2) {
            System.out.println("  ---Menu---");
            System.out.println("1) Iniciar");
            System.out.println("2) Nivel de dificultad");
            System.out.println("3) Salir");

            opc = lea.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("ELIGA SU JUGADOR: ");
                    System.out.println("1) Mago");
                    System.out.println("2) Berzek");
                    System.out.println("3) Arquero");
                    System.out.println("4) Picaro");
                    int opc2 = lea.nextInt();
                    switch (opc2) {
                        case 1:
                            p = new mago(colorPiel, colorCabello, HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, grito, raza);
                            break;
                        case 2:
                            p = new Berzerk(colorPiel, colorCabello, HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, grito, raza);
                            break;
                        case 3:
                            p = new Arquero(colorPiel, colorCabello, HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, grito, raza);
                            break;
                        case 4:
                            p = new Picaro(colorPiel, colorCabello, HP, AP, AD, Eficacia, Pc, Velocidad, edad, nombre, peso, estatura, grito, raza);
                            break;
                    }

                    break;
                case 2:
                    System.out.println("INGRESE SU OPCION: ");
                    System.out.println("1) Facil");
                    System.out.println("2) Regular");
                    System.out.println("3) Dificil");
                    int opc3 = lea.nextInt();
                    switch (opc3) {
                        case 1:
                            movimientos = 50;
                            break;
                        case 2:
                            movimientos = 100;
                            break;
                        case 3:
                            movimientos = 120;
                            break;

                    }
                    System.out.println("Ingrese su edad: ");
                    int years = lea.nextInt();
                    p.setEdad(years);
                    System.out.println("Ingrese su nombre: ");
                    String nom = lea.next();
                    p.setNombre(nom);
                    System.out.println("Ingrese su peso: ");
                    int weigth = lea.nextInt();
                    p.setPeso(weigth);
                    System.out.println("Ingrese su estatura: ");
                    int heigth = lea.nextInt();
                    p.setEstatura(heigth);

                    System.out.println("Ingrese color de pelo: ");
                    System.out.println("1) negro");
                    System.out.println("2) cafe");
                    System.out.println("3) rubio");
                    int hair = lea.nextInt();
                    switch (hair) {
                        case 1:
                            per.setColorCabello("negro");
                            break;
                        case 2:
                            per.setColorCabello("cafe");
                            break;
                        case 3:
                            per.setColorCabello("rubio");
                            break;
                    }

                    System.out.println("Ingrese color de piel: ");
                    System.out.println("1) negro");
                    System.out.println("2) cafe");
                    System.out.println("3) rubio");
                    int piel = lea.nextInt();
                    switch (piel) {
                        case 1:
                            per.setColorPiel("negro");
                            break;
                        case 2:
                            per.setColorPiel("cafe");
                            break;
                        case 3:
                            per.setColorPiel("rubio");
                            break;
                    }

                    System.out.println("Ingrese raza: ");
                    System.out.println("1) Hobbit");
                    System.out.println("2) Elfos");
                    System.out.println("3) Humanos");
                    System.out.println("4) Enanos");
                    int opc4 = lea.nextInt();
                    switch (opc4) {
                        case 1:
                            per.setRaza("Hobbit");
                            break;
                        case 2:
                            per.setRaza("Elfos");
                            break;
                        case 3:
                            per.setRaza("Humanos");
                            break;
                        case 4:
                            per.setRaza("Enanos");
                    }
                    while (p.getHP() > 0 || movimientos > 0) {
                        System.out.println("tire el dado");
                        int dado = 1 + r.nextInt(20);
                        System.out.println("el dado lo hizo mover " + dado + " espacios");
                        movimientos = movimientos - dado;
                        System.out.println("le quedan " + movimientos + " espacios para terminar");
                        int dmonster = 1 + r.nextInt(100);
                        if (dmonster < 20) {
                            System.out.println("has encontrado un objeto");
                        } else if (dmonster > 95) {
                            System.out.println("Estas a salvo hermano");
                        } else {
                            System.out.println("ha encontrado una criautira");
                            System.out.println("A pelea!!");
                            p.setHP(p.getHP() - 20);
                        }
                        if (p.getHP() < 0) {
                            System.out.println("Ha perdido, lo han matado");
                        } else {
                            System.out.println("Felicidades, has ganado");
                        }
                    }
            }

        }
    }
}
