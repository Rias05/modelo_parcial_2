/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Noxie
 */
import model.CantidadInvalidaException;
import model.PrecioInvalidoException;
import model.Producto;

public class Main {

    public static void main(String[] args) {
        try {
            Producto producto = new Producto("sparking", 4, 500);
            producto.setPrecio(-2);
            producto.reabastecer(-1);

        } catch (PrecioInvalidoException e) {
            System.out.println("Error en el precio: " + e.getMessage()); // Maneja errores de precio
        } catch (CantidadInvalidaException e) {
            System.out.println("Error en la cantidad: " + e.getMessage()); // Maneja errores de cantidad
        } catch (Exception e) {
            System.out.println("Otro error ocurrió: " + e.getMessage()); // Maneja cualquier otro tipo de error
        }

    }

}
