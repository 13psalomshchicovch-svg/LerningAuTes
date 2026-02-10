package stepkin.les43.dz2;

public class UntrustworthyMailWorker implements MailService {
    private static MailService[] workers;
    private static RealMailService realWorker = new RealMailService();

    public UntrustworthyMailWorker (MailService[] w){
        workers = w;

    }

    public MailService getRealMailService() {
        return realWorker;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        for (MailService peaple: workers){
            mail = peaple.processMail(mail);
        }
        return realWorker.processMail(mail);
    }

}
