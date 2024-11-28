/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Noxie
 */
import model.EmpleadoSalariado;
import model.EmpleadoPorHora;
import model.Empleado;
public class herencia {
       public static void main(String[] args) {
           EmpleadoSalariado empleado = new EmpleadoSalariado( 212,"simi");
           System.out.println(empleado);
           EmpleadoPorHora empleado2 = new EmpleadoPorHora( 6, 1999,"stif");
           System.out.println(empleado2);
           Empleado empleado52 = new EmpleadoSalariado(500,"SDSwqwqsdsdwqwqw");
           System.out.println(empleado52.calcularSalario());
           
           
       }
}
