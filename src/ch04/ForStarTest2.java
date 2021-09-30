package ch04;

public class ForStarTest2 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 5) + 2; // 2~6
        System.out.println(star);

        for(int i = 0; i<star; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
  i  /  j
  0     0
  1     0 1
  2     0 1 2
 */