package j06_반복;

public class Continue {
    public static void main(String[] args) {

        int count = 0;

        while(true) {
            count++;//처음에 여기선 count 0
            System.out.println("나무를" + count + "번 찍습니다.");//여기오면 count 1이 됨. 후증가.
            if(count < 10 ){
                continue;//지금 반복을 그만하고 다음 반복으로 넘어가라 while문으로 가서 반복함.
                //count 10이 되면 if문 넘어감.
            }
            System.out.println("나무가 넘어갑니다.");
            break;
        }
    }
}
