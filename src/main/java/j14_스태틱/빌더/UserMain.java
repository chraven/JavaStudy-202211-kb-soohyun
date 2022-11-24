package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {
        User user = User.builder()
                .username("younghee")
                .password("1234")
                .email("younghee@gmail.com")
                .name("김영희")
                .build();//Static//원하는 변수만 넣을 수 있고, 입력 순서가 바뀌어도 상관없음.

        System.out.println(user);

    }
}
