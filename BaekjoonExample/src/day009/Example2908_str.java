package day009;

import java.util.Scanner;

public class Example2908_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int[] num_a1 = new int [3];
		int[] num_a2 = new int [3];
		int max1 = 0;
		int min1 = 0;
		
		for (int i = 0; i < 3; i++) {
			num_a1[i] = num1 % 10;
			num1 /= 10;
		}
		
		num1 = num_a1[0] * 100 + num_a1[1] * 10 + num_a1[2];
		
		for (int i = 0; i < 3; i++) {
			num_a2[i] = num2 % 10;
			num2 /= 10;
		}
		
		num2 = num_a2[0] * 100 + num_a2[1] * 10 + num_a2[2];
		max1 = num1 > num2 ? num1 : num2;
		min1 = num1 < num2 ? num1 : num2;
		
		System.out.println(max1);
		
		sc.close();
	}
}
