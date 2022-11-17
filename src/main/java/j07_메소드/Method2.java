package j07_메소드;

public class Method2 {
    /*
     메소드 오버로딩
     */

    public static void print(String name) {
        System.out.println("이름: "+ name );
    }

    public static void print(int age) {//둘 다 메소드 이름이 같고, 매개변수의 자료형이 동일->오류//둘 중 하나라도 달라야
        System.out.println("나이: " + age );//리턴타입(여기선 void)은 같아도 상관없음
    }

    public static void print(String name, int age) {
        System.out.println("이름: " + name + " 나이: " + age);
    }

    public static void print(int age, String name) {
        System.out.println("이름: " + name + " 나이: " + age);
    }
    public static void main(String[] args) {

        print("홍길동");
        print(29);
        print("홍길동", 29);
        print(29, "홍길동");

    }
}
