package pl.coderslab;

import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.SmsService;

public class Main {
    public static void main(String[] args) {

        MessageSender messageSenderEmail = new MessageSender(new EmailService());
        MessageSender messageSenderSms = new MessageSender(new SmsService());

        messageSenderEmail.sendMessage();
        messageSenderSms.sendMessage();
    }
    }
