package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Student student = new Student(20220001, "유관순");
        Student student2 = new Student(20220001, "유관순");

        //System.out.println(student.toString());
        System.out.println(student);//두 출력값이 같음.

        System.out.println(student2);
        System.out.println(student == student2);//false가 나옴. 두 주소가 달라서.
        System.out.println(student.equals(student2));//equals를 오버라이드해서 안의 내용이 같으면 같다고 나오도록 수정.
        //equals는 원래 주소값을 비교하는 것. Object로 업캐스팅된 상태에서 student(this), student2의 주소값을 비교.

        System.out.println();

        //Object s = student;//업캐스팅
        print(student); //student의 주소값이 업캐스팅(Student클래스는 Object 클래스를 상속받음)해서 print()의 매개변수로 들어감.

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(student2.hashCode());//hashcode는 주소를 16진수로 해서 출력하는 것. 오버라이드해서 내용을 바꿈.
        //java native interface : 다른 언어로 만든 걸 java로 연결. hashcode()추상메소드와 연결되어 있음.


        Class c = student.getClass();//getClass는 Object안에 있는 메소드. stduent는 Object를 상속받으므로 getClass를 호출가능.
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        Field[] fields = c.getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());//Student의 변수 이름을 출력함
        }

        Method[] method = c.getDeclaredMethods();
        for(int i = 0; i < method.length; i++) {
            System.out.println(method[i].getName());// Student의 메소드 이름을 출력함.
        }

    }
}
