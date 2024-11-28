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
public class GestionDeEvento {
   
      public static void main(String[] args) {

        // Crear el ArrayList y añadir participantes
        ArrayList<String> participantes = new ArrayList<>();
        participantes.add("Juan");
        participantes.add("María");
        participantes.add("Pedro");
        participantes.add("Ana");
        participantes.add("Luis");
        participantes.add("María"); // Repetido
        participantes.add("Carlos");
        participantes.add("Juan"); // Repetido
        participantes.add("Sofía");
        participantes.add("Jorge");

            String nombre = " Maria";
        boolean verificacion = participantes.contains(nombre);
        if (verificacion == true) {
            System.out.println("el nombre" + nombre + " esta en la lista.");

        } else {
            System.out.println("no esta el nombre");
        }
        // Posición en la Lista: Pregunta al usuario si quiere saber la posición del primer o último registro de un nombre.
        


    }

}
