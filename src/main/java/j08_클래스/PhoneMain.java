package j08_클래스;

public class PhoneMain {

    public static void main(String[] args) {

        Phone iPhone14 = new Phone();//new하면 메모리 할당. 그럼 phone클래스에 있던 데이터들이 할당된 메모리로 복붙.객체 생성
        Phone galaxyS22 = new Phone("SAMSUNG", "GalaxyS22"); //생성자의 매개변수인 c, m에 대입된다.생성된 시점에 바로 데이터 대입
        System.out.println(iPhone14);
        System.out.println(galaxyS22);

        iPhone14.company = "Apple";//생성자를 생성한 후 데이터를 넣음

        //galaxyS22.company = "SAMSUNG";

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();


    }
}

/*
 *
    Class Student, StudentMain
    * 학생정보
    * String school(학교명)
    * String name(학생이름)
    * int studentYear(학년)
    * boolean gender(성별 true = 남, false = 여)
    *
    * showStudentInfo() {
    * 학교명: 부산대학교
    * 이름 : 홍길동
    * 학년 : 3
    * 성별 : 남
    * }
 *
 */
