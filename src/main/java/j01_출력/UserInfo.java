package j01_출력;

public class UserInfo {
    public static void main(String[] args) {
        String name = "홍길동";
        String address = "부산 동래구 사직동";
        String phone = "010-232-2323";//맨 앞에 0이 있으므로 int는 안됨
        int age = 29;

        System.out.println(name + "의 주소는" + address + "입니다.");
        System.out.println(name + "의 연락처는 " + phone + "입니다.");
        System.out.println(name + "의 나이는 " + age + "살입니다.");//여기서 age는 문자열이 됨
    }
}
