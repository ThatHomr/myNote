package package0917;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		
		// 세 자리 정수 3개를 입력을 받아서 모두 곱한 값에서 2의 개수를 출력하세요.
		// ex) 123, 456, 789
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int multi = num1 * num2 * num3;
		
		int count = 0;
		
		for (int i = 1; i < multi; i *= 10) {
			int digit = multi / i;
			int digit2 = digit % 10;
			
			if (digit2 == 2) count++;
		}
		
		System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + multi);
		System.out.println(count);
		
		sc.nextLine();
		sc.close();
	}
}
