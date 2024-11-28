/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noxie
 */
public abstract class InstrumentoMusical {


  
    
    
    public static void  tocarSimultaneamente(ArrayList<InstrumentoMusical> lista){
        for (InstrumentoMusical instrumento:lista){
            instrumento.tocar();
            
        }
        
    }  
        
       public abstract void  tocar();   

    

}
