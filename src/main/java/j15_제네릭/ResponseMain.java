package j15_제네릭;

public class ResponseMain {

    public static CMRespDto<?> response(String msg, Object data){//? :여기(리턴값)에 어떤 자료형이 들어올지 모르겠다. Object매개변수이므로 뭔든 들어올 수 있다. 들어올때  Object로 업캐스팅된다.
        return new CMRespDto<>(msg, data);
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220004)
                .name("박영희")
                .build();

        System.out.println(response("학생데이터 응답", student));//object로 업캐스팅되는 매개변수는 여기서 돌리는 게 toString이라, object 안에 있는 메소드라 다운캐스팅 안해도 됨
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
    }
}
