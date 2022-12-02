package j19_익명클래스;

@FunctionalInterface 
public interface Calculator {
	
	public int calc(int a, int b);
	//@FunctionalInterface 추상메소드가 두개 이상 있으면 (람다 못 쓴다고) 알려주는 역할. 
	//public int calc2(int a, int b);
	
	public default int a() { //디폴트는 이미 정의된 된 것이라 오버라이드 안되므로  @FunctionalInterface 있어도 추가 가능.
		return 10;
	}
	

}
