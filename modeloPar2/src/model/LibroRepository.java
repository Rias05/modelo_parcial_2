/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Noxie
 */
public class LibroRepository implements Repository<Libro> {

    private List<Libro> libros;
    private String filePath;

    public LibroRepository(String filePath) {
        this.libros = new ArrayList<>();
        this.filePath = filePath;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void add(Libro entity) {
        libros.add(entity);

    }

    @Override
    public Optional<Libro> findById(int id) {
        for (Libro l : libros) {
            if (l.getId() == id) {
                return Optional.of(l);
            }

        }
        return Optional.empty(); // Si no se encuentra, devuelve un Optional vacío

    }

    @Override
    public List<Libro> findAll() {
        return libros;

    }

    @Override
    public List<Libro> findByAuthor(String autor) {
        List<Libro> autores = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAutor().equals(autor));
            autores.add(l);

        }
        if (autores.isEmpty()) {
            throw new IllegalArgumentException("Error: No hay ningún autor con el nombre de: " + autor);
        }
        return autores;

    }
    public void saveAll(){
        // serializacion guarda el objecto en un archivo
           try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (filePath)) ){
               oos.writeObject(libros);
               System.out.println("objecto serializado"+ libros);
               
               
               
           }
           catch(IOException e){
               System.out.println("error en la serializacion " + e.getMessage());
               
           }
           // deserializacion: leer el objecto desde ela rchivo
        
      
        }

    public void loadAll(){
          try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream (filePath)) ){
              //Libro personaDeserializada = (Libro) ois.readObject();
               //System.out.println("objecto DEserializado"+ libros);
               List<Libro> librosDeserializados = (List<Libro>) ois.readObject();
                System.out.println("Objeto deserializado: " + librosDeserializados);
               
               
           }
           catch(IOException |ClassNotFoundException  e){
               System.out.println("error en la serializacion " + e.getMessage());
               
           }
    }
    
            

}
