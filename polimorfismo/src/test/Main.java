/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import model.Notificacion;
import model.EmailNotificacion;
import model.PushNotificacion;
import model.SMSNotificacion;

/**
 *
 * @author Noxie
 */
public class Main {

    public static void main(String[] args) {
       // ArrayList<Notificacion> notificaciones = new ArrayList<>();
        PriorityQueue<Notificacion> notificaciones = new PriorityQueue<>(new Comparator<Notificacion>(){
            @Override
            public int compare(Notificacion n1, Notificacion n2) {

                return Integer.compare(n1.getPrioridad(), n2.getPrioridad());
                
                
            }
            
            
        });
        notificaciones.add(new EmailNotificacion("quiero jugar fornite", 3));
        notificaciones.add(new PushNotificacion("quiero jugar", 2));
        notificaciones.add(new SMSNotificacion("zzzzzze", 1));
        
        while(!notificaciones.isEmpty()){// mientras la lista no este vacia 
            Notificacion notificacion = notificaciones.poll();// va sacando uno por uno 
            notificacion.enviar();
            
        }
            

    }

}
