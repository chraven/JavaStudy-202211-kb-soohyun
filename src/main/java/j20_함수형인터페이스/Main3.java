package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class Main3 {
	
	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for(String s : list) {
			consumer.accept(s); //n -> 아래 {System.out.println(n);}는 accept를 오버라이드 한 것. 인덱스 하나 꺼낼 때마다 반복.
		}
	}

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("김영희");
		names.add("김일희");
		names.add("김이희");
		names.add("김삼희");
		names.add("김사희");
		
		names.forEach(n -> {//forEach(메소드)가 Consumer라는 인터페이스 를 매개변수로 받는다. 여기선 names라는 리스트로 연결됨.
			//업캐스팅되어 매개변수로 들어갈 수 있음. accept의 매개변수가 n <? super T>로 T의부모까지 매개변수로. 
			//names에서 <String>이므로 T는 String. action이 람다식으로 만든 객체.
			// n: Consumer 객체를 생성할 때 들어간 자료형으로 받는다.(String이 들어갔으므로 String)
			System.out.println(n);//accept를 오버라이드.
		});
		
		System.out.println();
		
		forEachTest(n -> {System.out.println(n);}, names);//consumer객체에 구현과 생성이 된 람다식이 대입됨, names 
		//consumer에는 람다식을 담기 위한 것.
		//n -> {System.out.println(n);}는 위의 Consumer에 연결되어 그 안의 유일한 메소드인 accept를 오버라이드 한 것
		//Consumer는 반환값이 없기 때문에 실행문을 그대로 실행(출력)하고 끝남.
		
		System.out.println();
		
		Map<String, String> subject = new HashMap<>();
		
		subject.put("java", "자바");
		subject.put("python", "파이썬");
		subject.put("javascript", "자바스크립트");
		subject.put("C", "씨언어");
		subject.put("Node.js", "노드제이에스");
		
		Set<String> keySet = subject.keySet();//keySet()은 Set형태로 key를 가져온다.
		keySet.forEach(key -> {
			
			System.out.println(subject.get(key));
		});
		
		System.out.println();
		
		Set<Entry<String, String>> entrySet = subject.entrySet();
		entrySet.forEach(entry -> {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		});
		
		System.out.println();
		
		subject.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
	}
}
