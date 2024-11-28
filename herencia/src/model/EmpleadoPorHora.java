/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class EmpleadoPorHora extends Empleado {

    private int hora;
    private double salarioPorHora;

    public EmpleadoPorHora(int hora, double salarioPorHora, String nombre) {
        super(nombre);
        this.hora = hora;
        this.salarioPorHora = salarioPorHora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * hora;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHora{" + "hora=" + hora + ", salarioPorHora=" + salarioPorHora + '}';
    }

}
