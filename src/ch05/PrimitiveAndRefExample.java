package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {
        int val = 10;

        Box box = new Box();
        box.val = 10;

        Box box2 = box;  //box 의 주소값이 저장.
        box2.val = 20;

        box2 = new Box();

        System.out.println("val : " + val);
        changeVal(val);
        System.out.println("val : " + val);
        System.out.println("-------");
        System.out.println("box.val : " + box.val);
        changeVal(box);
        System.out.println("box.val : " + box.val);
    }

    public static void changeVal(int val) {
        val = 30;
    }

    public static void changeVal(Box box) {
        box.val = 30;
    }
}
class Box{
    int val;
}