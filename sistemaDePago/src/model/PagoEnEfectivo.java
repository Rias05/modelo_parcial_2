/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class PagoEnEfectivo extends MetodoDePago{

    public PagoEnEfectivo(double limitePago) {
        super(0,limitePago);
    }

    @Override
    public void realizarPago(double monto) {
         if (monto > limitePago) {
            System.out.println("El monto excede el límite permitido para pagos en efectivo. Límite: $" + limitePago);
        } else {
            System.out.println("Pago en efectivo realizado. Monto: $" + monto);
        }
        
    }
    
    
}
