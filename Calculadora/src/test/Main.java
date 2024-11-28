/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Noxie
 */
import model.Calculadora;
import model.CalculadoraBasica;

public class Main {
        public static void main(String[] args) { 
        try {
           Calculadora calculo = new  CalculadoraBasica(); 
           
         double m = calculo.dividir(0, 0); 
            System.out.println(m);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
            
        }

    
}
