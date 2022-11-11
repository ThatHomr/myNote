package day001;

import java.util.Scanner;

public class Example1000_inout {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.print(sum);
		
		input.close();
	}
}
