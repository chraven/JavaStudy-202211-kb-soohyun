package j13_Object;


public class StringTest extends Object {//모든 클래스는 Object 클래스를 상속받는다.


    public static void main(String[] args) {
       String str = "A";// "A"의 주소가 str로 들어갔다.
       String str2 = "A";//"A"의 주소가 str2로 들어갔다. str과 주소값 동일
       String str3 = new String("A");// new해서 생성한 주소를 "A"에 넣음. 그리고 그걸 str3에 담음. str3은 주소값이 다르다.

        System.out.println(str == str2);//true가 나옴

        System.out.println(str.equals(str2));//문자열 비교는 equals//true가 나옴

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3);//출력값은 같아도 false가 나옴. equals를 써야 함.

        System.out.println(str.toString());//주소값이 나와야 하는데 문자열 값이 나옴.
                                          //toString은 Object안에 있음.

    }
}
