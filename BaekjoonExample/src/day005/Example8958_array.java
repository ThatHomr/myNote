package day005;

import java.util.Scanner;

public class Example8958_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_string = 80;
		int num = sc.nextInt();
		sc.nextLine();
		int score = 0;
		int[] score_sum = new int[num];
		char[][] ox_char = new char[num][num_string];
		
		for (int i = 0; i < num; i++) {
			String ox = sc.nextLine();
			for (int j = 0; j < ox.length(); j++) {
				ox_char[i][j] = ox.charAt(j);
				if (ox_char[i][j] == '\0') break;
			}
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num_string; j++) {
				if (ox_char[i][j] == 'X') {
					score = 0;
					continue;
				}
				else if (ox_char[i][j] == 'O') {
					score++;
					score_sum[i] += score;
				}
				else if (ox_char[i][j] == '\0') break;
			}
			score = 0;
			System.out.println(score_sum[i]);
		}
		sc.close();
	}
}
