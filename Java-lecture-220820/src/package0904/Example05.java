package package0904;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		// 임의의 정수를 입력을 받고
		// 각 자리 정수를 출력하는 반복문을 작성
		
		// >>> 312545
		// 1's digit : 5
		// 2's digit : 4
		// 3's digit : 5
		// 4's digit : 2
		// 5's digit : 1
		// 6's digit : 3
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i < num; i *= 10) {
			int digit = num / i;
			int digit2 = digit % 10;
			System.out.println(digit + "\'s digit : " + digit2);

		}
		
		sc.close();
	}
}
