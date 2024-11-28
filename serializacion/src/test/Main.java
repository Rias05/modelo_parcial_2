/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import serializacion.Persona;

/**
 *
 * @author Noxie
 */
public class Main {
   // String[] es un arreglo que contiene cadenas de strings
    // cada elemento de este arreglo corresponde a los argumentos en la linea de comando
    // args es simplemente el nombre de este arreglo lo podemos cambiar
        public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
            // uso de args
            // si no se pasa argumentos args.legnt == 0
            // paara aceder a cada elemento lo ahcemos con los indices del arreglo
              //args = new String[]{"origen", "hola", "que", "onda", "perro"};

            System.out.println("numeros de argumentos" + ":"+ args.length);
            
            
                
            for (int i = 0; i < args.length; i++) {
                System.out.println("argumento" + i + " : "+ args[i]);
                
            }
            Persona persona  =  new Persona("esncia",34,"1234" );
            
            // ruta del archivo donde se guardada el objecto serializable
            String archivo = "persona.dat";
            
            
           // serializacion guarda el objecto en un archivo
           try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (archivo)) ){
               oos.writeObject(persona);
               System.out.println("objecto serializado"+ persona);
               
               
               
           }
           catch(IOException e){
               System.out.println("error en la serializacion " + e.getMessage());
               
           }
           // deserializacion: leer el objecto desde ela rchivo
        
        try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream (archivo)) ){
               Persona personaDeserializada = (Persona) ois.readObject();
               System.out.println("objecto DEserializado"+ persona);
               
               
               
           }
           catch(IOException |ClassNotFoundException  e){
               System.out.println("error en la serializacion " + e.getMessage());
               
           }
        }

    
}
