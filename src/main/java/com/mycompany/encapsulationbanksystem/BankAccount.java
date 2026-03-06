/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulationbanksystem;

/**
 *
 * @author user
 */
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String email;
    private String phoneNumber;

    // Constructor kosong
    public BankAccount() {
        balance = 0;
    }

    // Constructor dengan parameter
    public BankAccount(String accountNumber, String ownerName, double balance, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter dengan validasi
    public void setOwnerName(String ownerName) {
        if(ownerName != null && !ownerName.isEmpty()){
            this.ownerName = ownerName;
        } else {
            System.out.println("Nama tidak boleh kosong");
        }
    }

    public void setBalance(double balance) {
        if(balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("Saldo tidak boleh negatif");
        }
    }

    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
        } else {
            System.out.println("Email tidak valid");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() >= 10){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Nomor HP tidak valid");
        }
    }
}
