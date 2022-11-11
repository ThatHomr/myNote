package day002;

import java.util.Scanner;

public class Example8393_for {
	public static void main(String[] args) {
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		
		System.out.print(sum);
		
		input.close();
	}
}
