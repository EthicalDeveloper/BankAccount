package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String fullName;
    private String email;
    private String phoneNumber;

    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }




    public double getBalance(){
        return this.balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double amount){
        this.balance += amount;

        System.out.println("Your balance is: " + this.balance);
    }

    public void withdraw(double amount){

        if (this.balance <= 0){
            System.out.println("Insufficient funds for withdrawal");
            System.out.println("Your balance is: " + this.balance);
        }else{
            this.balance -= amount;
            System.out.println("Your balance is: " + this.balance);
        }

    }


}
