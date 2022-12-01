package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {
	
	public static void main(String[] args) {
		Gson gson = new Gson();//new Gson을 입력해서 바로 객체 생성.
		
		GsonBuilder gsonBuilder = new GsonBuilder();//Gson 생성방법 두번째.
		Gson gson2 = gsonBuilder.setPrettyPrinting().create();//GsonBuilder클래스가 있고 그안에 create()가 있음. create()호출될때 gson생성.
		//setPrettyPrinting은 json을 줄바꿈으로 출력하게 함.(Gson의 기능)
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "김영희");
		map.put("email", "younghee@gmail.com");
		map.put("address", "부산 동래구");
		map.put("phone", "01012341234");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
	
		map.put("hobby", hobby);
		
		System.out.println(map);
		
		String json = gson2.toJson(map);//toJSon : map을 json형태로 문자열로 바꿈.json은 문자열로 이루어져있음. String이자 json.
		
		System.out.println(json);
		
		Map<String, Object> jsonMap = gson2.fromJson(json, Map.class);//fromJson(json, Map클래스-객체가 다 가능) : json을 Map으로 바꾸어라.
		
		System.out.println(jsonMap);//json이 map(객체)으로 바뀌었음.
	}

}
