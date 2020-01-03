package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account_1 = new BankAccount();
        account_1.setBalance(1000);
        account_1.setAccountNumber("00001");
        account_1.setFullName("Kerimjan Rejepov");
        account_1.setEmail("r.kerimjan@gmail.com");
        account_1.setPhoneNumber("4696647092");

        account_1.deposit(2000);
        account_1.withdraw(150);


        System.out.println(account_1.getFullName() + " has " + account_1.getBalance() + " $ " + " in his account...");





    }
}
