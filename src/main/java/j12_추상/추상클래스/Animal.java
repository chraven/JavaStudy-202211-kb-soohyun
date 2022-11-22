package j12_추상.추상클래스;

/*
    추상메소드를 하나라도 포함하는 클래스는
    추상 클래스로 정의하여야 한다.
 */

public abstract class Animal {

    private String kind;

    public Animal() {

    }

    public Animal(String kind) {//추상클래스에서 생성자도 정의할 수 있다. 생성자를 오버로딩하면 생략된 기본생성자는 못쓰게 된다. 쓸려면 기본생성자를 직접 정의해야 한다.
        System.out.println(kind + "이(가) 생성되었습니다.");
    }

    //추상메소드
    public abstract void move(); //구현부 {}가 필요없음 추상메소드엔.
        //오버라이드 하는 것이 용도. 직접 쓰진 않음. Human, Tiger의 공통분모를 묶음. 추상화.

    public void eat() {//추상클래스에서 일반 메소드도 정의할 수 있다.
        System.out.println("동물이 밥을 먹습니다.");
    }

}
