/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Noxie
 */
public class Tren {

    private String nombre;// representa el número del tren
    private ArrayList<Integer> tiemposEstaciones;//que almacena el tiempo (en minutos) que el tren pasa en cada estación.


    public Tren(String nombre) {
        this.nombre = nombre;
        this.tiemposEstaciones = new ArrayList();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiemposEstaciones(ArrayList<Integer> tiemposEstaciones) {
        this.tiemposEstaciones = tiemposEstaciones;
    }

    public ArrayList<Integer> getTiemposEstaciones() {
        return tiemposEstaciones;
    }

    public void agregarTiempo(int tiempo) {
        //  agrega el tiempo de una estación a la lista.
        tiemposEstaciones.add(tiempo);

    }

    public int calcularTiempoTotal() {
        int acumulador = 0;

        //devuelve la suma de los tiempos en las estaciones.
        for (int tiempo : tiemposEstaciones) {
            acumulador += tiempo;
           

        }
    return acumulador;
    }

}
