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
public class FoodServiceTipCalculator implements TipCalculator{

    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR
            = "Error: bill must be greater than or equal to " + MIN_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double bill;

    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = bill * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = bill * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = bill * (1 + POOR_RATE);
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if (billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
}
