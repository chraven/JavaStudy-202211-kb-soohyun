package j14_스태틱.내부클래스;

public class Main {

    public static void main(String[] args) {
        A.B b = new A().new B("김영희"); //A 클래스 객체를 먼저 생성해야 A의 내부 클래스인 B 클래스의 객체를 생성할 수 있다.
        System.out.println(b.getName());

    }
}
