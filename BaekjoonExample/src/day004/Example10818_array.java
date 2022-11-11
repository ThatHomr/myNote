package day004;

import java.util.Scanner;

public class Example10818_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_N = sc.nextInt();
		int[] num = new int[num_N];
		int max1 = 0;
		int min1 = 0;
		
		for (int i = 0; i < num_N; i++) {
			num[i] = sc.nextInt();
		}
		max1 = num[0];
		min1 = num[0];
		for (int i = 1; i < num_N; i++) {
			max1 = max1 > num[i] ? max1 : num[i];
			min1 = min1 < num[i] ? min1 : num[i];
		}
		
		System.out.print(min1 + " " + max1);
		
		sc.close();
	}
}
