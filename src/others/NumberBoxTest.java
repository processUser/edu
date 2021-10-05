package others;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox bn1 = new NumberBox(1);
        NumberBox bn2 = new NumberBox(2);

        System.out.println(bn1 == bn2);
        System.out.println(bn1.equals(bn2)); // Object 메서드 equals() String 에서는 오버라이딩 되어있다.
        System.out.println(bn1.getVal());
        System.out.println(bn2.getVal());

        System.out.println(bn1);
        System.out.println(bn1.toString());
        System.out.println(bn2);
        System.out.println(bn2.toString());

        String str = new String("abc");
        System.out.println(str);
        System.out.println(str.toString());
    }
}
