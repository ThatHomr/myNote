package day016;

import java.util.Scanner;

public class Example2839_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int count = 0;
		
		
		if (n >= 5) {
			if (n % 5 == 0) {
				count = n / 5;
				System.out.println(count);
			}
			else if ((n % 5) % 3 == 0) {
				count = n / 5;
				int a = n % 5;
				int b = a / 3;
				count += b;
				System.out.println(count);			
			}
			else {
				for (int i = (n / 5); i >= 0; i--) {
					int c = n - (5 * i);
					if (c % 3 == 0) {
						count = i + (c / 3);
						System.out.println(count);
						break;
					}
					else continue;	
				}
				if (count == 0) {
					count = -1;
					System.out.println(count);
				}
			}
		}
		else if (n >= 0) {
			if (n == 0) {
				count = -1;
				System.out.println(count);
			}
			else if (n % 3 == 0) {
				count = n / 3;
				System.out.println(count);
			}
			else {
				count = -1;
				System.out.println(count);
			}
		}
		else {
			count = -1;
			System.out.println(count);
		}
		
		sc.close();
	}
}
