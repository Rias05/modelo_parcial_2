/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Producto;

/**
 *
 * @author Noxie
 */
public class main {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        Producto p1 = new Producto("Manzana", 0.50, "Fruta");
        Producto p2 = new Producto("Laptop", 10.00, "Electronica");
        Producto p3 = new Producto("Camiseta", 15.99, "Ropa");
        Producto p4 = new Producto("Café", 3.25, "Bebida");
        
         // Agregar productos a la lista
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);


// filtrar productos categoria electronica y cuesta menor de 20.00
        List<Producto> filtrados = productos.stream()
        .filter(p -> p.getCategoria().equals("Electronica") && p.getRpecio()< 20.00 )
        .collect(Collectors.toList());
        filtrados.forEach(  System.out::println );
       
        

    }

}
