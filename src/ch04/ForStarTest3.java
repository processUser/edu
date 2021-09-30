package ch04;

public class ForStarTest3 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 5) + 2; // 2~6
        System.out.println(star);

        for (int i = star; i > 0; i--){
            for(int j = 1; j <= star; j++) {
                if(j < i){
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i > 0; i++){
            for(int j = 1; j <= star; j++) {
                int val = star - i;
                if(j < val){
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
