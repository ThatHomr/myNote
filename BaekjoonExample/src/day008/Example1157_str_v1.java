package day008;

import java.util.Scanner;

public class Example1157_str_v1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.toUpperCase();
		
		int[] alpha = new int[26];	// 'A' 아스키코드 65
		
		for (int i = 0; i < str.length(); i++) {
			alpha[(str.charAt(i) - 65)]++;
		}
		int max = 0;
		int count = 0;
		int count_num = 0;

		
		for (int i = 0; i < 26; i++) {
			max = max > alpha[i] ? max : alpha[i];
		}
		for (int i = 0; i < 26; i++) {
			if (alpha[i] == max) {
				count++;
				count_num = i;
			}
			
		}
		char alpha1;
		if (count == 1) {
			alpha1 = (char)(count_num+65);
			System.out.print(alpha1);
		}
		else {
			System.out.print("?");
		}
		
		sc.close();
	}
}
