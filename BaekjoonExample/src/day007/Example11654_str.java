package day007;

import java.util.Scanner;

public class Example11654_str {
	public static void main(String[] args) {
		// 아스키코드값 출력
		// 입력값, 출력값 (A ~ Z,65), (a ~ z, 97 ~ 122), (0 ~ 9, 48 ~ 57)
				
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	
		
		System.out.print(str.codePointAt(0));
		
		sc.nextLine();
		sc.close();
		
	}
}
