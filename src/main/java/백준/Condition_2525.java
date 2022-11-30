package 백준;

import java.util.Scanner;

public class Condition_2525 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int min = 60 * a + b; //min = 60 * 시 + 분
		min += c;
		
		int hour = (min / 60) % 24; //시 (24시 이상이 될 경우 0시부터 시작하도록 한다)
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
	}
}
