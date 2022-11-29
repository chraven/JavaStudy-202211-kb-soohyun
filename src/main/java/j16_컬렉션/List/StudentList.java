package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        //Student student = new Student(20220001, "김영희", 29);

        //students.add(student);
        students.add(new Student(20220001, "김영희", 29, null));
        students.add(new Student(20220002, "김일희", 30, null));
        students.add(new Student(20220003, "김이희", 31, null));
        students.add(new Student(20220004, "김삼희", 32, null));
        students.add(new Student(20220005, "김사희", 33, null));

        Student student2 = students.get(3);

        System.out.println(student2);//리스트 0번째있는 학생을 출력하라.

        //이름이 김이희인 학생의 나이를 26세로 바꾸세요.

        for(int i = 0; i < students.size(); i++) {
            Student s = students.get(i);//컬렉션에서 값 가져오는 get
            if(s.getName().equals("김이희")) {//getName은 getter
                s.setAge(26);
                break;
            }
        }
      //students.get(2).setAge(26);//students.get(2)학생의 주소가 담김. .을 찍고 getter,setter를 쓸 수 있음

        //foreach문으로 바꾸었을 때
        for(Student s : students) {
            if(s.getName().equals("김이희")) {
                s.setAge(26);
                break;
            }
        }
        System.out.println(students);
        System.out.println(students.get(2));

        //0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
        //제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동.

       // 내 풀이
//        for(int i = 0; i < students.size(); i++) {
//            Student st = students.get(i + 1);
//            students.get(i).setName(st.getName());
//            if(i == students.size() - 1) {
//                students.get(i).setName(students.get(0).getName());
//            }
//        }

//선생님 답

        String lastName = null;//마지막이름은 갈 곳이 없으니까 null
        for(int i = 0; i < students.size(); i++) {
            int nowIndex = students.size() - 1 - i;//뒤에서부터 시작
            int preIndex = nowIndex - 1;
            Student s = students.get(nowIndex);//자기자신

            if(nowIndex == 0) {
                s.setName(lastName);
                break;//break를 걸어야 preIndec = nowIndex(0) - 1 인덱스를 찾으려는 오류가 안 뜬다.
            }
            if(nowIndex == students.size() - 1) {//위의 if보다 먼저 볼 것. 거꾸로 시작하니까.
            lastName = s.getName();
            }
         s.setName(students.get(preIndex).getName());//
         }
         System.out.println(students);
    }
}
