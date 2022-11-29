package j16_컬렉션.List;

import lombok.Builder;
import lombok.Data;

@Builder//AllArgsConstructor가 따라옴. 멤버변수를 매개변수로 모두 넣어야 객체를 나중에 생성하고 생성자를 호출
@Data
public class Hobby {

    private int id;
    private String hobbyName;
}
