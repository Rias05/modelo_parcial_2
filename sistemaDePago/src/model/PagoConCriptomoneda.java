/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class PagoConCriptomoneda extends MetodoDePago{
        private double tasaConversion; // Tasa para convertir la criptomoneda a la moneda local

    public PagoConCriptomoneda(double tasaConversion) {
        super(0,0);
        this.tasaConversion = tasaConversion;
    }

    @Override
    public void realizarPago(double monto) {
        double conversion = monto * tasaConversion;
        System.out.println("Pago con criptomoneda realizado. Monto en moneda local: $" + conversion);

    }


   
   
    
}
