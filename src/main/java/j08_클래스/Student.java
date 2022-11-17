package j08_클래스;

public class Student {

    String school;
    String name;
    int studentYear;
    boolean gender;

    Student () {}
    Student (String school, String name, int studentYear, boolean gender) {
        this.school = school;
        this.name = name;
        this.studentYear = studentYear;
        this.gender = gender;
    }


    void showStudentInfo() {
        System.out.println("학교명 : " + school);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + studentYear);
        System.out.println("성별: " + (gender ? "남" : "여")); //? true면 클론 앞의 값이 대입, false면 뒤의 값이 대입

    }
}
