/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Producto;
import model.Repositorio;

/**
 *
 * @author Noxie
 */
public class Main {
        public static void main(String[] args) {
            Repositorio <Producto>  repositorioDeProductos = new Repositorio<>();
             Producto prodcuto1  = new Producto(" juego pro brother");
            repositorioDeProductos.agregar(prodcuto1);
            System.out.println("producto nombre :"+repositorioDeProductos.obtenertodos());
            
            
            
            
            
            
        }

    
}
