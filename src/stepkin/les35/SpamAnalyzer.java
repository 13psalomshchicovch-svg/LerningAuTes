package stepkin.les35;

import static java.lang.System.arraycopy;

public class SpamAnalyzer extends KeywordsAnalyzer{
    String [] spamKeywords;

    public SpamAnalyzer (String[] spamKeywords) {
        this.spamKeywords = new String[spamKeywords.length];
       for (int i = 0; i < spamKeywords.length; i++){

           this.spamKeywords[i] = spamKeywords [i];
       }
    }

    @Override
    Label getmLabel() {

        return Label.SPAM;
    }

    @Override
    String [] getKeyword() {

        return spamKeywords;
    }
}
