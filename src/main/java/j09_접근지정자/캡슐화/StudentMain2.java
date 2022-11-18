package j09_접근지정자.캡슐화;

public class StudentMain2 {

    public static void main(String[] args) {
        Student2 student = new Student2("서울대학교", "유관순", 2, true);
        Student2 student2 = new Student2();

        student2.setName("유관일");

        String nameStudent = student2.getName();
        System.out.println(nameStudent);

    }
}
