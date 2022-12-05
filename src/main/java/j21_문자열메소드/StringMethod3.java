package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {

	public static void main(String[] args) {
		Function<String, String> replacePhoneToken = phoneNumber ->
		phoneNumber.replaceAll("/","").replaceAll(" ","").replaceAll("-","").replaceAll("[.]", "");//점을 큰 따옴표안에 쓸 땐 "[.]"
			
		String phone1 = "010-1234/1234";
		String phone2 = "010.1234/1234";
		String phone3 = "010-1234/1234";
		String phone4 = "010-1234 1234";
	
//		phone1.replaceAll("/","").replaceAll(" ","").replaceAll("-","").replaceAll("[.]", "");
//		phone2.replaceAll("/","").replaceAll(" ","").replaceAll("-","").replaceAll("[.]", "");
//		phone3.replaceAll("/","").replaceAll(" ","").replaceAll("-","").replaceAll("[.]", "");
//		phone4.replaceAll("/","").replaceAll(" ","").replaceAll("-","").replaceAll("[.]", "");
		
		System.out.println(replacePhoneToken.apply(phone1));
		System.out.println(replacePhoneToken.apply(phone2));
		System.out.println(replacePhoneToken.apply(phone3));
		System.out.println(replacePhoneToken.apply(phone4));
		
		System.out.println(phone1.replaceAll("-", ""));//phone에서 "-"를 찾아 ""로 바꾸어라
		
		
		phone1 = phone1.replaceAll("/", "");
		
		System.out.println(phone1);
	}
}
