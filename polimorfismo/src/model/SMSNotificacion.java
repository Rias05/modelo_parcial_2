/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class SMSNotificacion extends Notificacion {

    public SMSNotificacion(String mensaje, int prioridad) {
        super(mensaje, prioridad);
    }

    @Override
    public void enviar() {
                System.out.println(" sms : " + mensaje);

        
    }


    
    
}
