/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Noxie
 */
public class InvoiceReportGenerator {
    // Método para generar un reporte simple de todas las facturas

    public void generateSimpleReport(List<Invoice> invoices) {
         System.out.println("Generating report...");
        System.out.println("Simple Invoice Report:");
        invoices.forEach(invoice -> {
            System.out.println(invoice.toString());
        });
        // for (Invoice invoice : invoices) 
        //System.out.println(invoice.toString())
        
    }

    {

    }

}
