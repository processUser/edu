package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat(); //new aa()는 객체화
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        AnimalTest2 a = new AnimalTest2(); // static 없는 경우 사용법.

//        animalCrying(bc); // static 메서드
        a.animalCrying(bc); // static 메서드
        a.animalCrying(cat);
        a.animalCrying(dog);
        a.animalCrying(cow);
    }
    public void animalCrying(Animal ac){ // 메서드에서 다향성을 많이 이용한다.
        ac.crying();
    }
    /*
    public static void animalCrying(Animal ac){ // 메서드에서 다향성을 많이 이용한다.
        ac.crying();
    }

     */
}
