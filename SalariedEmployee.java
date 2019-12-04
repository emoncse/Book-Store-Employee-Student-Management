/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uap_hr;

/**
 *
 * @author Student
 */
public class SalariedEmployee extends Employee{
    
    private double monthlySalary;

    public SalariedEmployee(String name, String id, String designation, double salary) {
        super(name, id, designation);
        this.monthlySalary = salary;
    }

   
    @Override
    public double getSalary() {
        return monthlySalary;
    }

    @Override
    public void increaseSalary(double amt) {
        monthlySalary += amt;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Salary : " + monthlySalary);
    }   
}
