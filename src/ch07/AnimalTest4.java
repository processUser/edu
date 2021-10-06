package ch07;

public class AnimalTest4 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        Cat cat = (Cat)ani;
        BigCat bc = (BigCat)cat;
//        bc.sleep(); //에러
        /*
        cat 객체를 가리킬수 있는 타입
        Object, Animal, Cat
         */
    }
}
