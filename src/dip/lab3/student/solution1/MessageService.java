/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

/**
 *
 * @author James
 */
public class MessageService {
    private MessageDestination msgDestination;

    public void produceMessage(MessageSource msgSource){
        msgDestination.sendMessage(msgSource);
    }
    public MessageService(MessageDestination msgDestination) {
        this.msgDestination = msgDestination;
    }

    public MessageDestination getMsgDestination() {
        return msgDestination;
    }

    public void setMsgDestination(MessageDestination msgDestination) {
        this.msgDestination = msgDestination;
    }
    
}
