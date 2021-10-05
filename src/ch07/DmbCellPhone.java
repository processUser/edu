package ch07;

public class DmbCellPhone extends CellPhone {
    int channel;

    /*
    public DmbCellPhone(){};
    public DmbCellPhone(int channel) {
        this.channel = channel;
    }
     */
    public DmbCellPhone(String model, String color, int channel) {
        /*
        super(); // 항상 첫 줄에 유지 해야한다.
            // 이 경우가 아닌 경우 > 부모가 기본생성자가 없을때!!
         */
//        super(model, color);
        this.model = model;
        this.color = color;
        this.channel = channel;
//        this.printInfo();

    }

    /*
    this 는 나자신의 주소값을 가진다.
    super 는 바로위 부모의 주소값을 가진다.

    사용법
    super.[멤버필드, 멤버메소드]
    this.[멤버필드, 멤버메소드]
    super();  // 나 자신의 생성자 호출(기본생성자 호출)
    this();  // 부모의 생성자 호출(기본생성자 호출)
     */

    @Override
    void printInfo() {
        System.out.printf("model : %s, color : %s, channel : %d\n", model, color, channel);
    }
    /*
    오버로딩 vs 오버라이딩
    오버로딩 - 같은 이름의 메서드를 만드는것
    오버라이딩 -  메서드 재정의
                부모에 정의된 메서드를 그대로 사용하지 않고, 새롭게 정의하는 것을 오버라이딩이라 한다.
     */
}
