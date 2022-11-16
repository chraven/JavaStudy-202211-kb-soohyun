package j06_반복;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String select = null;
        boolean loopFlag1 = true;
        boolean loopFlag2 = true;




    while(loopFlag1) {
        System.out.println("[폴더 선택]");
        System.out.println("1. 문서");
        System.out.println("2. 음악");
        System.out.println("3. 사진");
        System.out.println("4. 동영상");
        System.out.println("q. 프로그램 종료");
        System.out.print("메뉴선택: ");

        select = scanner.nextLine();

        if (select.equals("1")) {
            while(loopFlag2) {
                System.out.println("[1. 문서]");
                System.out.println("1. 대학서류");
                System.out.println("2. 개인자료");
                System.out.println("3. 기업정보");
                System.out.println("b. 뒤로가기");
                System.out.println("q. 프로그램 종료");

                System.out.print("메뉴선택: ");
                select = scanner.nextLine();
                if (select.equals("1")) {//equals는 문자열을 비교/ 수는 =을 씀.

                } else if (select.equals("2")) {

                } else if (select.equals("3")) {

                } else if (select.equals("b")) {
                    break;//b를 입력하지 않으면 break가 실행안됨. 1번의 while문을 벗어남.
                }else if (select.equals("q")) {
                        System.out.println("정말 프로그램을 종료하시겠습니까?(y/n)");
                        select = scanner.nextLine();
                        if (select.equals("y")){
                           loopFlag1 = false;
                           loopFlag2 = false;
                        }
                    //loopFlag1 = false;//바깥 while문이 멈춤
                    //loopFlag2 = false;//내부 while문이 멈춤
                    //break;//1번의 whil문을 빠져나간다.나갔더니 if문. if만 끝남. 바깥 while문으로 돌아가 반복.
                } else{
                    System.out.println("다시 입력하세요.");
                    //다시 while문 처음으로 돌아감. 반복.
                }
            }

        } else if (select.equals("2")) {

        } else if (select.equals("3")) {

        } else if (select.equals("4")) {

        } else if (select.equals("q")) {
            System.out.println("정말 프로그램을 종료하시겠습니까?(y/n)");
            select = scanner.nextLine();
            if (select.equals("y")){
                break;//바깥 while문을 벗어남.
            }
        } else {
            System.out.println("다시 입력하세요");
        }
        //continue;//빠져나오고 처음으로 되돌아가기
    }
    }
}
