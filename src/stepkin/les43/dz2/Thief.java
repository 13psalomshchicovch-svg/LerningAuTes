package stepkin.les43.dz2;

public class Thief implements MailService {

     static int stolenValue = 0;
     static int minValue;

    public Thief(int m) {
               minValue = m;
            }

    public int getStolenValue() {
      return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
           Package steallPackage =  ((MailPackage) mail).getContent();
           int price = steallPackage.getPrice();

           if (price >= minValue){

               stolenValue += price;


               Package emptyPackage = new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0);
               return new MailPackage(mail.getFrom(), mail.getTo(),emptyPackage);

           }
            else {
                return mail;
           }
        }
        else {
            return mail;
        }
    }
}
