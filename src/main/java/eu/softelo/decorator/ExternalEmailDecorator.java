package eu.softelo.decorator;

/**
 * Created by: Damian
 * Date      : 2014-09-29
 */
public class ExternalEmailDecorator extends EmailDecorator {
    private static final String COMPANY_DISCLAIMER = " Company disclaimer";

    private String content;

    private String recipient;

    public ExternalEmailDecorator(Email email) {
        originalEmail = email;
        recipient = email.getRecipient();
        content = addDisclaimer(originalEmail.getContent());
    }


    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getContent() {
        return content;
    }

    private String addDisclaimer(String message) {
        return message + COMPANY_DISCLAIMER;
    }
}