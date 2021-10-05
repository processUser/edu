package ch01;

public class StringExample {
    public static void main(String[] args) {
        // 레퍼런스 변수 - 객체 메모리 주소값을 저장
        String str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str1 + " 방갑습니다~"); // String 에서의 +는 문자열 합치기.

        str1 = str1 + 13;
        System.out.println(str1);

        String str2 = 10 + 10 + "10";
        System.out.println(str2);
    }
}
// 객체 - 속성, 메서드 값만 가질 수 있다.