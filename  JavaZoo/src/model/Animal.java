/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private String especie;
    private int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }



    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void hacerSonido(){
         System.out.println("El " + especie + " " + nombre + " hace un sonido.");
        
    }
    public void comer(String comida){
        System.out.println(" el  " + nombre + " esta comiendo " + comida  );
    }
    
}
