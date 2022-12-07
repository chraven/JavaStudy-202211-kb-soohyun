package java시험;

public class Calculator {

	public int add (int num1, int num2) {
		return num1 + num2;
	}

	public int sub (int num1, int num2) {
		return num1 - num2;
	}

}	

 class Main3 {
	
	public static void main(String[] args) {
	
	Calculator calculator = new Calculator();
	
	int a = calculator.add(10, 20);
	int b = calculator.sub(200, 100);
	
	System.out.println(a);
	System.out.println(b);
}

}



