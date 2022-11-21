package j11_상속;

public class B extends A {

    /*
    상속이란 하나의 클래스에 다른 클래스를 확장하는 개념
    상위 클래스의 접근지정자가 private인 것들은 하위 클래스에서 접근 할 수 없다.

     */

    private String b;

    public B() {
     b = getA();//A클래스 안에 a가 있으므로 상속한 B는 쓸 수 있다. a가 private이면 접근 못함. getA()를 통해서 가져와야
    }
}
