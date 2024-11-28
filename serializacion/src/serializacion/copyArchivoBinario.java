/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Noxie
 */
public class copyArchivoBinario {

    public static void main(String[] args) {
        // pimera forma 
        // Rutas de los archivos
        String archivoEntrada = "ruta/a/archivo.txt";
        String archivoSalida = "ruta/a/copia_archivo.txt";

        // Crear flujos de entrada y salida de caracteres
        try (FileReader fr = new FileReader(archivoEntrada); FileWriter fw = new FileWriter(archivoSalida)) {

            int charLeido;
            // Leer carácter a carácter del archivo de entrada y escribirlos en el archivo de salida
            while ((charLeido = fr.read()) != -1) {
                fw.write(charLeido);
            }

            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
        // segunda forma 

        //String sourcefile = "source.bin";
       // String destinationfile = "destination.bin";
     String sourcefile = "C:\\Users\\Noxie\\Desktop\\notas.txt"; // Ruta del archivo en el escritorio
     String destinationfile = "C:\\Users\\Noxie\\Desktop\\copynotas.txt"; // Ruta del archivo destino

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourcefile);
            fos = new FileOutputStream(destinationfile);

            // tamaño del buffer para leer y escribir de a bloques 
            byte[] buffer = new byte[1024];
            int bytesread;
            while ((bytesread = fis.read(buffer)) != -1) { //termina de lleer hasta llegar a -1
                fos.write(buffer, 0, bytesread);
            }
            // mensaje de confirmacion
            System.out.println("archivo copiado de " + sourcefile + "y la copia destino" + destinationfile);

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                if (fis != null) {
                    fis.close();

                }
                if (fos != null) {
                    fos.close();

                }

            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }

    }

}
