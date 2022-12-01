package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		
		User user = User.builder()
				.username("younghee")
				.password("1234")
				.name("김영희")
//				.email("younghee123@gmail.com")
				.build();
		
		System.out.println(user);
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()//null인 값도 보여주겠다. 이거 없이 email주석처리됐을 때 email값이 null이 되면 그냥 생략됨
				.excludeFieldsWithoutExposeAnnotation()//serialize안하면 Json에서 하나도 안뜸
				.create();//gson 객체 생성
		
		String userJson = gson.toJson(user);//user객체를 줄테니 json형태로 바꾸어라.
		System.out.println(userJson);
		
		User userObj = null;//json을 user객체로 바꾸려는 것. 생략 가능.
		
		userObj = gson.fromJson(userJson, User.class);//json을 user객체로 바꾸려는 것
		System.out.println(userObj);///json을 user객체로 바꾸었음을 확인.오버라이드된 toString이 실행된다.
		
		
	}
}
