package j12_추상.인터페이스;

/*
    연말 정산
 */

public class Tax implements Calculator{//인터페이스 내 추상메소드 떄문에 추상 클래스로 바꿔라는 빨간줄.
    //추상 메소드를 오버라이드 하면 됨.


    @Override //ctrl + o
    public int calc(int[] values) {
        System.out.println("연말정산을 진행합니다.");
        int result = 0;
        for(int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return result;
    }
}
