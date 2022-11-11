package day001;

import java.util.Scanner;

public class Example1330_if {
	public static void main(String[] args) {
		// A가 B보다 큰 경우에는 '>'를 출력한다.
		// A가 B보다 작은 경우에는 '<'를 출력한다.
		// A와 B가 같은 경우에는 '=='를 출력한다.
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.print(">");
		}
		else if (num1 < num2) {
			System.out.print("<");
		}
		else {
			System.out.print("==");
		}
		
		input.close();
	}
}
