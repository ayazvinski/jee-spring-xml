package pl.coderslab.beans;

public class MessageSender {
    private MessageService notificationService;
    private String message;

    public MessageSender() {  }
    public MessageSender(MessageService notificationService) {
            this.notificationService = notificationService;
        }
        public void sendMessage () {
            notificationService.send(message);
        }

    public MessageService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(MessageService notificationService) {
        this.notificationService = notificationService;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

