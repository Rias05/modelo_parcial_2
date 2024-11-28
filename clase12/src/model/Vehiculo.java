/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public interface Vehiculo {
    String matricula = " ";
    double maxvel = 0.0 ;
    default void bocina(){
        System.out.println("estoy tocando la bocina");
    }
    
    

   
    
}
