/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class EmpleadoSalariado extends Empleado {
    private double salario ;

    public EmpleadoSalariado(double salario, String nombre) {
        super( nombre);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "EmpleadoSalariado{" + "salario=" + salario + " nombre :" + nombre +  " identificacion: " + identificador ;
    }

    
}
