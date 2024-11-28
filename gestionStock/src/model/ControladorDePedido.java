/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
import model.Producto;
public class ControladorDePedido {

   
   public void confirmar(Producto producto, int cantidad){
       if (producto.HayStock(cantidad)){
           System.out.println("hay stock");
           
       }
       else {
           System.out.println("NO HAY NADA MANITO");
       }
       
   }
    
    
    
}
