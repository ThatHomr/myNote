package day007;

import java.util.Scanner;

public class Example10809_str {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int[] num = new int [26];
		
		for (int i = 1; i <= str.length(); i++) {
			int num1 = (str.charAt(i-1) - 97);
			if (num[num1] != 0) continue;
			num[num1] += i;
		}
		for (int i = 0; i < 26; i++) {
			if (num[i] == 0) num[i] = -1;
			else num[i] -= 1;
			System.out.print(num[i] + " ");
		}
		sc.close();
		
	}
}
