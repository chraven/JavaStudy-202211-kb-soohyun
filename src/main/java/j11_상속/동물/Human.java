package j11_상속.동물;

public class Human extends Animal{

    public Human() {
        super();//이 코드가 주로 숨겨져 있다.
        System.out.println("Human 객체 생성");
    }

    @Override //@붙은 문법 -> 어노테이션//상위객체로부터 재정의되었음을 표시.
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");//Animal에도 move()가 있고, 여기에도 move()가 있다. 메소드 재정의. 오버라이드.
    }


    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
