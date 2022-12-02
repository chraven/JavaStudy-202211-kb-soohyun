package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main2 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("김영희");
		names.add("김일희");
		names.add("김이희");
		names.add("김삼희");
		
		Supplier<String> FirstName = () -> names.get(0);//->다음은 리턴. 변수명으로 뭘 가져오는지 명시할 수 있음.
		
		System.out.println(FirstName.get());
			
		
	}
}
