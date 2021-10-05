package ch01;

public class PrintExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("------");
        System.out.print("Hello\n");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println();

        String nm = "홍길동";
        int age = 17;
        float height = 180.8f;
        char bloodType = 'A';

        System.out.println(nm + "의 키는 " + height + "cm, 나이는 " + age + "세, 혈액형은 " + bloodType + "형이다.");
        System.out.printf("%s의 키는 %08.1fcm, 나이는 %d세, 혈액형은 %c형이다.", nm, height, age, bloodType);
        /*
        %s - 문자열  (실수, 정수, 문자에서 모두 가능하다.)
        %f - 실수 ( %09.f - 자리수 9자리 빈칸은 0으로 채워줌)
        %d - 정수 (%,d - 천단위 , 를 찍어줌)
        %c - 문자
         */
    }
}
