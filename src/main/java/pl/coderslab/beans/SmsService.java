package pl.coderslab.beans;

import pl.coderslab.beans.MessageService;

public class SmsService implements MessageService {
    public void send() {
        System.out.println("sending sms");
    }

    @Override
    public void send(String message) {
        System.out.println("sending sms: " + message);
    }
}
