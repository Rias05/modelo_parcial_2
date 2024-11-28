 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Producto extends Mercancia {

    private String producto;
    private double precioProducto;
    private double porcentajeDescuento;
    private boolean esDescuentoEn2daUnidad;

    public Producto(String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad, String codMercancia) {
        super(codMercancia);
        this.producto = producto;
        this.precioProducto = precioProducto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEsDescuentoEn2daUnidad() {
        return esDescuentoEn2daUnidad;
    }

    public void setEsDescuentoEn2daUnidad(boolean esDescuentoEn2daUnidad) {
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }
// : Si el descuento es en la 2° unidad, para calcular el precio final
//se aplica la mitad del porcentaje de descuento, dado que se deben comprar 2 artículo

    @Override
    public double calcularPrecioFinal() {
        if (esDescuentoEn2daUnidad) {
            double descuentoFinal = (porcentajeDescuento / 2) / 100;
            precioProducto = precioProducto + precioProducto - (precioProducto * descuentoFinal);
        }
        else {
        double descuentoFinal = porcentajeDescuento / 100; // Descuento completo
        precioProducto = precioProducto - (precioProducto * descuentoFinal); // Aplica el descuento completo
    }
    return this.precioProducto;
    
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento=" + porcentajeDescuento + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + '}';
    }

}
