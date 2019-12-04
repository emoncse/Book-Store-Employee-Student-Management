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
public abstract class Employee {
    private String name;
    private String id;
    private String designation;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    
    public abstract double getSalary();
    public abstract void increaseSalary(double amt);
    
    void display(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Designation : " + designation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
}
