/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Noxie
 */
public class EJEMPLOS {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        lista.add("fsfdsff");
        lista.add("zzzzzz");
        lista.add("fornitw");
        lista.add("frozono");
        lista.add(0, "dsd");
        lista.set(0, "hentai");// elimino el dsd
        boolean verificacion = lista.contains("frozono");// hace falta imprimir
        System.out.println(lista.contains("frozono"));
        int prueba = lista.indexOf("hentai");
        System.out.println(prueba);
        int cantidad = lista.size();
        System.out.println(cantidad);

        System.out.println(lista);
        List<String> linkedList = new LinkedList<>();
        

        // Agregar elementos
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        
        System.out.println(linkedList);
    }

}
