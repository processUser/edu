package ch04;

public class ForTest {
    public static void main(String[] args){
        int dan = (int)(Math.random() * 8) + 2;

        for(int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d\n" , dan, i, dan * i);
        }
        System.out.println();

        for(int i = 10; i < 19; i++){
            System.out.printf("%d * %d = %d\n" , dan, (i%10)+1, (dan * ((i%10)+1)));
        }
    }
}
