/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */
public class OrdinaryInvoice extends Invoice {

    public OrdinaryInvoice(int id, double amount) {
        super(id, amount);
    }

    @Override
    public void printDetails() {
        System.out.println("el total es " +  amount + "su identificador es :" + id    );
    }
    
    
}
