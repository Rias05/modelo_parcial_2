/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noxie
 */
import model.Mercancia;
import model.Producto;
import model.Servicio;

public class Sistema {

    private List<Mercancia> lstMercancia;

    public Sistema() {
        this.lstMercancia = new ArrayList<>();

    }

    public Mercancia traerMercancia(String codMercancia) {
        //Retorna una mercancía a partir de su código.
        for (Mercancia m : lstMercancia) {
            if (m.getCodMercancia().equals(codMercancia)) {
            }

        }
        return null;

    }

    public List<Mercancia> traerMercancia(boolean enOferta) {
        //  Retorna una lista de mercancías que están en oferta, ya sea porque el producto tiene descuento en la 2° unidad o el servicio está en promoción.

        List<Mercancia> mercanciasEnOferta = new ArrayList<>();
        if (enOferta) {
            for (Mercancia m : lstMercancia) {
                if (m instanceof Producto) {
                    Producto producto = (Producto) m;  // Casting a Producto
                    if (producto.isEsDescuentoEn2daUnidad()) {
                        mercanciasEnOferta.add(producto);
                    }
                } else if (m instanceof Servicio) {
                    Servicio servicio = (Servicio) m;  // Casting a Servicio
                    if (servicio.isEnPromocion()) {
                        mercanciasEnOferta.add(servicio);
                    }
                }

            }
        }
        return mercanciasEnOferta;
    }

    public boolean agregarProducto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnida) throws CodigoDuplicadoException {
        // Agrega un producto a la lista de mercancías, lanzando una excepción si ya existe un producto con el mismo código

        for (Mercancia m : lstMercancia) {
            if (m.getCodMercancia().equals(codMercancia)) {
                throw new CodigoDuplicadoException("ya hay un codigo como este" + codMercancia);

            }

        }
        Mercancia productos = new Producto(producto, precioProducto, porcentajeDescuento, esDescuentoEn2daUnida, codMercancia);
        lstMercancia.add(productos);
        boolean confirmacion = true;
        return true;
    }

    public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws CodigoDuplicadoException {
        for (Mercancia m : lstMercancia) {
            if (m.getCodMercancia().equals(codMercancia)) {
                throw new CodigoDuplicadoException("ya hay un codigo como este" + codMercancia);
            }

        }
        Mercancia servicios = new Servicio(servicio, presupuesto, porcentajeDescuento, enPromocion, codMercancia);

        lstMercancia.add(servicios);
        boolean confirmacion = true;
        return true;

    }
}
