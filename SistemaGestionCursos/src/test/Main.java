/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import model.Categoria;
import model.Curso;
import model.Estudiante;

/**
 *
 * @author Noxie
 */
public class Main {
     public static void main(String[] args){
        Categoria programacion = new Categoria ("programacion");
        Categoria diseno = new Categoria("Diseño");

        // Crear cursos
        Curso javaCurso = new Curso("Java para Principiantes", "JAV101", 2, programacion);
        Curso disenoGrafico = new Curso("Diseño Gráfico", "DSG101", 3, diseno);

        // Crear estudiantes
        
        Estudiante estudiante1 = new Estudiante("Juan Perez", "2024A001");
        Estudiante estudiante2 = new Estudiante("Maria Gomez", "2024A002");
        Estudiante estudiante3 = new Estudiante("Carlos Sanchez", "2024A003");

        // Inscribir estudiantes en cursos
        javaCurso.inscribirEstudiante(estudiante1);
        javaCurso.inscribirEstudiante(estudiante2);
        javaCurso.inscribirEstudiante(estudiante3); // Este no podrá inscribirse porque el curso está lleno

        disenoGrafico.inscribirEstudiante(estudiante1);
        disenoGrafico.inscribirEstudiante(estudiante3);

        // Mostrar información del curso
        javaCurso.mostrarInformacion();
        disenoGrafico.mostrarInformacion();

        // Calificar los cursos
        javaCurso.calificarCurso(32);
        javaCurso.calificarCurso(3.8);

        disenoGrafico.calificarCurso(5.0);
        disenoGrafico.calificarCurso(4.2);
        disenoGrafico.calificarCurso(4.7);

        // Mostrar información del curso después de calificar
        javaCurso.mostrarInformacion();
        disenoGrafico.mostrarInformacion();

        // Mostrar información del estudiante
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();


         
     }
    
}
 