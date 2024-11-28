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
        private String noombre;

    public Producto(String noombre) {
        this.noombre = noombre;
    }

    public String getNoombre() {
        return noombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "noombre=" + noombre + '}';
    }

    public void setNoombre(String noombre) {
        this.noombre = noombre;
    }

    
}
