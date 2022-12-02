package j18_예외;

public class ThrowsException {
	
	public static void printArray(int[] numbers) throws Exception {
		//throws Exception: 이 메소드에서 예외가 일어날 수 있다 표시. 따라서 이 메소드를 호출할 때 try catch 씌우기 강제. 예외처리를 호출할 때로 미룸.
		for(int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args)  {//main에서 throws를 써서 예외처리를 미루면 jvm까지 간다. 
		int[] nums = new int[ ] {1, 2, 3, 4, 5};
		
		try {
			printArray(nums);
			
		} catch ( Exception e) {
			//(NullPointerException | ArrayIndexOutOfBoundsException e) 둘 중 하나가 일어났을 때 오류를 받음
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}
}
