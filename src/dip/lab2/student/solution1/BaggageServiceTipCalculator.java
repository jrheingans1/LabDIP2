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
public class BaggageServiceTipCalculator implements TipCalculator {

    private int bagCount;
    private double baseTipPerBag;

    public BaggageServiceTipCalculator(int bagCount, double baseTipPerBag) {
        setBagCount(bagCount);
        setBaseTipPerBag(baseTipPerBag);
    }
    public final double getTipAmount(){
        return bagCount * baseTipPerBag;
    }
    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        this.baseTipPerBag = baseTipPerBag;
    }

}
