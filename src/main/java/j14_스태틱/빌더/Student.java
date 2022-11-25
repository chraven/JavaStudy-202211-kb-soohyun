package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Student {

    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder() {//buillder는 StudentBuilder자료형의 반환값을 가진 static 메소드
        return new StudentBuilder();
    }

    public static class StudentBuilder {//내부 클래스. static이므로 Student이라는 외부클래스가 없어도 존재.메모리 할당 없이도 존재가능.

        private int studentCode;
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this;//자기자신(StudentBuilder)의 주소를 return
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(studentCode, name, address);//전체 생성자를 들여와서 씀.@AllArgsConstructor
        }//매개변수들은 StudentBuilder안에 있는 것.
        //studentCode, name, address가 null인 상태로 new Student


    }
}
