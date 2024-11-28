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
import model.MetodoDePago;
import model.PagoConCriptomoneda;
import model.PagoConTarjeta;
import model.PagoEnEfectivo;
public class Main {
        public static void main(String[] args) {
            ArrayList<MetodoDePago> metodosDePago = new ArrayList<>();
            metodosDePago.add(new PagoConTarjeta(0.05)); // 5% de cargo
            metodosDePago.add(new PagoEnEfectivo(200)); // Límite de $200
            metodosDePago.add(new PagoConCriptomoneda(0.85)); // Tasa de conversión
            for( MetodoDePago metodo : metodosDePago){
                metodo.realizarPago(500);
            // funciona
                
            } 

      
        }

    
}
