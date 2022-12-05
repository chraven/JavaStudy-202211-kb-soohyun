package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {
	
	public static void main(String[] args) {
		
		Function<Integer, String> fx1 = age -> age + "살";
		//앞이 매개변수 뒤가 리턴타입
		
		System.out.println(fx1.apply(20));
		
		Function<Function<Integer, String>, String> fx2 = fx -> fx.apply(20) + "입니다";
		
		System.out.println(fx2.apply(age -> age + "살"));//람다 안에 람다를 쓴 것. 리턴 자체를 function으로 주는 것도 가능.
		
		BiFunction<Integer, String, Map<Integer, String>> createMap = (number, name) -> {
			//매개변수 두개, 리턴 Map. 두 매개변수로 map을 만들어 리턴한다.
			Map<Integer, String> map = new HashMap<>();
			map.put(number, name);
			return map;
		};
		
		Map<Integer, String> aMap = createMap.apply(1,"안녕");
		System.out.println(aMap.getClass());//데이터타입을 모르겠을 때 변수명.getClass()를 이용하면 알 수 있다.
		System.out.println(createMap.getClass());
		
		List<Map<Integer, String>> list = new ArrayList<>();
		list.add(createMap.apply(100,  "김영희"));
		list.add(createMap.apply(200,  "김일희"));
		list.add(createMap.apply(300,  "김이희"));
		list.add(createMap.apply(400,  "김삼희"));
		list.add(createMap.apply(500,  "김사희"));
		
		System.out.println(list);
	}
}
