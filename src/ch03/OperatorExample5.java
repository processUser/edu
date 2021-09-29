package ch03;

public class OperatorExample5 {
    public static void main(String[] args) {
        // 삼항식
        int n1 = 10;
        int n2 = 12;
        String result = !(n1 >= n2) ? "n1이 n2랑 크거나 같다" : "n2가 n1보다 크다";
        System.out.println(result);
        System.out.println(n1 >= n2 ? "n1이 n2랑 크거나 같다" : "n2가 n1보다 크다");
        //                    식    결과값 :   true              false
        // String 은 주소값으로 저장 됨. 자동 형변환 안됨. 메서드로 써야됨.
        // String str1 = Integer.toString(n2);  // parsing(파싱)
        // String str2 = String.valueOf(n2);

        // mod (나머지)
        System.out.println(10 % 2);
        System.out.println(11 % 2);
    }
}
