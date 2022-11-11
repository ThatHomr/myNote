package day009;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Example1152_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int num = st.countTokens();
		System.out.print(num);
		
		sc.close();
	}
}
