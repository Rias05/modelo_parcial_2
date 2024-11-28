/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Empleado {
    private static int ID = 1;
    protected int  identificador;
    protected String nombre ;

    public Empleado( String nombre) {
        this.identificador = ID++ ;
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double calcularSalario(){
           
            return 0.0 ;
        
    }
    
    
}
