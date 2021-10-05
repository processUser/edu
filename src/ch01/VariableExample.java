package ch01;

public class VariableExample {
    public static void main(String[] args) {
        // 기본형 타입 변수 - 정수형
        byte b;
        short s;
        int score;
        long l;
        score = 10;
        System.out.println(score);

        score = 20;
        System.out.println(score);

        System.out.println(score+score);
        System.out.println(score);

        score = score + score + score;
        System.out.println(score);

        final int score2 = 10; // 상수(final) - 한번 입력된 값은 변경 할 수 없다. 리터럴이랑 다름.
    }
}
