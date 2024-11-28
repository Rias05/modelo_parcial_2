/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Noxie
 */
import java.io.FileNotFoundException;
import model.ArchivoManejador;
import model.ArchivoTextoManejador;

public class Main {

    public static void main(String[] args) {
        ArchivoManejador archivo = new ArchivoTextoManejador("cfdsfsfs");
        
        try {
            archivo.abrirArchivo("dfdffdf");
            archivo.cerrarArchivo();

        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            
        }
        catch(IllegalStateException e ){
            System.out.println(e.getMessage());
            
        }
    }

}
