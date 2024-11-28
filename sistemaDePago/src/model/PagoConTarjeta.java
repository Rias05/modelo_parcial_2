/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class PagoConTarjeta extends MetodoDePago{

    public PagoConTarjeta(double cargoTransaccion) {
        super(cargoTransaccion, 0);
    
    }

    @Override
    public void realizarPago(double monto) {
         double montoFinal = monto + (monto * cargoTransaccion);
         System.out.println("Pago con tarjeta realizado. Monto final con cargo: $" + montoFinal);
        
    }
    
}
