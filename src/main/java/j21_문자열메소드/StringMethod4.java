package j21_문자열메소드;


import java.util.Arrays;
import java.util.List;

import j01_출력.SystemOut;

public class StringMethod4 {

	public static void main(String[] args) {
		
		String roles = "ROLE_USER, ROLE_MANGER,ROLE_ADMIN, GUEST";
		roles = roles.replaceAll(" ", "");
		
		String[] roleArray =roles.split(",");
		List<String> roleList = Arrays.asList(roleArray);
		
		System.out.println(roleList);
		
		roleList.forEach(role -> {
			//prefix(접두어) : startsWith("ROLE_") => ROLE_로 시작하는지 묻는 거
			//suffix(접미어) : endWith()
			//equalsIgnoreCase 소대문자 구분없이 단순 글자로만 판단
			
			if(role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) {
				
			System.out.println("권한: " + role);
			}
		});
		
	}
}
