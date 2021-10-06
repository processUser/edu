package ch07;

public class AnimalTest {
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();
        Cat cat = new BigCat(); // 자식 객체 참조가능.
        Animal animal = new BigCat();
        Animal animal2 = new Cat();
//        Animal animal3 = new Animal();  // abstract를 사용한경우 객체화 불가.
        Object obj = new Object();
//        Object obj2 = new Animal(); // Object 타입은 모든 것을 참조할 수 있다. \ abstract를 사용한경우 객체화 불가.
//        BigCat bc = new Cat(); // 자식타입은 부모타입 객체 가질 수 없다. 에러
//        BigCat bc = (BigCat) new Cat(); // 런타임 애러 발생.
//        Cat cat2 = new Animal(); // 에러
        Animal cat2 = new BigCat();
        cat2.crying();
//        cat2.sleep(); // 호출 할 수 없음. 에러

        BigCat bigCat1 = (BigCat)cat2;  // sleep()을 호출하기 위해 형변환.
        bigCat1.sleep();

        /*
        Object obj = 1;
        Integer integer = new Integer(10);
        Float f = new Float(10.1);
         */
    }
}
/*
다형성 (여러가지 형태가 있는 성질)

1. 부모타입은 자식객체 주소값 저장할 수 있다.(참조할 수 있다., 가리킬 수 있다.)
2. 자식 타입은 부모객체 주소값 저장할 수 없다. (참조할 수 없다., 가리킬 수 없다.)
3. 메서드 호출은 타입이 알고 있는 것만 호출 가능하고, 내용은 객체 기준이다.

 */