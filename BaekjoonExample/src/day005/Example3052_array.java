package day005;

import java.util.Scanner;

public class Example3052_array {
	public static void main(String[] args) {
		// 10개의 정수가 주어진다
		// 이를 42로 나눈 나머지를 구한다.
		// 그다음 서로 다른값이 몇개 있는지 구하여라
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [10];
		int[] count = new int[10];
		int n1 = 0;
		
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
			num[i] %= 42;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = i+1; j < 10; j++) {
				if ((num[i] == num[j]) && (j > i)) {
					count[i]++;
				}
			}
			if (count[i] == 0) n1++;

		}
	

		System.out.print(n1);
		
		sc.close();
	}
}
