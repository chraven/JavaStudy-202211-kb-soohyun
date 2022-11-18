package j10_배열;

import java.util.Random;

public class Array3 {

    public static int foundMinNumber(int[] numbers) {
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
      for(int i = 0; i < numbers.length; i++) {
        if(max < numbers[i]) {
            max = numbers[i];
        }
      }

        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        /*

        randomArray 배열을 생성(10개)
        10, 2, 4 , 5, 3, 7, 1
        총합: ?
         */

        int[] randomArray = new int[10];


//   내 답
//   int add = 0;
//        for(int i = 0; i < randomArray.length; i++) {
//            randomArray[i] = random.nextInt(10) + 1;
//            System.out.print(randomArray[i] + ", ");
//            if(i + 1 == randomArray.length) System.out.println(randomArray[i]);
//            add += randomArray[i];
//        }
//        System.out.println(add);

        //선생님 답
        int total = 0;
        for(int i = 0; i < randomArray.length; i++) {//10개의 인덱스에 값을 넣기 위해 돌리는 for문
            while(true) {//break가 걸릴 때까지 돈다. if문에서 break가 걸림
               int randomNumber = random.nextInt(10) + 1;
               boolean found = true;
               for(int j = 0; j < randomArray.length; j++) {//randomNumber와 겹치는 게 있는지 돌리는 for문
                   //숫자 넣기 전엔 맨처음엔 모든 인덱스(모든 인덱스 비교)에 0이 있고 랜덤수(0~9) + 1인 randomNumber와는 반드시 다르므로 if문 조건부가 거짓이 되어 if문 실행이 안되고 넘어감.
                   if(randomArray[j] == randomNumber){
                       found = false;
                       break;//for문 반복 끝남. 겹치는 수가 있을 때 아래 if문은 실행 안됨. 다시 while 반복으로. randonNumber 새로운 번호로 무작위 선점.
                   }
               }
               if(found) {
                   randomArray[i] = randomNumber;
                   break;//while문 무한반복이 끝나고 첫번째 for문으로 두번째 공간 채우기로 감.
               }

          }

        }

        for(int i = 0; i < randomArray.length; i++) {
        total += randomArray[i];

            System.out.print(randomArray[i]);

            if(i != randomArray.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("총합: " + total);

        System.out.println("최소값: " + foundMinNumber(randomArray));
        System.out.println("최대값: " + foundMaxNumber(randomArray));


    }
}
