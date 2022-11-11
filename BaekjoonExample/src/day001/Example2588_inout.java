package day001;

import java.util.Scanner;

public class Example2588_inout {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		
		int num2 = input.nextInt();
		
		// 일의 자리
		int n1 = num2 % 10;
		// 십의 자리
		int n2 = (num2 / 10) % 10;
		// 백의 자리
		int n3 = num2 / 100;
		
		System.out.println(num1 * n1);
		System.out.println(num1 * n2);
		System.out.println(num1 * n3);
		System.out.print(num1 * num2);
		
		input.close();
	}
}
