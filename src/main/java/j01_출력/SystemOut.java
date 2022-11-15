package j01_출력;

public class SystemOut {
   
    public static void main(String[] args) {
        System.out.print("이름: ");
        System.out.println("홍길동");//\n 줄 바꿈// \t 한 탭 늘어남//\\는 두개 써야 하나가 출력 - Java 이스케이프 문자 검색하기
        // \"라고 써야 큰 따옴표 출력. 작은 따옴표도 마찬가지.
        System.out.print("주소: ");
        System.out.print("부산 동래구 사직동"); //ctrl shift f10 실행 단축키
        System.out.print("연락처: ");
        System.out.println("010-2232-1233");
        System.out.print("성별: ");
        System.out.println("남성");
    }
}
