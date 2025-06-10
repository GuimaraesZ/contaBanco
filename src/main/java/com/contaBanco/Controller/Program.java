package com.contaBanco.Controller;

import java.util.Scanner;
import com.contaBanco.model.Account;
import java.util.Locale;
public class Program {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bank Account Management System");
        System.out.println("Please enter your account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Please enter your agency:");
        String agencia = sc.nextLine();        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Please enter your initial balance:");
        double balance = sc.nextDouble();
        
        Account account = new Account(accountNumber, agencia, name, balance);
        
        
        System.out.println("\nAccount created successfully!");
        System.out.println("Hello " + account.getName() + ", thank you for creating an account with our bank!");
        System.out.println("Your agency is " + account.getAgencia() + ", account " + account.getAccountNumber() + " and your balance $" + String.format("%.2f", account.getBalance()) + ".");
        
        sc.close();
    }
    
}
