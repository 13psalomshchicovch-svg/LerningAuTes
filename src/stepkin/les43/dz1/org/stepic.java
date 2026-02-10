package stepkin.les43.dz1.org;

import java.io.File;
import java.util.Formatter;
import java.util.logging.*;

public class stepic {
     static  Logger logger1 = Logger.getLogger("org.stepic.java.logging.ClassA");
     static  Logger logger2 = Logger.getLogger("org.stepic.java.logging.ClassB");
     static  Logger logger3 = Logger.getLogger("org.stepic.java");

    public static void main(String[] args) {

        logger1.setLevel(Level.ALL);

        logger2.setLevel(Level.WARNING);

        Handler hand;
        XMLFormatter form = new XMLFormatter();

        hand = new ConsoleHandler();
        hand.setFormatter(form);

        hand.setLevel(Level.ALL);
        logger3.setUseParentHandlers(false);
        logger3.addHandler(hand);






    }


}
