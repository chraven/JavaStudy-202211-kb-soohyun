package j16_컬렉션.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class UserRepository {
	
	@Getter
	private List<Map<String, Object>> userList;
	
	//Create
	public void register(Map<String, Object> userMap) {
		System.out.println("[사용자 등록]");
		userList.add(userMap);
	}

	//Read
	public Map<String, Object> findUserByUsername(String username) {
		Map<String, Object> userMap = null;
		
		for(Map<String, Object> user : userList) {//userList에서 정보를 꺼낼 때 Map이 됨
			String _username = (String)user.get("username");//변수명 앞에 _를 쓰면 임시로 쓰겠다는 뜻. username이 겹치니까.//"username" 키값
			if(_username.equals(username)) {
				userMap = user;//user는 내가 찾은 Map.
				break;
			}
		}
		
		return userMap;
	
	}

	public void modifyPasswordByUsername(String username, String newPassword) {//매개변수 newPassword로 바꿈.
		Map<String, Object> userMap = findUserByUsername(username);
		if(userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;//void인데 return. return하면 메소드를 빠져나가라는 뜻.
		}
	
		userMap.replace("password", newPassword);
	}
	
	public void deleteUserByUsername(String username) {
		Map<String, Object> userMap = findUserByUsername(username);
		if(userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;//void인데 return. return하면 메소드를 빠져나가라는 뜻.
		}
	
		int userIndex = userList.indexOf(userMap);
		
		userList.remove(userIndex);
	}
}
