package j12_추상.추상클래스;

public class Tiger extends Animal{

    public Tiger(String kind) {//부모클래스 Animal에 기본생성자가 있어야 여기도 기본생성자를 만들 때 문제가 없다.생략 가능}
        super();//가 생략되어 있기 때문.
    }


    @Override
    public void move() {
        System.out.println("호랑이가 움직인다");
    }
}
