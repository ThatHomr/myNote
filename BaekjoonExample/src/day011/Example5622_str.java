package day011;

import java.util.Scanner;

public class Example5622_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] num = new int [10];
		
		for (int i = 0; i < str.length(); i++) {
			int num1 = str.charAt(i) - 65;
			if ((num1 >= 0) && (num1 < 3)) num[2]++; 		// A ~ C
			else if ((num1 > 2) && (num1 < 6)) num[3]++; 	// D ~ F
			else if ((num1 > 5) && (num1 < 9)) num[4]++; 	// G ~ I
			else if ((num1 > 8) && (num1 < 12)) num[5]++;	// J ~ L
			else if ((num1 > 11) && (num1 < 15)) num[6]++;	// M ~ O
			else if ((num1 > 14) && (num1 < 19)) num[7]++;	// P ~ S 4개
			else if ((num1 > 18) && (num1 < 22)) num[8]++; // T ~ V
			else if ((num1 > 21) && (num1 < 26)) num[9]++; // W ~ Z 4개
		}
		
		int [] num_time = new int [10];
		num_time[1] = 2;
		for (int i = 2; i < 10;i++) {
			num_time[i] = num_time[i-1] + 1;
		}
		num_time[0] = num_time[9] + 1;
		int sum = 0;
		for (int i = 0; i < 10;i++) {
			sum += (num[i] * num_time[i]);
		}
		System.out.println(sum);
		
		sc.close();
	}
}
