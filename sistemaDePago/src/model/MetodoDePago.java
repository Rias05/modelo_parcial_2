/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public abstract class MetodoDePago {
    protected double cargoTransaccion;
    protected double limitePago;

    public MetodoDePago(double cargoTransaccion, double limitePago) {
        this.cargoTransaccion = cargoTransaccion;
        this.limitePago = limitePago;
    }
    public abstract void realizarPago(double monto);
        
    

}
