package pl.coderslab.beans;

import pl.coderslab.beans.MessageService;

public class EmailService implements MessageService {
    public void send(){
        System.out.println("sending email");
    }

    @Override
    public void send(String message) {
        System.out.println("sending email: " + message);
    }

}
