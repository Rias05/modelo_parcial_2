/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Noxie
 */
import model.Producto;
import model.ControladorDePedido;

public class Main {
        public static void main(String[] args) {
            

           
            Producto producto1 = new  Producto("Pc gamer",3,4000);
            ControladorDePedido controlador = new  ControladorDePedido();
            controlador.confirmar(producto1, 12);
    
    
        }

}
    
