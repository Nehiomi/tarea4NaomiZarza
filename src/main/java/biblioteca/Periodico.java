/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.time.LocalDate;

/**
 *
 * @author Nao
 */
public class Periodico {
    
    //Atributos
    private String nombre;
    private double precio;
    private LocalDate fecha;
    
    //Constructor parametrizado
    public Periodico(String nombre, double precio, LocalDate fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }
    
    //Constructor por defecto
     public Periodico() {
        this.nombre = "El País";
        this.precio = 3.2;
        this.fecha = LocalDate.now();
    }
}
