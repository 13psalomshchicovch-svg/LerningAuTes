package stepkin.les35.dz;

public class AsciiCharSequence implements CharSequence/* extends/implements */ {
     byte [] arrb;


    AsciiCharSequence (byte[] x){
       arrb = new byte[x.length];
        for (int i = 0; i < x.length; i++) {
            arrb[i] = x[i];
        }

    }
    @Override
    public String toString(){
        StringBuilder charToString = new StringBuilder();
        for (int i = 0; i <= arrb.length-1; i++){
            char a = (char) arrb[i];
            charToString.append(a);
        }
        return charToString.toString();
    }



    @Override
    public int length() {
        return arrb.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arrb[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        byte[] a = new byte[end - start];

        for (int i = start, j = 0; i < end;j++, i++) a[j] = arrb[i];

        return new AsciiCharSequence(a);
    }
}
 class Main {

    public static void main(String[] args) {

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!

        example[0] = 74;

        System.out.println(answer.toString());//Hello!
    }

}