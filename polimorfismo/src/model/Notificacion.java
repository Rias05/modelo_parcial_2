/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public abstract class Notificacion {
    protected String mensaje ;
    protected int prioridad;

    public Notificacion(String mensaje, int prioridad) {
        this.mensaje = mensaje;
        this.prioridad = prioridad;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public int getPrioridad() {
        return prioridad;
    }

  
    
    public abstract void enviar();
       
        
    
}
