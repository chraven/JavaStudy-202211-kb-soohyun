package j05_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {

        String select = null;

        Scanner scaner = new Scanner(System.in);//스캐너 선언
        System.out.print("선택: ");
        select = scaner.nextLine();

        switch(select){//스위치는 괄호 안의 값을 찾아감. select는 변수명. 이것과 동일한 것을 찾아감.
            // 아침을 쓰면 아침을 찾아감. 없으면 넘어감.
            case "아침"://if처럼 괄호가 없음. 그냥 클론으로 접근.//case 자료형은 하나로 통일되어야
                System.out.println("아침 식사");
                break; //여기서 switch를 멈춤.
            case "점심" :
                System.out.println("점심 식사");
                break;
            case "저녁":
                System.out.println("저녁 식사");
                break;
            default://그 외에 다른것들이 입력되면//제일 마지막이므로 break가 필요없다.
                System.out.println("잘못된 입력입니다.");
        }
    }
}
