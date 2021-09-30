package ch04;

public class ForStarTest {
    public static void main(String[] args) {

        int star = (int)(Math.random() * 5) + 2; // 2~6
        System.out.println(star);
        for(int i = 0; i < star; i++) {
            for (int j = 0; j < star; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}
