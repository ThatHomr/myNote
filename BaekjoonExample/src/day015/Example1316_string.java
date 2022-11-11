package day015;

import java.util.Scanner;

public class Example1316_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int count = num;
		
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			sc.nextLine();
			boolean[] apb = new boolean[26];
			
			for(int j = 0; j < str.length(); j++) {
				int n = str.charAt(j) - 97;
				if (j == 0) {
					apb[n] = true;
					continue;
				}
				if (str.charAt(j) == str.charAt(j-1)) {
					apb[n] = true;
					continue;
				} else {
					if (apb[n] == true) {
						count--;
						break;
					}
					apb[n] = true;
				}
			}
			
		}
		System.out.println(count);
		
		sc.close();
	}

}
