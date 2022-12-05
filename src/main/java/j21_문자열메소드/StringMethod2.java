package j21_문자열메소드;

import j01_출력.SystemOut;

public class StringMethod2 {

	public static void main(String[] args) {
		
		String roles = "ROLE_USER, ROLE_MANGER,ROLE_ADMIN";
		
		String[] roleArray = new String[3];
		
		String tempRoles = roles;
		
		roleArray[0] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2); //ROLE_USER를 꺼내고 그 다음 다음 인덱스가 0이 된다.
		
		roleArray[1] = tempRoles.substring(0, tempRoles.indexOf(",")!= -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2); //,를 못찾으면 인덱스 -1을 반환해서 !=값이 거짓이되어 뒤의 길이를 반환하도록.
		
		roleArray[2] = tempRoles.substring(0, tempRoles.indexOf(",")!= -1 ? tempRoles.indexOf(",") : tempRoles.length());
		
		
		for(String role : roleArray) {
			System.out.println(role);
		}
		
		System.out.println();
		
		String[] roleArray2 = roles.split(", ");// ", "을 기준으로 다 잘라서 배열으로 만들어라
		for(String role : roleArray2) {
			System.out.println(role);
		}
		
		String abc = "abcde";
		
		System.out.println(abc.indexOf("f"));
	}
}
