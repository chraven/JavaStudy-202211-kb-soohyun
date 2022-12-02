package j20_함수형인터페이스;

public class Main1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		Runnable application1 = () -> {//메소드 정의하는 부분. 매개변수가 없을 때는 소괄호 생략 불가. 하나 있을 때만 소괄호 생략 가능. 
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a: " + a);//매개변수로 a를 주지도 않았는데 a를 쓸 수 있음
		};
	
		application1.run();
		
		//Runnable 람다 : Runnable엔 매개변수, 반환값이 없다. Runnable은 함수형 인터페이스 //timer는 변수
//		Runnable timer = () -> { 
//			for(int i = 0; i < 100; i++) {
//				
//				try {
//					System.out.println(i + " : " + (i + 1));
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					
//					e.printStackTrace();
//				}
//			}
//		};
		
		Thread t1 = new Thread(() -> { 
			for(int i = 0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> { 
			for(int i = 0; i < 100; i++) {
				
				try {
					System.out.println("알림기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		
	//	Thread t2 = new Thread(timer);
		
		t1.start();
		t2.start();//t1.start()가 끝날때까지 기다리지 않고 실행문만 던지고 바로 t2.start로 옴. 비동기처리. 둘의 순서를 보장할 수 없음
		//동기처리는 위에서 아래로 순차적으로 코드 처리.
		
		
		
	}

}
