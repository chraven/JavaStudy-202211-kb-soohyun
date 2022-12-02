package j19_익명클래스;

@FunctionalInterface 
public interface CalculatorSub {
	
	public int calc(int a);

	
	public default int a () { //일반메소드를 디폴트 메소드로 인터페이스에선 말함. 오버라이드 가능하지만 이미 구현부가 정의되어 있으니 람다에선 신경안씀
		//메소드 이름이 a
		return 10;
	}
	

}
