package j08_클래스;

public class StudentMain {

    public static void main(String[] args) {
       // Student student = new Student("부산대학교", "홍길동", 3, true);
        //student.showStudentInfo();
          Student student = new Student();
          Student student2 = new Student("부경대학교", "홍길순", 2, false);

          student.school = "부산대학교";
          student.name = "홍길동";
          student.studentYear = 3;
          student.gender = true;

        student.showStudentInfo();

        student2.showStudentInfo();

    }
}
//student.showStudentInfo();