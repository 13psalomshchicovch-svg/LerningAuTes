package stepkin.les35;

import static java.lang.System.arraycopy;

public class NegativeTextAnalyzer extends KeywordsAnalyzer {
    String [] spamKeywords = {":(","=(",":|"};

    @Override
    Label getmLabel() {

        return Label.NEGATIVE_TEXT;
    }

    @Override
     protected String [] getKeyword() {

        return spamKeywords;
    }
}
