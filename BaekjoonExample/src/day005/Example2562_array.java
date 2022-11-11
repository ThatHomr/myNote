package day005;

import java.util.Scanner;

public class Example2562_array {
	public static void main(String[] args) {
		// 9개의 정수가 주어진다
		// 최대값을 구하고
		// 다음 줄에 최대값이 몇번째 숫자인지 구하라
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [9];
		int max = 0;
		int max_num = 0;
		
		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
			if ((num[i] > 0) && (num[i] < 100)){
			max = max > num[i] ? max : num[i];
			if (max == num[i]) max_num = i + 1;
			}
			else return;
		}
		System.out.println(max);
		System.out.print(max_num);
		
		sc.nextLine();
		sc.close();
	}
}
