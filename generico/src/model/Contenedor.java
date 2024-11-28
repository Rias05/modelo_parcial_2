/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Contenedor<T> {
    private T objecto;

    public Contenedor(T objecto) {
        this.objecto = objecto;
    }

    public T getObjecto() {
        return objecto;
    }

    public void setObjecto(T objecto) {
        this.objecto = objecto;
    }
    
     
    
}
