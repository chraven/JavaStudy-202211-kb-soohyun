package j12_추상.추상클래스;



public class Human extends Animal {

    public Human(String kind) {
        super(kind);//super();(부모클래스의 생성자)는 대개 생략되어 있음. 부모의 기본생성자를 호출함.
        // 아니라면 오버로딩한 일반생성자 형식을 따라 매개변수를 입력해야한다.
    }

    @Override
    public void move() {
        System.out.println("사람이 움직인다");
    }
}
