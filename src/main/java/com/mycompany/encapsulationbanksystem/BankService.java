/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulationbanksystem;

/**
 *
 * @author user
 */
public class BankService {
    public void deposit(BankAccount acc, double amount){
        if(amount > 0){
            acc.setBalance(acc.getBalance() + amount);
            System.out.println("Deposit berhasil");
        } else {
            System.out.println("Jumlah deposit tidak valid");
        }
    }

    public void withdraw(BankAccount acc, double amount){
        if(amount > 0 && acc.getBalance() >= amount){
            acc.setBalance(acc.getBalance() - amount);
            System.out.println("Withdraw berhasil");
        } else {
            System.out.println("Saldo tidak cukup");
        }
    }

    public void checkBalance(BankAccount acc){
        System.out.println("Saldo saat ini: " + acc.getBalance());
    }
}