package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListMethod {

	public static void printList(String listName, List<String> list) {//리스트 객체를 전달해 출력함
		System.out.println("[ " + listName + " ]");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(i + " ->\t");//\t는 탭
			System.out.println(list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		List<String> nameList = new ArrayList<String>();
		List<String> nameList2 = new ArrayList<String>();
		
		//add() -> 리스트에 값을 추가함
		nameList.add("김영희");
		nameList.add("김일희");
		nameList.add("김이희");
		nameList.add("김삼희");
		nameList.add("김사희");
		nameList.add("김오희");
		printList("nameList",nameList);
		
		
		//addAll() -> 리스트에 다른 COllection의 값을 모두 추가함
		nameList2.addAll(nameList);//한번에 리스트 값을 전부 옮김
		printList("nameList2", nameList2);
		nameList2.addAll(3, nameList);//3번 인덱스부터 add all해라. nameList2의 3번부터 다시 namelist전체를 시작해서 addAll하고 나머지 끊긴 리스트를 이어감.
		printList("nameList2", nameList2);
		
		
		//contains() -> 리스트에 해당 값이 있는지 확인(boolean 타입 변환)
		boolean isContains = nameList.contains("김사희");
		System.out.println("이름 목록에 김사희가 있나? " + (isContains ? "있다" : "없다"));
		System.out.println();
		
		//indexOf() -> 리스트에서 해당 값의 인덱스 위치를 반환(앞에서부터 탐색_
		int index = nameList.indexOf("김이희");
		System.out.println("리스트에서 김이희의 인덱스 위치: " + index);
		
		//lastIndexOf() -> 리스트에서 해당 값이 인덱스 위치를 반환(뒤에서부터 탐색)
		int lastIndex = nameList2.lastIndexOf("김영희");
		System.out.println("리스트에서 김영희의 인덱스 위치: " + lastIndex);
		
		
		//isEmpty() -> 리스트가 비어있는지 확인
		boolean isEmpty = nameList.isEmpty();
		System.out.println("해당 리스트가 비어있는가? " + isEmpty);
		
		for(String name: nameList) {
			System.out.println(name);
		}
		
		Iterator<String> ir = nameList.iterator();//iterator 객체를 반환한다. 그걸 ir에 담는다.
		
		while(ir.hasNext()) {//is는 이다/아니다, has는 있다/없다//ir.hasNext()는 ir에 다음이 있는가?T/F T면 while문 돈다.
			System.out.println(ir.next());//다음값을 꺼냄. 아직 꺼낸적 없을 땐(처음) 인덱스1이 다음값(ir.next())
		}//foreach와 결과적으로 동일.
		
		nameList.forEach(name -> {//람다를 배워야 이해할 수 있음. name에다 nameList를 담는다.
			System.out.println(name);
		});
		

		
	}//end of main
}//end of class
