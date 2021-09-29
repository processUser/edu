package ch04;

public class RandomExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6);
        // random() 값의 범위 0.0 ~ 0.999999999999999999
        System.out.println("num : " + num);

        // 2 ~ 7
        int num2 = (int)((Math.random() * 6) + 2);
        System.out.println(num2);

        // 55~108
        int num3 = (int)(Math.random() *54)+55;
        System.out.println(num3);
    }
}
