package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner2 {

    public void inputAge() {
        int age = 0;
        Scanner scanner = ScannerSingleton.getInstance().getScanner();//이미 instance에 getScanner static instance에 있는 메모리 주소가 담겨 있으므로 getInstance()의 조건부가 거짓,
        //그 객체를 계속 쓰게 return instance. inputName()에 쓰던 메모리 주소를 계속 씀.

        System.out.print("나이를 입력하세요: ");
        age = scanner.nextInt();

        System.out.println("나이: " + age);
    }


}
