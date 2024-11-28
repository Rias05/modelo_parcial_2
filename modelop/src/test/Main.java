/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import model.CodigoDuplicadoException;
import model.Mercancia;
import model.Servicio;
import model.Producto;
import model.Sistema;

/**
 *
 * @author Noxie
 */
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("primer serivoicod");
            //codMercancia=897323, servicio=Mantenimiento máquina de cortar pasto, presupuesto=2500.0, porcentajeDescuento=15.0, enPromocion=true
            Mercancia servicio1 = new Servicio("Mantenimiento de cortat pasto", 2500.0, 15.0, true, "897323");
            System.out.println("1-2");
            Mercancia servicioo2 = new Servicio("Mantenimiento maquina de cortar pasto", 2500.0, 15.0, true, "8973231");
            Mercancia producto1 = new Producto("Manguera de desagote lavarropa", 650.0, 15.0, true, "432597");
            System.out.println("1-4");
            Mercancia producto2 = new Producto("Manguera de desagote lavarropa", 659.0, 15.0, true, "4325971");
            System.out.println(producto2);
            System.out.println("2-1");
            double preciofinal1 = servicio1.calcularPrecioFinal();
            System.out.println(preciofinal1 + "este es el precio final ");
                        System.out.println("2-2");
            double preciofinal2 = producto2.calcularPrecioFinal();
            System.out.println(preciofinal2);
            System.out.println("3-1");
            Producto producto3 = new Producto("Aceite para máquinas", 430.0, 10.0, true, "3892871");
            Producto producto4 = new Producto("Tambor lavarropa", 7500.0, 25.0, false, "9381925");
              Servicio servicio3 = new Servicio("Mantenimiento de cortadora de césped", 2520.0, 0.0, true, "3892815");
                Servicio servicio4 = new Servicio("Mantenimiento estufa", 1250.0, 0.0, false, "3481759");
            Sistema sistema = new Sistema();
            sistema.agregarProducto("3892871", "Aceite para máquinas", 430.0, 10.0, true);
            sistema.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 25.0, false);
            sistema.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 0.0, true);
            sistema.agregarServicio("3481759", "Mantenimiento estufa", 1250.0, 0.0, false);
            System.out.println(sistema + " matenme ya ");
            //Servicio [codMercancia=3892815, servicio=Mantenimiento de cortadora de césped, presupuesto=2520.0, enPromocion=true].
            //sistema.agregarServicio("3892815", "mantenimiento de cortadora de cesped", 2520.0,0.0, true);
          //  sistema.agregarProducto("9381925","Tambor lavarropa", 7500.0, 25.0, false);
            //Traer todos los objetos Mercancia que están en oferta (enOferta=true)
            
            
             List<Mercancia> listaoferta = sistema.traerMercancia(true);
             for (Mercancia m: listaoferta){
                 System.out.println(m);
                 
             }
         
            }
           

   
            
            

            
        
        catch (CodigoDuplicadoException e) {
            System.out.println(e.getMessage());

        }

    }

}
