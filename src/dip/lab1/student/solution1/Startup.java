/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author James
 */
public class Startup {
    
    public static void main(String[] args) {
        
        Employee emp1 = new HourlyEmployee(15.0, 2000);
        Employee emp2 = new SalariedEmployee(45000, 1234);
        
        HRService hr = new HRService();
        
        System.out.println("Employee 1 annual compensation: "
                + (hr.getAnnualCompensationForEmployee(emp1)));
        System.out.println("Employee 2 annual compensation: "
                + (hr.getAnnualCompensationForEmployee(emp2)));
    }
    
}
