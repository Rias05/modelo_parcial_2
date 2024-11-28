/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Guitarra extends InstrumentoMusical{
    private int volumen;

    public Guitarra(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public void tocar() {
        System.out.println("tocando la guitarra con volumen ; "+ volumen);
    }


    
}
