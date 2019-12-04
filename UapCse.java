/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uap_hr;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class UapCse {
    
    ArrayList<Employee>employees;
    String name;

    public UapCse(String name) {
        employees = new ArrayList<Employee>();
        this.name = name;
    }
    
    
    
    private void addNewEmployee(Employee e){
        employees.add(e);
    }
    
    void addNewEmployee(String n, String I, String d, double s){
        Employee salariedEmployee = new SalariedEmployee(n, I, d, s);
        employees.add(salariedEmployee);
    }
    void addNewEmployee(String n, String I, String d, double hr, int hw){
        Employee hourlyEmployee = new HourlyEmployee(n, I, d, hr, hw);
        employees.add(hourlyEmployee);
    }
    void addNewEmployee(String n, String I, String d, double p, double s){
        Employee commissionEmployee = new CommissionEmployee(n, I, d, p, s);
        employees.add(commissionEmployee);
    }
    Employee findEmployee(String id){
        System.out.println("Size = " + employees.size());
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            } 
        }
        return null;
    }
    void increaseSalary(String id, double amt){
        Employee employee = findEmployee(id);
        employee.increaseSalary(amt);
    }
    double getSalary(String id){
        Employee employee = findEmployee(id);
        return employee.getSalary();
    }
    
    void display(String id){
        Employee employee = findEmployee(id);
        if( employee == null) System.out.println("Not exist.");
        else  employee.display();
    }
    void display(){
        for(Employee employee : employees){
            employee.display();
        }
    }
    
}
