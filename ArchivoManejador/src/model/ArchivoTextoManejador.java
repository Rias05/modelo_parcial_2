/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileNotFoundException;

/**
 *
 * @author Noxie
 */
public class ArchivoTextoManejador implements ArchivoManejador {
    private String texto;
    private boolean abierto;

    public ArchivoTextoManejador(String texto) {
        this.texto = texto;
        this.abierto = false;
        
    }

    @Override
    public void abrirArchivo(String nombreArchivo) throws FileNotFoundException {
        
        if (nombreArchivo.isEmpty()){
            throw new FileNotFoundException ("el archivo no existe");
            
        }
        
        System.out.println("archivo abieryto");
                this.abierto = true;

    
    
    }

    @Override
    public void cerrarArchivo() {
        if (abierto== false){
            throw new IllegalStateException(" no se cerrar algo que esta cerrado");
         
            
            
        }
        System.out.println("cerrrado master");
        this.abierto = false;
    }
    
    
    
    
    
    
    
    
    
}
