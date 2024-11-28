/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class Libro {
    private String titulo;
    private String identificador;
    private boolean prestado;

    public Libro(String titulo, String identificador) {
        this.titulo = titulo;
        this.identificador = identificador;
        this.prestado = false;
        
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", identificador=" + identificador + ", prestado=" + prestado + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public void prestar(){
        this.prestado = false;
    }
    public void delvolver(){
        this.prestado = true;
    }
    
}
