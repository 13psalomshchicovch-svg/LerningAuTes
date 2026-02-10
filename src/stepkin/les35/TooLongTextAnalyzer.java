package stepkin.les35;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int b;
    public TooLongTextAnalyzer (int a) {
        b = a;
    }


    @Override
    public Label processText(String text) {
        if (text.length() > b){
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
