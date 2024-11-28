/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.io.FileNotFoundException;

/**
 *
 * @author Noxie
 */
public interface ArchivoManejador {
   void abrirArchivo(String nombreArchivo)throws FileNotFoundException ;
   void cerrarArchivo()   throws IllegalStateException ;
   
    
}
