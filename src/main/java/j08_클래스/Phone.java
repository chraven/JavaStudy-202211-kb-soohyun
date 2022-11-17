package j08_클래스;

public class Phone {

    String company;
    String model;

    Phone() {}

    Phone(String c, String m){//생성자는 생략이 되어 있다. 반환 자료형이 없다. 매개변수를 넣을 수 있다.
        System.out.println("생성자 호출?");
        System.out.println();
        company = c;
        model = m;
    }

    void printPhoneCompany() {
        System.out.println("제조사: " + company);
        System.out.println();
    }

    void printPhoneModel() {
        System.out.println("모델명: " + model);
        System.out.println();
    }
}

