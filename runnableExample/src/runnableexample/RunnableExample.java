/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runnableexample;

/**
 *
 * @author Noxie
 */
public class RunnableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Runnable runnable1 = new Runnable() {// es una interfaz funcional, tiene un solo metodo
            
            // se evita el desorden de declarar clases adicionales para pequeñas funcionalidades
            
            @Override
            public void run() {
                System.out.println("ejecuntado el hilo usando una clase");
            }

        };
        
        // usando una expresion lamda para implementar runnable
        // menos codigo 
        // las interfaces funcionaes tienen solo un metodo abtractro
        Runnable runnable2 = () -> System.out.println("ejecutando en un hilo con lamba");
        
    // craciobn de los hilos de ejecucuion
        Thread Thread1 = new Thread(runnable1);
        Thread Thread2 = new Thread(runnable2);
        
        Thread1.start();
        Thread2.start();
        

    }

}
