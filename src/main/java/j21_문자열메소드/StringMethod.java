package j21_문자열메소드;

import j01_출력.SystemOut;

public class StringMethod {

	public static void main(String[] args) {
		
		String name = "김영희김일희";
		
	
		System.out.println(name.length());//문자열의 길이를 찾는 놈
		
		
		//문자의 위치 찾기
		System.out.println(name.indexOf("김"));
		System.out.println(name.indexOf("영"));
		
		//문자의 위치 뒤에서부터 찾기(인덱스가 바뀌는 게 아님)
		System.out.println(name.lastIndexOf("김"));
		
		char name1 = name.charAt(0);//0 인덱스에 있는 문자를 가져옴
		System.out.println(name1);
		
		char name2 = name.charAt(name.indexOf("영"));
		System.out.println(name2);
		
		//String subName1 = name.substring(0, 2); //o인덱스에서 2번인덱스(2번 인덱스는 포함x) '전'까지 글자를 잘라라
		String subName1 = name.substring(2);//2번인덱스부터 끝까지 잘라라
		System.out.println(subName1);
		
		
		String subName3 = name.substring(3);
		System.out.println(subName3);
		
		String nameYounghee = "김영희";
		
		System.out.println(name.substring(name.indexOf(nameYounghee),name.indexOf(nameYounghee) + nameYounghee.length()));
		//name.indexOf(nameYoungjee) 문자열의 첫번째 인덱스를 뽑아줌. 여기서는 0
		//nameYounghee.length() 문자열의 길이. 여기서는 3
		
		
		String file = "C:/String.java";
		String fileName = null;//String만 들어가기
		String extension = null;//확장자
		
				
		fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		System.out.println(fileName);
		
		extension = file.substring(file.lastIndexOf("."));
		System.out.println(extension);//끝에서부터 "."까지 자름
				
		
	}
}
