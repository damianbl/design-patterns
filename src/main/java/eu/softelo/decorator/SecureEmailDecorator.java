package eu.softelo.decorator;

/**
 * Created by: Damian
 * Date      : 2014-09-29
 */
public class SecureEmailDecorator extends EmailDecorator {
    private String content;

    private String recipient;

    public SecureEmailDecorator(Email email) {
        recipient = email.getRecipient();
        originalEmail = email;
        content = encrypt(originalEmail.getContent());
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getContent() {
        return content;
    }

    private String encrypt(String message) {
        return message + " encrypted";
    }
}
