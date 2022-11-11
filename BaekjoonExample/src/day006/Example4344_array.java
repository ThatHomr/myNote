package day006;

import java.util.Scanner;

public class Example4344_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test_n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < test_n; i++) {
			int num = sc.nextInt();
			int[] score = new int [num];
			int sum = 0;
			
			for (int j = 0; j < num; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			double avg = (double)sum / num;
			int count = 0;
			
			for (int j = 0; j < num; j++) {
				if (score[j] > avg) count++;
			}
			
			double persent = ((double)count / num) * 100;
			
			System.out.printf("%.3f", persent);
			System.out.println("%");
			sc.nextLine();
		}
		
		sc.close();
	}

}
