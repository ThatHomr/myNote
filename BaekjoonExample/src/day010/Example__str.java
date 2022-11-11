package day010;

import java.util.Scanner;

public class Example__str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int[] alpha = new int [26];
		
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 65;
			alpha[num]++;
		}
		int[] time_num = new int [10];
		for (int i = 0; i < 26; i++) {
			if ((i >= 0) && (i < 4)) time_num[2] += alpha[i]; 		// A ~ C
			else if ((i > 3) && (i < 7)) time_num[3] += alpha[i]; 	// D ~ F
			else if ((i > 6) && (i < 10)) time_num[4] += alpha[i]; 	// G ~ I
			else if ((i > 9) && (i < 13)) time_num[5] += alpha[i];	// J ~ L
			else if ((i > 12) && (i < 16)) time_num[6] += alpha[i];	// M ~ O
			else if ((i > 15) && (i < 20)) time_num[7] += alpha[i];	// P ~ S 4개
			else if ((i > 19) && (i < 22)) time_num[8] += alpha[i]; // T ~ V
			else if ((i > 21) && (i < 26)) time_num[9] += alpha[i]; // W ~ Z 4개
		}
		
		int time_sum = 0;
		
		// 초 계산용 걸리는 시간 ((0 == 1) ~ (9 == 0)) 1번 2초 이후 1초씩 늘어남
		int[] num_a = new int [10];
		num_a[1] = 2;
		for (int i = 2;i < 10; i++) {
			num_a[i] = num_a[i-1]+1;
		}
		
		for (int i = 0; i < 10; i++) {
			time_sum += num_a[i] * time_num[i];
		}
		System.out.println(time_sum);
		
		sc.close();
	}
}
