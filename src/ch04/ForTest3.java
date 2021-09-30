package ch04;

public class ForTest3 {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++){
            /*
            if(i > 2) {
                System.out.println("----------");
            }
            */
            for(int j = 1; j < 10; j++) {
//                System.out.println(i + "*" + j + "=" + i*j );
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            if(i < 9){
                System.out.println("----------");
            }
        }
    }
}
