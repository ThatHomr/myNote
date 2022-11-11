package day017;

import java.util.Scanner;

public class Example1978_Math2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		sc.nextLine();
		
		boolean[] num1 = new boolean[N];
		
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			if (num[i] == 0 || num[i] == 1) num1[i] = true;
			for (int j = 2; j < num[i]; j++) {
				num1[i] = false;
				if (num[i] % j == 0) {
					num1[i] = true;
					break;
				}
			}
			
			if (num1[i] == false) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
