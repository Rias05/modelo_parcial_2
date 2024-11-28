/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Noxie
 */
public class GestorBiblioteca  {
    final Repository<Libro> libroRepository;

    public GestorBiblioteca(Repository<Libro> libroRepository) {
        
        this.libroRepository = libroRepository;
    }

    public Repository<Libro> getLibroRepository() {
        return libroRepository;
    }

 
    

  public void agregarLibro(String titulo, String autor){
       int nuevoId = libroRepository.findAll().size() + 1; // Asigna un ID basado en la cantidad de libros
        Libro nuevoLibro = new Libro(nuevoId, titulo, autor);
        libroRepository.add(nuevoLibro);
  }
  public Optional<Libro> buscarLibroPorId(int id){
      return libroRepository.findById(id); // Usamos el repositorio para buscar por ID
              
  }
  public List<Libro> buscarLibrosPorAutor(String autor){
      return libroRepository.findByAuthor(autor);
  }
  public List<Libro> listarLibros(){
      return libroRepository.findAll();
  }
  
}
