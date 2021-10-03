package ch05;

public class MethodTest2 {
    public static void main(String[] args) {
        String oddEven = getOddEven(14);

        System.out.println("홀짝 : " + oddEven);
        // 10 > 짝수
        // 13 > 홀수
    }

    public static String getOddEven(int i){
        String str;
        if (i % 2 == 0) {
            str = "짝수";
        } else {
            str = "홀수";
        }
        return str;
    }
}
