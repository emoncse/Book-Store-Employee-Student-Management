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
public class UapHr {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
    
        Employee employee = new Employee("Imran", 123456, "Administrator", 100000.0);
    
        System.out.println("Current Salary : " + employee.getSalary());
        
        employee.updateSalary(sc.nextDouble());
        
        employee.display();
        
    }
    
}
