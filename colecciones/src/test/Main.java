 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import java.util.ArrayList;



/**
 *
 * @author Noxie
 */
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import model.Tren;
import model.Reserva;
import model.Estacion;
public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        int valor = mapa.get("clave1"); // Retorna 10
        System.out.println("El valor asociado a 'clave1' es: " + valor);
        mapa.remove("clave2");
        if (mapa.containsKey("clave1")) {
            System.out.println("La clave 'clave1' está presente en el mapa.");
        }

        if (mapa.containsValue(10)) {
            System.out.println("El valor 10 está presente en el mapa.");
        }
        for (String clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
        }
        
        
        LinkedList<String> lista = new LinkedList<>();
        lista.add("ey");
        lista.add("hola");
        lista.add("sde");
        lista.addFirst("goku");
        for(String l:lista){
            System.out.println(l);
            if(l=="goku"){
                System.out.println("super saiyayin econtrado");
            }
            
        }
      
        System.out.println(lista.getLast());

    
        ArrayList<Reserva> reservas = new ArrayList<>();
        Reserva reserva1 = new Reserva("Juan Pérez", 4, LocalDate.of(2024, 9, 20));
        Reserva reserva2 = new Reserva("Ana López", 2, LocalDate.of(2024, 9, 21));
        Reserva reserva3 = new Reserva("Carlos García", 6, LocalDate.of(2024, 9, 22));
        Reserva reserva4 = new Reserva("María Fernández", 3, LocalDate.of(2024, 9, 23));
        Reserva reserva5 = new Reserva("Pedro Martínez", 5, LocalDate.of(2024, 9, 24));
        reserva1.confirmar();
        // Agregar reservas a la lista
        reservas.add(reserva1);
        
        reservas.add(reserva2);
        reservas.add(reserva3);
        reservas.add(reserva4);
        reservas.add(reserva5);
        
        for (Reserva reserva : reservas) {
    // C reódigo a ejecutar para cada elemento
            reserva.toString();
            System.out.println(reserva);
        }
       // System.out.println(reservas);
        //Crea una clase Main con el método main.
        //Crea al menos tres instancias de Estacion y cinco instancias de Tren.
        //Cada tren debe agregar entre 5 y 8 tiempos aleatorios para las estaciones.
        //Para cada estación, muestra la lista de trenes que pasan por ella y el tiempo total que cada tren pasará en las estaciones.
         
        Estacion estacion1 = new Estacion("Central");
        Estacion estacion2 = new Estacion("Norte");
        Estacion estacion3 = new Estacion("Sur"); 
        
        Tren tren1 = new Tren("T1");
        Tren tren2 = new Tren("T2");
        Tren tren3 = new Tren("T3");
        Tren tren4 = new Tren("T4");
        Tren tren5 = new Tren("T5");
        
        
         tren1.agregarTiempo(5);
        tren1.agregarTiempo(7);
        tren1.agregarTiempo(10);

        tren2.agregarTiempo(3);
        tren2.agregarTiempo(6);
        tren2.agregarTiempo(2);

        tren3.agregarTiempo(4);
        tren3.agregarTiempo(9);

        tren4.agregarTiempo(8);
        tren4.agregarTiempo(5);

        tren5.agregarTiempo(7);
        tren5.agregarTiempo(3);
        tren5.agregarTiempo(5);
         
        estacion1.agregarTren(tren1);
        estacion1.agregarTren(tren3);

        estacion2.agregarTren(tren2);
        estacion2.agregarTren(tren4);

        estacion3.agregarTren(tren5);
        estacion3.agregarTren(tren1);;
        
        estacion1.mostrarTrenes();
        estacion2.mostrarTrenes();
        estacion3.mostrarTrenes();
        
        
        

    }
}