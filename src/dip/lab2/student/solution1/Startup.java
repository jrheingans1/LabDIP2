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
public class Startup {

    public static void main(String[] args) {
        TipCalculator tip1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 10);
        TipCalculator tip2 = new FoodServiceTipCalculator(ServiceQuality.GOOD, 100.0);

        PaidService ps = new PaidService();
        TipCalculator[] Tips = {tip1, tip2};
        for (int i = 0; i < Tips.length; i++) {
            System.out.println("Employee " + (i + 1) + " compensation:"
                    + (ps.getTipAmountForService(Tips[i])));
        }

    }
}
