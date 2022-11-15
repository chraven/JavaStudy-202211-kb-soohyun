package j05_조건;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.print("시험 성적 입력: ");
        score = scanner.nextInt();

        if(score < 0 || score > 100){//0보다 작거나 100보다 큰 경우
            System.out.println("잘못된 입력!: ");
        }else{

            switch (score / 10){//99를 넣으면 9.9지만 정수타입이 들어가야 하므로 9만 남는다. 형변환으로.
                case 10://아래 코드로 연결되어 100점도 A학점 나오도록
                case 9:
                    System.out.println("A학점");
                    break;
                case 8 :
                    System.out.println("B학점");
                    break;
                case 7 :
                    System.out.println("C학점");
                    break;
                case 6 :
                    System.out.println("D학점");
                    break;
                default:
                    System.out.println("F학점");

            }

        }
    }
}
