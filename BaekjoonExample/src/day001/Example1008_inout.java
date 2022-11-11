package day001;

import java.util.Scanner;

public class Example1008_inout {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		double num3 = (double)num1 / num2;
		
		System.out.print(num3);
		
		input.close();
	}
}
