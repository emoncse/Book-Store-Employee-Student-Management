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
public class CommissionEmployee extends Employee{
    double commission;
    double sale;

    public CommissionEmployee(String name, String id, String designation, double commission, double sale) {
        super(name, id, designation);
        this.commission = commission;
        this.sale = sale;
    }

    double getSalary(double _sale){
        return commission * _sale;
    }
    
    @Override
    public double getSalary() {
        return commission * sale;
    }

    @Override
    public void increaseSalary(double amt) {
        commission += amt;
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("Comission : " + commission);
    }
}
