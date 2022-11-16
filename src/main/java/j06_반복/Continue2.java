package j06_반복;

public class Continue2 {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {//for문은 후처리 갔다가 탈출조건 봄.
            if(i % 2 == 0){
                continue;//continue가 실행되면 아래쪽에 있는 게 출력코드가 실행이 안됨
            }
            System.out.println(i);
        }
    }
}
