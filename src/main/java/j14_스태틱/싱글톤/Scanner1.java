package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner1 {

    public void inputName() {
        String name = null;
        Scanner scanner = ScannerSingleton.getInstance().getScanner();//static메소드이므로 생성없이 호출할 수 있다.
        //getScanner static instance에 있는 메모리 주소가 담긴, Scanner에 대한 getter를 가져옴

        System.out.print("이름을 입력하세요: ");//Scanner 객체가 필요함.
        name = scanner.nextLine();

        System.out.println("이름: " + name);
    }
}
