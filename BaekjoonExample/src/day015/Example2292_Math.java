package day015;

import java.util.Scanner;

public class Example2292_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int n = num;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			
			int num2 = 1 + (6 * i);
			if (num <= num2) {
				count = i + 1;
				break;
			}
			else num -= (6 * i);
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
