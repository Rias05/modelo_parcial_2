/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Noxie
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    // int se convierte en integer
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        System.out.println(numeros);
        numeros.set(1,25);
        System.out.println(numeros);
        
        // TODO code application logic here
        
    }
    
}
