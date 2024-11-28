/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Biblioteca {
  private String  nombre ;
  private GestorBiblioteca gestor;

    public Biblioteca(String nombre, GestorBiblioteca gestor) {
        if( nombre.length()< 3 || nombre == null ){
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres.");
            
        }
        this.nombre = nombre;
        this.gestor = gestor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GestorBiblioteca getGestor() {
        return gestor;
    }

    public void setGestor(GestorBiblioteca gestor) {
        this.gestor = gestor;
    }
}
