/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
import java.util.ArrayList;
import model.Categoria;
import model.Estudiante;

public class Curso {
    private String nombre;
    private String codigo;
    private int capacidad;
    private Categoria categoria;
    private  ArrayList<Estudiante> estudiantes;

    public Curso(String nombre, String codigo, int capacidad, Categoria categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.estudiantes =  new ArrayList<>();
        ArrayList<Double> lista = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void calificarCurso(double calificacion){
       ArrayList<Double> lista = new ArrayList<>();

     
      lista.add(calificacion);
      double  acumulador = 0 ;
      int contador = 0;
      for (double numero : lista) {
            acumulador += numero;
            contador++;
        }
      double promedio = acumulador/ contador;
      System.out.println("El promedio es: " + promedio);
      
      
      
     
     }
    public void inscribirEstudiante(Estudiante estudiante){
        // añade un estudiante a la lista si hay espacio disponible.
        estudiantes.add(estudiante);
        
      
    }
    public void removerEstudiante(Estudiante estudiante){
        estudiantes.remove(estudiante);
    }
  
    

    
    public void mostrarInformacion () {
        //

        System.out.println("nombre " + nombre +  " codigo "+  codigo + "capacidad " + capacidad  ); 
        categoria.mostrarInfo();
     
        
    }


    
}
