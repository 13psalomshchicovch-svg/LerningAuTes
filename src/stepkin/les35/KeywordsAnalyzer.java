package stepkin.les35;

public abstract class KeywordsAnalyzer implements TextAnalyzer {

    protected Object spamKeywords;
     String[] keyword;
     Label mLabel;

   Label getmLabel() {
        return mLabel;
    }

    String[] getKeyword() {
        return keyword;
    }

        public Label processText(String text) {
       mLabel = getmLabel();
       keyword = getKeyword();

        for (int i = 0; i < keyword.length; i++){

            if ( text.contains(keyword[i])){
                return mLabel;
            }
        }
        return Label.OK;
    }
}
