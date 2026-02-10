package stepkin.les43.dz2;


import java.util.logging.Logger;

public class Spy implements MailService{
    private final Logger logger;

    public Spy(Logger l) {
        logger = l;
    }

    @Override
    public Sendable processMail(Sendable mail) {
    if (mail instanceof MailMessage){
        if (mail.getTo().contains("Austin Powers") || mail.getFrom().contains("Austin Powers") ){
            logger.warning("Detected target mail correspondence: from " + mail.getFrom() + " to " + mail.getTo() + " \"" + ((MailMessage) mail).getMessage() + "\"");
            return mail;
        }
        else {
            logger.info("Usual correspondence: from " + mail.getFrom() + " to " + mail.getTo());
            return mail;
        }
    }

    else {
        return mail;
        }
    }
}
