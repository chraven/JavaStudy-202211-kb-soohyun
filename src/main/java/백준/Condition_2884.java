package 백준;

import java.util.Scanner;

public class Condition_2884 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        scanner.close();

        if(minute < 45) {
            hour--;  //시간 1 감소
            minute = 60 - (45 - minute); //분 감소
            if(hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        }
        else {//45분 이상일 때
            System.out.println(hour + " " + (minute - 45));
        }
    }
}
