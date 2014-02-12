/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.util.Random;

/**
 *
 * @author James
 */
public class RandomMessageSource implements MessageSource {
    private String[] messages = {
        "Howdy", "Doody"
    };
    public String getMessage(){
        Random random = new Random(System.nanoTime());
        return messages[random.nextInt(2)];
    }
}
