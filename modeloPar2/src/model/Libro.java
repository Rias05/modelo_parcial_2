/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Noxie
 */
public class Libro implements Serializable {

    private int id;
    private String titulo;
    private String autor;

    public Libro(int id, String titulo, String autor) {
        if (titulo == null || titulo.length() < 3) {
            throw new IllegalArgumentException("El título debe tener al menos 3 caracteres.");
        }
        if (autor == null || autor.length() < 3) {
            throw new IllegalArgumentException("El autor debe tener al menos 3 caracteres.");
        }
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.length() < 3) {
            throw new IllegalArgumentException("El título debe tener al menos 3 caracteres.");
        }
            this.titulo = titulo;
    }

    public String getAutor() {
        
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.length() < 3) {
            throw new IllegalArgumentException("El autor debe tener al menos 3 caracteres.");
        }
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + '}';
    }

}
