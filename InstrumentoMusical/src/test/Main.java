/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Noxie
 */
import java.util.ArrayList;
import model.InstrumentoMusical;
import model.Bateria;
import model.Guitarra;
import model.Piano;
public class Main {
        public static void main(String[] args) {
            ArrayList<InstrumentoMusical> instrumentos = new ArrayList <>();
            instrumentos.add(new Bateria ());
            instrumentos.add(new Piano ());
            instrumentos.add(new Guitarra (24));
           //instrumentos.get(0).tocarSimultaneamente(instrumentos); sin modo estatico
            InstrumentoMusical.tocarSimultaneamente(instrumentos);// modo estatico

            

            
            
        }

    
}
