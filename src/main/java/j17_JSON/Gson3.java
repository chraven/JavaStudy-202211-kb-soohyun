package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Gson3 {

	public static void main(String[] args) {
		
		
	JsonObject jsonObject = new JsonObject();
	
	jsonObject.addProperty("username", "yonghee");
	jsonObject.addProperty("password", "1234");
	
	System.out.println(jsonObject);//맵을 거칠 필요없이 toJson할 필요 없이 그냥 Json이 된다.
	
	JsonArray jsonArray = new JsonArray();//JsonElement는 추상클래스라 new할 수 없다. 그 안에 JSonArray 호출 json배열
	jsonArray.add("java");
	jsonArray.add("python");
	jsonArray.add("javascript");
	jsonArray.add("c#");
	
	System.out.println(jsonArray);
	
	jsonObject.add("subject", jsonArray);//json은 키와 value를 가진다.//Json 안에 배열을 추가한 것. 
	
	System.out.println(jsonObject);
	
	}
}
