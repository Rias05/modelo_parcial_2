/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Producto {
    private  String nombre;
    private double  rpecio;
    private String categoria;

    public Producto(String nombre, double rpecio, String categoria) {
        this.nombre = nombre;
        this.rpecio = rpecio;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", rpecio=" + rpecio + ", categoria=" + categoria + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRpecio() {
        return rpecio;
    }

    public void setRpecio(double rpecio) {
        this.rpecio = rpecio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
