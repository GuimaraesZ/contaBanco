package com.contaBanco.model;

public class Account {
    
    private int accountNumber;
    private String agencia;
    private String name;
    private double balance;


    public Account(int accountNumber, String agencia, String name, double balance) {
        this.accountNumber = accountNumber;
        this.agencia = agencia;
        this.name = name;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", agencia='" + agencia + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

}
