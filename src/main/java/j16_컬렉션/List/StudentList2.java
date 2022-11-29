package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {

    public static void main(String[] args) {

//        List<String> nameList= Arrays.asList(new String[] {
//                "김영희",
//                "김일희",
//                "김이희"
//        });//중괄호 안의 배열을 ArrayList로 변환
//
//        for(Hobby h : hobbyList) {
//            System.out.println(h);
//            }
//
//        Object[] nameArray = nameList.toArray();//배열로 리턴됨. 모두 object로 업캐스팅된 상태로 들어감. 쓰려면 안의 값들을 다운캐스팅해야
//
//        System.out.println((String)nameArray[0]);//배열 전체를 다운캐스팅하는 게 아니라 인덱스 값 하나하나를 다운캐스팅해서 꺼내야


        List<Hobby> hl = Arrays.asList(new Hobby[] {
        new Hobby(1, "축구"),
        new Hobby(2, "농구"),
        new Hobby(3, "골프"),
        new Hobby(4, "음악감상")
        });

        Student s1 = Student.builder()
                .studentId(20220001)
                .name("홍길동")
                .age(21)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(2)}))//새로운 취미 목록을 만듦
                .build();


        Student s2 = Student.builder()
                .studentId(20220002)
                .name("유관순")
                .age(22)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(1), hl.get(3)}))//새로운 취미 목록을 만듦
                .build();


        Student s3 = Student.builder()
               .studentId(20220003)
               .name("안중근")
               .age(23)
               .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(3)}))//새로운 취미 목록을 만듦
               .build();

        System.out.println(s1);//@Data로 오버라이드 된 toString 실행됨

        List<Student> sl = new ArrayList<Student>();//ArrayList는 List(인터페이스)를 implements한 클래스. 업캐스팅해서 List에 들어간다.List는 자료형으로 쓰임.
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for(Student s : sl) {
            System.out.println("<학생정보>");
            System.out.println(s);//toString
            System.out.println("<" + s.getName() + "학생 취미>");
            for(Hobby h : s.getHobbyList()) {//Student클래스에 있는 HobbyList. 위에 배열을 리스트로 바꾸어 놓았다.
                System.out.println(h);
            }
            System.out.println();
        }

    }

}
