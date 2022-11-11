package day015;

import java.util.Scanner;

public class Example1193_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		int num2 = num;
		
		for (int i = 1; i <= num2; i++) {
			if (i % 2 == 0) {
				if (num <= i) {
					System.out.println(num + "/" + (i - (num-1)));
					break;
				}
				else num -= i;
			}
			else {
				if (num <= i) {
					System.out.println((i - (num-1)) + "/" + num);
					break;
				}
				else num -= i;
			}
			
		}
		
		
		sc.close();
	}
}
