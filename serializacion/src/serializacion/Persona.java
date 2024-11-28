/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializacion;

import java.io.Serializable;

/**
 *
 * @author Noxie
 */
public class Persona implements Serializable {
    // identificado unico para la clase muy util para la desearilizacion
    private static final long  serialversionUID = 1L;
    
    private String nombre;
    private int edad;
    // campo sensible que no deben serializarce
    private transient String contraseña;

    public Persona(String nombre, int edad, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.contraseña = contraseña; 
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", contraseña=" + contraseña + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
