package j12_추상.인터페이스;
/*

인터페이스 특징
    1. 모든 메소드는 기본적으로 추상 메소드이다.
    2. 변수는 선언할 수 없다.
    3. 상수는 선언할 수 있다. - 접근지정자는 public만 사용가능하다.
    (기본적으로 모든 변수선언은 상수로 선언된다)
    4. 일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다.
    5. 생성자를 만들 수 없다. 변수가 없으니까 매개변수를 전달할 일이 없다.
 */


public interface Calculator {

    public int ERROR_CODE = -9999999;

    //public Calculator() {}

    public int calc(int[] vlaues);

    //public default void setErrorCode() {
    //}

}
