package j13_Object;

import lombok.*;

import java.util.Objects;
@NoArgsConstructor //Argument는 매개변수. 매개변수가 없다 -> 기본생성자
@AllArgsConstructor//모든 변수들이 있다. 전체 생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data//위의 주석처리된 애들을 포함함.
//이렇게 달아두면 굳이 getter, setter 등을 안써도 괜찮

public class Entity {
    //정보를 담는 객체 - entity 객체//DTO, Vo
    // Objects 같은 애들 - 기능들, 동작을 하기위한 로직을 담는 객체 - 서비스 객체, 비즈니스 로직

    private String name;
    private int age;
    private Object address;

    public boolean cmp() {
        return this.getClass() == Entity.class;//true 나옴//this.getClass()는 자기자신의 클래스 정보 = Entity //는 생성하지 않아도 되는
    }
}
