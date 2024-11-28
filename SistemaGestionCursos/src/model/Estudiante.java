/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
import java.util.ArrayList;
import model.Curso;

public class Estudiante {
    private String nombre;
    private String matricula;
    private  ArrayList<Curso> cursosInscritos;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        
    }
    public void inscribirseEnCurso(Curso curso){
        // añade un curso a la lista de cursos inscritos.

          ArrayList<Curso> cursosinscritos = new ArrayList<>();
          cursosinscritos.add(curso);
    }
    public void mostrarInformacion(){
        //  imprime en consola el nombre del estudiante, su matrícula, y los cursos en los que está inscrito.
        

        
    }
}
