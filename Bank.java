/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imran;

import java.util.Scanner;

/**
 *
 * @author Imran Nazir Emon
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        BankAccount bankAccount = new BankAccount("Imran", 1234, 50000.0);
        
        bankAccount.name = "Asraf";
        
        bankAccount.withdraw( 5000 );
        System.out.println("Current Balance : " + bankAccount.getBalance() );
        
        bankAccount.deposite(10000);
        System.out.println("Current Balance : " + bankAccount.getBalance() );
        
        bankAccount.display();
        
        
    }
    
}
