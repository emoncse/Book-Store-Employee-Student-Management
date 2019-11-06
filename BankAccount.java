/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imran;

/**
 *
 * @author Imran Nazir Emon
 */
public class BankAccount {
    public String name;
    public int id;
    public double balance;   

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        
    }
    
    
    void deposite(double depAmount){
        balance = balance + depAmount;
        System.out.println(depAmount + " BDT Deposite successful.");
    }
    void withdraw(double withAmount){
        if(balance >= withAmount){
            balance -= withAmount;
            System.out.println("Successfully withdraw money : " + withAmount);
        }
        else {
            System.out.println("Balance insuffcient.");
        }
    }
    
    double getBalance(){
        return balance;
    }
    void display(){
        System.out.println("Name : " + name + " ID : " + id + " Balance : " + balance);
    }
}
