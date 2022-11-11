package day001;

import java.util.Scanner;

public class Example10869_inout {
	public static void main(String[] args) {
		// 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 
		// 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.print(num1 % num2);
		
		
		input.close();
	}
}
