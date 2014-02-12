/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class GuiMessageDestination implements MessageDestination {
    @Override
    public void sendMessage(MessageSource message){
        JOptionPane.showMessageDialog(null, message.getMessage());
    }
}
