package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        int rVal = getRandom(30, 40);
        //System.out.println(rVal);

        int absVal = getABS(10);   // 10 만 넘어와야됨.
        int absVal2 = getABS(-10);

        System.out.println("absVal : " + absVal);
        System.out.println("absVal2 : " + absVal2);
    }
    public static int getRandom(int a, int b){

//            int ran = (int)(Math.random() * (b-a+1)) + a;
//            return ran;
            return (int)(Math.random() * (b-a+1)) + a;
    }
    public static int getABS(int a) {
//        if(a < 0) {
//            return -a;
//        }
//        return a;
        return a < 0 ? -a : a;
    }
}
