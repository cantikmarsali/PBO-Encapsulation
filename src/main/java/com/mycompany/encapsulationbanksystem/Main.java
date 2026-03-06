/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulationbanksystem;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("12345","Komang",1000000,"komang@email.com","08123456789");

        BankService service = new BankService();

        service.checkBalance(acc1);

        service.deposit(acc1,500000);

        service.withdraw(acc1,200000);

        service.checkBalance(acc1);
    }
}
