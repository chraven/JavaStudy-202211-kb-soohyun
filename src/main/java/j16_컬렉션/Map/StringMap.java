package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Map;

public class StringMap {

	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();
		
		language.put("java", "자바2");//앞은 키, 뒤는 value
		language.put("html", "에이치티엠엘");//map은 add가 없고 대신 put이 있다.
		language.put("css", "씨에스에스");//putAll은 addALL과 같으나 map끼리만 더한다
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬");//키값은 중복 불가. value는 중복 가능 
		language.put("python", "파이썬?");//키값은 뒤에 쓴 애가 덮어씀.
		//파이썬 두개가 출력되지 않는다.
		
		System.out.println(language);//입력한 순서대로 출력하지 않는다.
		
		String s = language.get("java");//value를 가져옴. List와 동일
		System.out.println(s);
		
		language.replace("java","자바2", "자바3");
		//자바 - 자바2 - 자바3 으로 바꿀 떄 oldvalue 자바2를 자바로 쓰지 말고 일치시켜야
		System.out.println(language.get("java"));
		
		language.remove("python2");//삭제: 키 값을 써준다.
		
		System.out.println(language);
	}
}
