/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.List;
import model.Biblioteca;
import model.GestorBiblioteca;
import model.Libro;
import model.LibroRepository;
import model.Repository;
import java.util.HashMap;

/**
 *
 * @author Noxie
 */
public class Main {

    public static void main(String[] args) {
        

        // Crear un repositorio de libros con la ruta del archivo de persistencia
        Repository<Libro> libroRepository = new LibroRepository("libros.dat");

        GestorBiblioteca gestor = new GestorBiblioteca(libroRepository);
        Biblioteca biblioteca = new Biblioteca("lasala", gestor);
        biblioteca.getGestor().agregarLibro("Cien Años de Soledad", "Gabriel Garcia Marquez");
        biblioteca.getGestor().agregarLibro("Don Quijote de la Mancha", "Miguel de Cervantes");
        biblioteca.getGestor().agregarLibro("El Amor en los Tiempos del Cólera", "Gabriel Garcia Marquez");
        List<Libro> autoresporLibro = gestor.buscarLibrosPorAutor("Gabriel Garcia Márquez");

        System.out.println(biblioteca.getGestor().buscarLibroPorId(1));
        System.out.println(biblioteca.getGestor().listarLibros());
        //((LibroRepository) libroRepository).saveAll();
        GestorBiblioteca ges = biblioteca.getGestor();
        LibroRepository librosrepo = (LibroRepository) ges.getLibroRepository();
        librosrepo.saveAll();
        librosrepo.loadAll();

    }

}
