package j14_스태틱.빌더;

public class StudentMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("안창호")
                .address("부산")
                .build();//순서 상관없고 몇몇 변수 빼먹어도 괜찮.
        //생성자를 일일이 만들면 이름 같고 매개변수 자료형이 같으면 더 만들 수가 없으므로 불편. 그래서 Builder를 쓴다.

        System.out.println(student);

        Student.StudentBuilder sb = new Student.StudentBuilder();// Student가 아니라 그 내부 클래스인 StudentBUilder의 생성자에 접근. StudentBuilder가 static이므로 Student를 생성할 필요 없다.
    //static메소드인 builder도 static 클래스에 접근 가능하다.
    }
}
