/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.time.LocalDate;

/**
 *
 * @author moral
 */
public class Prueba {
    public static void main(String[] args) {
        Periodico p1 = new Periodico();
        Periodico p2 = new Periodico("El Pais 2.0",1.5, LocalDate.now());
        
        System.out.println("Imprimo el toString del periodico p1 "+p1.toString());
        System.out.println("Imprimo el toString del periodico p2 "+p2.toString());
    }
}
