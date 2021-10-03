package ch05;

public class MethodExample {
    /*
                리턴타입 메소드명 파라미터(매개변수) {  << 메소드 선언부
                    //메소드 구현부
    }

    리턴타입은 크게 2개로 구분가능
    void - 리턴값 없다.
    비void - 리턴값 있다.

    */
    public static void main(String[] args) {
        sum(10, 20);
        sum(10,100);
        minus(100, 50);
        minus(30, 100);
    }

    public static void sum(int n1, int n2) {
        System.out.println("sum : " + (n1+n2));
    }
    public static void minus(int n1, int n2) {
        System.out.println("minus : " + (n1-n2));
    }
}
