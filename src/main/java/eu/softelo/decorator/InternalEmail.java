package eu.softelo.decorator;

/**
 * Created by: Damian
 * Date      : 2014-09-29
 */
public class InternalEmail implements Email {
    private String content;

    private String recipient;

    public InternalEmail(String content, String recipient) {
        this.content = content;
        this.recipient = recipient;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getContent() {
        return content;
    }
}
