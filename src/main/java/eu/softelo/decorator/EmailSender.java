package eu.softelo.decorator;

/**
 * Created by: Damian
 * Date      : 2014-09-29
 */
public class EmailSender {
    private static final String INTERNAL = "internal";
    private static final String EXTERNAL = "external";
    private static final String SECURED = "secured";

    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();

        Email internalEmail = new InternalEmail(INTERNAL + " email", "internal");
        Email externalEmail = new InternalEmail(EXTERNAL + " email", "external");
        Email securedEmail = new InternalEmail(SECURED + " email", "secured");

        emailSender.send(internalEmail);
        emailSender.send(externalEmail);
        emailSender.send(securedEmail);
    }

    public void send(Email email) {
        switch (email.getRecipient()) {
            case INTERNAL:
                sendContentToRecipient(email.getContent(), email.getRecipient());
                break;
            case EXTERNAL:
                Email externalEmailDecorator = new ExternalEmailDecorator(email);
                sendContentToRecipient(externalEmailDecorator.getContent(), externalEmailDecorator.getRecipient());
                break;
            case SECURED:
                Email securedEmailDecorator = new SecureEmailDecorator(email);
                sendContentToRecipient(securedEmailDecorator.getContent(), securedEmailDecorator.getRecipient());
        }

    }

    private void sendContentToRecipient(String content, String recipient) {
        System.out.println("Sending email with content: '" + content + "' to recipient: '" + recipient + "'...");
    }
}
