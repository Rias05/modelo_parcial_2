/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Libro;

/**
 *
 * @author Noxie
 */
public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = new ArrayList();
    }

    public void agregarlibro(Libro libro) {
        libros.add(libro);

    }

    public void MostrarCatalago() {
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }

    public void TomarPrestado(Libro libro) {
        if (libro.isPrestado()) {
            libro.prestar();

        } else {
            System.out.println("EL" + libro + "no esta disponible");
        }

    }
    public void consultarDIsponibilidad( String titulo){
        
    }

}
