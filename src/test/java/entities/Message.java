package entities;

/**
 * Created by Artem on 15.01.2017.
 */
public class Message {
    private String destinationEmail;
    private String messageText;

    public Message(String destinationEmail, String messageText) {
        this.destinationEmail = destinationEmail;
        this.messageText = messageText;
    }

    public String getDestinationEmail() {
        return destinationEmail;
    }

    public String getMessageText() {
        return messageText;
    }
}
