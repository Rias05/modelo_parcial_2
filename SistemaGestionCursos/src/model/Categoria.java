/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Categoria {
    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarInfo(){
        System.out.println("nombre de la categoria es " + nombre);
        
    }
}
