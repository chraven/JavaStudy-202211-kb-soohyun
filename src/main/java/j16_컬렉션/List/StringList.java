package j16_컬렉션.List;

import java.util.ArrayList;


public class StringList {

    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Jsp";
        strArray[2] = "Servlet";

        // 일반 반복
        System.out.println("<<<<< 일반반복 >>>>>");
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        System.out.println();

        //foreach
        System.out.println("<<<<< foreach >>>>>");
        for(String str : strArray) {//strArray가 데이터의 집합이어야 한다. str변수에다 strArray값 넣어서 인덱스 순서대로 뽑음.
            //foreach는 모든 컬렉션에 사용가능하다.
            System.out.println(str);
        }


        ArrayList<String> strList = new ArrayList<String>();//alt 엔터 : 오류 해결책을 보여줌//소괄호에 3을 넣으면 new ArrayList라는 생성자에다가
        //소괄호는 데이터의 크기를 말한다. 부족하면 자동으로 1.5배 늘린다. 쓰지 않는 공간은 죽어버린다. 공간 낭비하기 싫으면 정확히 입력해야. 안 적어도 자동으로 데이터가 늘어남.
        // 값 추가(Create) -> add(값), add(index, 값)
        strList.add("Java");
        strList.add("Jsp");
        strList.add("Servlet");
        strList.add(1, "C++"); //1번 인덱스에 C++를 넣었다. add는 값을 바꾸라는 게 아니라 추가. 그냥 1,2 인덱스 사이에 공간을 자동으로 늘려서 C++을 담는다.
        strList.add(0, "HTML");//값을 제일 앞에 넣고 싶으면 0 인덱스에 담아라고 코드 입력.

        System.out.println("<<<<< list foreach >>>>>");
        for(String str : strList) {
            System.out.println(str);
        }

        //값 조회(Read) -> get(index)
        System.out.println("<<<<< list 일반반복 >>>>>");
        for(int i = 0; i < strList.size(); i++) {//list는 length가 아니라 size로 가져온다.
            System.out.println(strList.get(i));//컬렉션에는 get이란 메소드가 없다. (Map)키 값이 있으면 get이 있다.
        }

        // 값 수정(Update) -> set(index, 값)
        strList.set(0, "HTML5");

        System.out.println(strList);//toString()으로 strList배열이 출력된다.

        // 값 삭제(Delete) -> remove(index);
        String removeData = strList.remove(2);
        System.out.println(removeData);
        System.out.println(strList);
    }
}
