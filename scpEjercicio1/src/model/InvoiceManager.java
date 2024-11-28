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
public class InvoiceManager {
        private List<Invoice> invoices;

    public InvoiceManager(List<Invoice> invoice) {
        this.invoices = invoice;
        
    }
    
      public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }
     public double TotalAmount() {
        double totalAmount = 0.0;
        for (Invoice invoice : this.invoices) {
            totalAmount += invoice.getAmount();
        }
        return totalAmount;
     }
   
        

    
}
