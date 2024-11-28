/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Producto {

    /**
     * @param args the command line arguments
     */
    private String producto  ;
    private  int stock;
    private double precio ;

    public Producto(String producto, int stock, double precio) {
        this.producto = producto;
        this.stock = stock;
        this.precio = precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }
    public boolean HayStock ( int cantidad){
        return this.stock >= cantidad;
    }

}
