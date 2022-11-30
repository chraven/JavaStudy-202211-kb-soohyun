package 백준;

import java.util.Scanner;

public class Condition_2480 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
				
		//만약 모든 변수가 다른 경우
		if(a != b && b != c && a != c) {
			int max;
			//만약 a > b 라면
			if (a > b) {
				//c > a > b라면
				if(c > a) {
				max = c;
			}
			// a> (b, c)
			else {
				max = a;
			}
		}
		// b > a라면
		  else {
			// c > b > a 라면
			if (c > b) {
				max = c;
			}
			// b > (a, c)
			else {
				max = b;
			}
		}
		System.out.println(max * 100);
	}
	  //적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
		else {
			//3개의 변수가 모두 같을 경우
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			}
			else {
				//a가 b혹은 c랑만 같은 경우
				if (a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				//b가 c랑 같은 경우//셋 다 다른 경우는 위에서 이미 했으므로 넘어감.
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}
	
