package day007;

import java.util.Scanner;

public class Example2675_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String[] str = new String[num];
		int[] num1 = new int[num];
		
		for (int i = 0; i < num; i++) {
			num1[i] = sc.nextInt();
			str[i] = sc.next();
			}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				int count = 0;
				while (count < num1[i]) {
					System.out.print(str[i].charAt(j));
					count++;
				}
				count = 0;	
			}
			System.out.println();
		}
		
		sc.nextLine();
		sc.close();
	}
}
