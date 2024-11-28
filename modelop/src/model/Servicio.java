/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Servicio extends Mercancia {
    private String servicio;
    private double presupuesto;
    private double porcentajeDescuento;
    private boolean enPromocion;

    public Servicio(String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion, String codMercancia) {
        super(codMercancia);
        this.servicio = servicio;
        this.presupuesto = presupuesto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    @Override
    public String toString() {
        return "Servicio{" + "servicio=" + servicio + ", presupuesto=" + presupuesto + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + '}';
    }

    @Override
    // Si el servicio está en promoción, el precio final aplica el porcentaje de descuento
    public double calcularPrecioFinal() {
        if (enPromocion){
             double descuentoFinal = porcentajeDescuento / 100;
             presupuesto = presupuesto - (presupuesto * descuentoFinal);   
        }
       return presupuesto;
    }

    
}
