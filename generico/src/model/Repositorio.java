/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noxie
 */
public class Repositorio<T> { // forma de decitr que es un tipo generico esta clase va aceptar cualquier tipo de elemento

    private List<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {

        return elementos.get(indice);

    }

    public List<T> obtenertodos() {
        for (T i : elementos){
            System.out.println(i);
            
        }
        return elementos;

    }

}
