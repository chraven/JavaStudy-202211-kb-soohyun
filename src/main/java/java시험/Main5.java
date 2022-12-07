package java시험;

import java.util.Scanner;

import j14_스태틱.싱글톤.ScannerSingleton;

class Factory {
	private String factoryName;

	public void inputName() {
        factoryName = null;
        Scanner scanner = ScannerSingleton.getInstance().getScanner();

        System.out.print("이름을 입력하세요: ");
        factoryName = scanner.nextLine();

        System.out.println("이름: " + factoryName);
    }
}


public class Main5 {
	
	public static void main(String[] args) {
		
		Factory factory = new Factory();
		  factory.inputName();
	}
			 

}
