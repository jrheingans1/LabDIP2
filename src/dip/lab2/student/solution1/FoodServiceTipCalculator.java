/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author James
 */
public class FoodServiceTipCalculator {

    private double billAmt;

    public FoodServiceTipCalculator(double billAmt) {
        setBillAmt(billAmt);
    }

    public final double getTipAmount() {
        return billAmt * .15;
    }

    public final double getBillAmt() {
        return billAmt;
    }

    public final void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }

}
