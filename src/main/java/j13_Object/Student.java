package j13_Object;

import java.util.Objects;

public class Student extends Object{

    private int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override//alt insert 해서 tostring()으로 들어가기
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override//alt insert equals and hashCode// 매개변수 칸에 업캐스팅으로 모든 클래스(Objext를 상속받음)가 들어올 수 있다.
    public boolean equals(Object o) {
        if (this == o) return true;//둘의 주소부터 일단 비교. 같으면 true
        if (o == null || getClass() != o.getClass()) return false;//getClass는 this, o.getClass(getClass는 참조자료형을 말함)
        Student student = (Student) o;//Object형태를 Student로 다운캐스팅
        return code == student.code && Objects.equals(name, student.name);//Objects는 여러기능이 있는 유틸리티/문자열 비교
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);//오버라이드해서 code와 name만으로 hashcode를 만들기 때문에 code, name만 같으면 hashcode가 같아진다.
        //equals는 패키지가 다르면 클래스 자체가 달라짐. 같은 내용의 변수라 해도 다르다 나옴.
    }
}
