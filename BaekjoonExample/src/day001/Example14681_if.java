package day001;

import java.util.Scanner;

public class Example14681_if {
	public static void main(String[] args) {
		// 조건 1 : x 양수 y 양수 : 1
		// 조건 2 : x 음수 y 양수 : 2
		// 조건 3 : x 음수 y 음수 : 3
		// 조건 4 : x 양수 y 음수 : 4
		
		Scanner input = new Scanner(System.in);
		
		int x_num = input.nextInt();
		int y_num = input.nextInt();
		
		if ((x_num > 0) && (y_num > 0)) System.out.print("1");
		else if ((x_num < 0) && (y_num > 0)) System.out.print("2");
		else if ((x_num < 0) && (y_num < 0)) System.out.print("3");
		else if ((x_num > 0) && (y_num < 0)) System.out.print("4");
		else System.out.print("0");
		
		input.close();
	}
}
