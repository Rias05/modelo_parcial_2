/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
import java.time.LocalDate;

import java.time.LocalDateTime;
public class Reserva {
    private String nombre;
    private int nrotelefono;
    private  LocalDate hora;
    private boolean confirmada ;

    public Reserva(String nombre, int nrotelefono, LocalDate hora) {
        this.nombre = nombre;
        this.nrotelefono = nrotelefono;
        this.hora = hora;
        this.confirmada =false;
    }
    
    public void confirmar(){
        this.confirmada = true;
        System.out.println("operacion exitosa");
        
    
    }   

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", nrotelefono=" + nrotelefono + ", hora=" + hora + ", confirmada=" + confirmada + '}';
    }
    
}
