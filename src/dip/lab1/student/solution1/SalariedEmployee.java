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
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;

    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    @Override
    public final double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public final double getAnnualSalary() {
        return annualSalary;
    }

    public final void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public final double getAnnualBonus() {
        return annualBonus;
    }

    public final void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

}
