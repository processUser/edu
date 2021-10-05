package ch01;

public class VariableExample3 {
    public static void main(String[] args) {
        // 기본형 타입 - 문자
        char c = 'B';
        System.out.printf("%c : %d\n", c, (int) c);

        int i = 69;
        System.out.printf("%c : %d\n", (char) i, i);

        boolean bl = false;
        System.out.println(bl);
    }
}
// boolean,
// byte < char < short < int < long(8 byte) < float(4 byte) < double < String
// String 이 있는경우 전부 String 으로 형변환됨.
