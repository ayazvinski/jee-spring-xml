package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MessageSender emailSender = context.getBean("messageSender",MessageSender.class);
        MessageSender smsSender = context.getBean("messageSenderSms",MessageSender.class);
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        emailSender.sendMessage();
        smsSender.sendMessage();
        helloWorld.printMessage();
        helloWorld.getMessage();

        context.close();
    }
}
