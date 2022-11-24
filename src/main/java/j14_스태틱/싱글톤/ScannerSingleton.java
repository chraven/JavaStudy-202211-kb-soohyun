package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class ScannerSingleton {
    //2. 자기자신을 static 변수로 가지고 있어야한다.
    private static ScannerSingleton instance = null;//변수명을 instance로 함

    @Getter//scanner에만 getter주고 싶음 여기에 쓴다.
    private Scanner scanner;//멤버변수

    //1. 생성자가 private 접근지정자여야 한다.
    private ScannerSingleton() {//private 생성자. 외부에서 객체생성불가.//inputName(), inputAge()는 새로 생성된 ScannerSingleton안에 새로 생성된 Scanner로 접근함.
        scanner = new Scanner(System.in);
    }

    public static ScannerSingleton getInstance() {//안에서 ScannerSingleton객체 생성.static변수를 외부로 가져가 주어야함. 얘도 static. public.
    if (instance == null) {
        instance = new ScannerSingleton();//생성자가 실행됨. 메모리 할당을 하고 그 주소를 static instance에.
    }
    return instance;
    }
}
