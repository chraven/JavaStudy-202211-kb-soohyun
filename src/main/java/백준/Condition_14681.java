package 백준;

import java.util.Scanner;

public class Condition_14681 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x > 0) {
            if(y > 0) {
                System.out.println(1);
            }
            else {//y가 0보다 작거나 같을 때
                System.out.println(4);
            }
        }
        else {//x가 0보다 작거나 같을 때
            if(y > 0) {
                System.out.println(2);
            }
            else {//y가 0보다 작거나 같을 때
                System.out.println(3);
            }
        }
    }
}
