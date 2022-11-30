package j16_컬렉션.Map;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();//value에 object 매개변수로 넣었으므로 value에 String, boolean, integer, map뭐든 넣을 수 있다.
		
		map.put("username", "younghee");
		map.put("password", "1234");
		map.put("name", "김영희");
		map.put("email", "younghee@gamil.com");
		map.put("age", "29");
		map.put("gender", true);
		
		Map<String, String> address = new HashMap<>();//해시값이 작은 것부터 출력. 내가 원하는 순서대로 안 나옴.
		address.put("address1", "부산광역시");
		address.put("address2", "동래구");
		address.put("address3", "김영희로 1234");
	
		map.put("address", address);//map에 map을 넣은 것, set, list도 넣을 수 있다.
		
		Map<Integer, String> subject = new TreeMap<>();//TreeMap은 숫자가 순서대로 들어간다.
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");
		
		map.put("subject", subject);//뒤의 subject는 map. map이 object로 업캐스팅되어 들어가있음.
				
		
		System.out.println(map);
	
		System.out.println(((Map<Integer, String>)map.get("subject")).get(403)); //map.get("subject")는 Object로 업캐스팅된 상태 
		//(Map<Integer, String>)map.get("subject")): Map으로 다운캐스팅을 해야 Map의 메소드 get(키)을 써서 python3을 출력함.
		
		List<String> hobby = new ArrayList<>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		
		System.out.println(hobby);
		System.out.println(((List<String>)map.get("hobby")).get(2));
	
		System.out.println();
	
		Set<Entry<String, Object>> userEntry = map.entrySet();//import는 ctrl shift o//셋에 담기는 엔트리, 엔트리는 스트링과 오브잭트를 가진다.
		// map.entrySet();: map을 셋으로 바꾸는 것.
		//엔트리는 키, value 조합 하나를 말함. map은 그 조합 여러개 담을 수 있다.
	
		 System.out.println(map);//map은 중괄호
		 System.out.println(userEntry);//set, list는 대괄호
		
		 Set<String> names = new HashSet<>(); //Set이란 인터페이스 자료형을 HashSet 클래스로 객체 생성
		 names.add("김하나");
		 names.add("김둘");
		 names.add("김셋");
		 names.add("김넷");
		 names.add("김다섯");
		 
		 System.out.println(names);
		 for(String name : names) {
			 System.out.println(name);
		 }
		 
		 		 		 
		 //List<Map<String, Object>> listMap = new ArrayList<>();//이 리스트 안에는 맵을 담고 그 맵은 키값과 value를 담는다.
		
		for(Entry<String, Object> entry : userEntry) {//userEntry는 set, 그 useerEntry 안에는 Entry가 들어있다. 
			//System.out.println(entry);//키 = value 형태로 죽 출력함
			//System.out.println(entry.getKey());//키값만 출력함
			//System.out.println(entry.getValue());//value 값만 출력함
			System.out.println(entry.getKey() + " : " + entry.getValue());//entry 객체들을 꺼내는 것.
		}
	
		System.out.println();
		/*======================*/
		Set<String> keys = map.keySet();//keySet(): map에 있는 key 값을 전부 String타입으로 Set으로 저장하게 된다.
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(keys));//같은 foreach문에 있기 때문에 순서가 동일하다.
			
		}
		
		System.out.println("--------------");
		System.out.println(map.values());//values : value들을 묶어서 가져옴
		
		for(Object obj : map.values()) { //map의 value들이 object들이기 때문에 Object로 꺼내야 함.
			System.out.println(obj);
		}
	
	
	}
	
}
