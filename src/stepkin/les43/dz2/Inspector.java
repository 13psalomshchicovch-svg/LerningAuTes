package stepkin.les43.dz2;

public class Inspector implements MailService {



    @Override
    public Sendable processMail(Sendable mail) {

        if (mail instanceof MailPackage) {
            Package post = null;


                post = ((MailPackage) mail).getContent();


            System.out.println(post.getContent());

                if (post.getContent().contains("weapons") || post.getContent().contains("banned substance")) {
                    throw new IllegalPackageException("danger");
                } else if (post.getContent().contains("stone")) {
                    throw new StolenPackageException("stolen");
                } else {
                    return mail;
                }
            }



        else {
            return mail;
        }

    }
}
