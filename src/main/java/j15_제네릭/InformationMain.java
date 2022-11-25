package j15_제네릭;

public class InformationMain {

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220003)
               .name("유관순")
                .build();



        Teacher teacher = Teacher.builder()
                        .teacherCode(200)
                                .name("김영희")
                                        .build();



        Information<Student> studentInformation
                = new Information<Student>(student);//information 클래스의 <T>자리에 Student가 잡힘

        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);

        Information2 i1 = new Information2(student);//object라서 괄호 안에 student, teacher 모두 들어올 수 있다.
        Information2 i2 = new Information2(teacher);

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생이름: " + studentInformation.getTarget().getName());
        System.out.println("학생이름2: " +((Student)i1.getTarget()).getName());//i1쓰려면 다운캐스팅을 일일이 해야
    }
}
