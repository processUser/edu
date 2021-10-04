package ch06;

public class CarTest {
    public static void main(String[] args) {
        String car2 = new String("");
        Car car = new Car();  // new 는 객체화하는 키워드.
                              // car에는 주소값이 저장됨.
        car.brand = "현대";
        car.nm = "소나타";

        car.drive();
        car.stop();

        Car car3 = new Car();
        car3.brand = "기아";
        car3.nm = "K5";

        car3.drive();
        car3.stop();

        Car car4 = new Car();
        car.brand = "현대";
        car.nm = "소나타";

        car.drive();
        car.stop();

        System.out.println( car == car3 ); // false
        System.out.println(car==car4);
    }
}
