package day017;

import java.util.Scanner;

public class Example2581_Math2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		sc.nextLine();
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int num = N - M + 1;
		
		boolean[] num1 = new boolean[num];
		
		int sum = 0;
		int min = N;
		int count = 0;
		
		for (int i = M; i <= N; i++) {
			num1[i-M] = false;
			if (i == 0 || i == 1) num1[i-M] = true;
			
			for (int j = 2; j < i; j++) {
				if (num1[i-M] == true) break;
				else if(i % j == 0) {
					num1[i-M] = true;
					break;
				}
			}

			if (num1[i-M] == false) {
				sum += i;
				min = min < i ? min : i;
				count++;
			}
		}
		if (count != 0) {
			System.out.println(sum);
			System.out.println(min);			
		}
		else if (count == 0) {
			sum = -1;
			System.out.println(sum);
		}
		
		sc.close();
	}
}
