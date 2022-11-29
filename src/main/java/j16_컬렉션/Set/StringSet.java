package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		//alt shift s getter setter, 오버라이드 등
	//alt 누르고 위 아래 이동 // 줄 자체 이동
		Set<String> nameSet = new HashSet<String>();
		
		nameSet.add("김영희");
		nameSet.add("김일희");
		nameSet.add("김이희");
		nameSet.add("김삼희");
		nameSet.add("김사희");
		
		System.out.println(nameSet);//add한 순서대로 출력되지 않는다.
		
		for(String s : nameSet) {
			if(s.equals("김영희")) {
				System.out.println(s);
				break;
			}
		}
	
		List<String> nameList = Arrays.asList(new String[] {"김영희", "김삼희"});
		
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		//set은 인터페이스. hashSet은 set으로 implements한 클래스.
		//아까 ArrayList와 hashSet이 같은 선상.
		//아까 Set과 List가 같은 선상
		listToSet.addAll(nameList);
		//addAll 리스트를 set으로 다 옮겨주는 것, 컬렉션 인터페이스에 있다. 
		//Map은 컬렉션 인터페이스를 상속받지 않기 때문에 addAll을 쓸 수 없다.
		
		System.out.println(listToSet);
		
		nameSet.remove("김영희");//인덱스가 없기 때문에 remove는 직접 값을 ㅇ입력해야
		
		System.out.println(nameSet);
	
		//set은 업데이트 개념이 없다. 삭제와 추가가 동시에 일어나게끔 해야 함. 
	}

}
