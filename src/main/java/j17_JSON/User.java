package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * serialize (Object(String도 포함됨) -> Json)
 * deserialize(Json ->(String도 포함된)Object)
 * 
 */


@Builder
@Data
public class User {
	@Expose(serialize = true, deserialize = true)//다 이렇게 각각 true로 잡아야 보임
	private String username;
	@Expose(serialize = false, deserialize = false)//serialize 객체를 문자열로 표현할 때 표현할지 안할지 결정
	private String password;
	@Expose(serialize = true, deserialize = false)//serialize 다 이렇게 각각 true로 잡아야 보임
	private String name;
	@Expose(serialize = true, deserialize = true)//deserialize
	private String email;
	
}
