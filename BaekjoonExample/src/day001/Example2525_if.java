package day001;

import java.util.Scanner;

public class Example2525_if {
	public static void main(String[] args) {
		// 조건 1 : 첫째줄 시간 00시 00분
		// 조건 2 : 둘째줄 조리시간 00분
		// 60분을 넘어갈수 있음
		
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		int minute1 = input.nextInt();
		int cooking_time = input.nextInt();
		
		int minute2 = minute1 + cooking_time;
		int hour2 = hour + (minute2 / 60);
		
		if ((minute2 >= 60) && (hour2 >= 24)) {
			minute1 = minute2 % 60;
			hour2 -= 24;
			System.out.print(hour2 + " " + minute1);
		}
		else if (minute2 >= 60) {
			minute1 = minute2 % 60;
			System.out.print(hour2 + " " + minute1);
		}
		else {
			System.out.print(hour2 + " " + minute2);
		}
		
		input.close();
	}
}
