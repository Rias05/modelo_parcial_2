/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public abstract class Mercancia {
    protected String codMercancia;

    public Mercancia(String codMercancia) {
        this.codMercancia = codMercancia;
    }

    public String getCodMercancia() {
        return codMercancia;
    }

    public void setCodMercancia(String codMercancia) {
        this.codMercancia = codMercancia;
    }
    public abstract double calcularPrecioFinal();
    
   
    

    
}
