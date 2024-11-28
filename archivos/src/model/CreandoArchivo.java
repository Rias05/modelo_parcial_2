/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Noxie
 */
public class CreandoArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// creando archvio txt
// caracteres maneja solo textos
        try {
            File file = new File("archivo.txt");// puntero file

            if (file.createNewFile()) {
                System.out.println("archivo creado:" + file.getName());

            } else {
                System.out.println("el archivo ya existe");
            }

            System.out.println("existe el archivo? " + file.exists());
            System.out.println("se puede leer? " + file.canRead());
            System.out.println("se puede escribir ? " + file.canWrite());
            System.out.println("ruta absoluta " + file.getAbsolutePath());
            System.out.println(" es un archivo " + file.isFile());
            System.out.println(" es  un directorio " + file.isDirectory());
            if (file.delete()) {
                System.out.println("se puedo eliminar el archivo " + file.getName());
            } else {
                System.out.println("no se pudo eliminar el archivo " + file.getName());
            }

        } catch (IOException e) {
            System.out.println("ocurrio un error");
           // e.printStackTrace();

        }
        File file2 = new File("C:\\Users\\Noxie\\Documents\\NetBeansProjects\\archivos\\src\\archivos.txt");

        if (file2.delete()) {
                System.out.println("se puedo eliminar el archivo " + file2.getName());
            } else {
                System.out.println("no se pudo eliminar el archivo " + file2.getName());
            }

    }

}
