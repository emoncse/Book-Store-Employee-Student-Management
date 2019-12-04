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
    
    private void addNewEmployee(Employee e){
        employees.add(e);
    }
    
    void addNewEmployee(String n, String I, String d, double s){
        SalariedEmployee salariedEmployee = new SalariedEmployee(n, I, d, s);
        addNewEmployee(salariedEmployee);
    }
    void addNewEmployee(String n, String I, String d, double hr, int hw){
        HourlyEmployee hourlyEmployee = new HourlyEmployee(n, I, d, hr, hw);
        employees.add(hourlyEmployee);
    }
    void addNewEmployee(String n, String I, String d, double p, double s){
        CommissionEmployee commissionEmployee = new CommissionEmployee(n, I, d, p, s);
        employees.add(commissionEmployee);
    }
    Employee findEmployee(String id){
        for (Employee employee : employees) {
            if (employee.getId() == null ? id == null : employee.getId().equals(id)) {
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
        employee.display();
    }
    void display(){
        for(Employee employee : employees){
            employee.display();
        }
    }
    
}
