package j18_예외;

public class ArrayException {

	public static void main(String[] args) {
		
		Integer[] numberArray = new Integer[] {1, 2, 3, 4, 5};
		
		try {
			//예외가 예상되는 부분
		for(int i = 0; i < 6; i++) {
			System.out.println(numberArray[i]);
		}
		}catch (ArrayIndexOutOfBoundsException e) {//try에 ArrayIndexOutOfBoundsException가 (배열에서 문제) 생성됨 그걸 catch에 던짐
			System.out.println(e);//예외 메세지 // 예외를 toString
			e.printStackTrace();//예외의 문제점, 어디서 예외가 일어나는지 등 정보 - 빨간색
			System.out.println(e.getMessage());//안의 메세지만 가지고 올 수 있다.
			System.out.println("예외가 생성됨");
		}
	
	
		System.out.println("프로그램 정상 종료");
	
	}
}
