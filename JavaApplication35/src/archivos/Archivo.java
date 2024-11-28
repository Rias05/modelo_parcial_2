/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Noxie
 */
// main
public class Archivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
// leer en binarios  
       try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Noxie\\Documents\\NetBeansProjects\\JavaApplication35\\src\\archivos\\imagen.png")) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.println(data + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
