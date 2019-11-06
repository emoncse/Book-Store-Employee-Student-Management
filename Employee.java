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
public class Employee {
    public String name;
    public int id;
    public String designation;
    public double salary;

    public Employee() {
    }
    
    public Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
    
    void updateSalary(double newSal){
        salary = newSal;
        System.out.println("New salary updated.");
    }
    
    double getSalary(){
        return salary;
    }
    
    void display(){
        System.out.println("Name : " + name + " ID : " + id + " Desig : " + designation + " Salary : " + salary);
    }    
}
