/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
import model.CantidadInvalidaException;

public class Producto {

    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio)throws PrecioInvalidoException , CantidadInvalidaException {
        this.nombre = nombre;
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) throws CantidadInvalidaException{
        if(cantidad<0){
            throw new CantidadInvalidaException("la cnatidad no pueder negativo o cero");
            
        }
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws PrecioInvalidoException {
        if (precio < 0) {
            throw new PrecioInvalidoException("no puede ser menor a 0 los productos");

        }

        this.precio = precio;
    }

    public void reabastecer(int cantidad) throws CantidadInvalidaException {
        if (cantidad < 0) {
            throw new CantidadInvalidaException("no puede ser menor  a 0");

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
