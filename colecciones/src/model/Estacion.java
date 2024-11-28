/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Tren;
/**
 *
 * @author Noxie
 */
public class Estacion {
    private String nombre;//  representa el nombre de la estación.

    private  ArrayList<Tren> trenes ;// que almacena los trenes que pasan por la estación.


    public Estacion(String nombre) {
        this.nombre = nombre;
        this.trenes = new ArrayList ();
    }
    public void agregarTren(Tren tren){
        trenes.add(tren);
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Tren> getTrenes() {
        return trenes;
    }

    public void setTrenes(ArrayList<Tren> trenes) {
        this.trenes = trenes;
    }
    public void mostrarTrenes(){
        //  imprime los números de los trenes que pasan por la estación y el tiempo total que pasan en sus estaciones.
        System.out.println("Estación: " + nombre);

        for (Tren tren: trenes){
            System.out.println( " numero de tren "+ tren.getNombre() + " tiemepo total:"+ tren.calcularTiempoTotal());
            
            
        }

    }
    
}
