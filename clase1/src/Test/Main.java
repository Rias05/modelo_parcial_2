/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Model.Auto;
import Model.Estudiante;

/**
 *
 * @author Noxie
 */
public class Main {

    public static void main(String[] args) {

        // Declaración e inicialización aparte
        int x;
        x = 0;

        //o todo junto
        int y = 1;
        char caracter = 'A';
        double numeroConComa = 4.5;
        boolean bandera = true;
        String texto = "Hola Mundo";
        int snake_case = 1;
        int camelCase = 2;

        //Estructuras condicionales
        if (bandera) {
            System.out.println("Es true");
        } else {
            System.out.println("Es true");
        }

        if (!bandera) {
            System.out.println("Es true");
        } else if (y % 2 == 0) {
            System.out.println("Es true");
        }

        if (x < 2 && y > 0) {

        }

        // estructuras repetitivas
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 6;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
        } while (i <= 5);

        Estudiante estudiante1 = new Estudiante("Matias", "Velasquez", 26, "PrograII", 10);
        System.out.println(estudiante1);
        estudiante1.mostraInformacion();
    }

}
