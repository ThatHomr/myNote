package day001;

import java.util.Scanner;

public class Example2884_if {
	public static void main(String[] args) {
		// 두개의 변수 hour, minute 받음
		
		// 조건 1 : 현재시간이 45분 미만 일때 시간도 -1
		// 조건 2 : 조건 1일때 시간이 0이라면 시간이 23시
		// 조건 3 : 현재시간이 45분 이상 일때 분 -45
		// 불필요한 0은 사용하지 않는다 예 9시 23분 9 23
		
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		int minute = input.nextInt();
		
		if (minute < 45) {
			if (hour == 0) {
				minute += 15; // (60 - 45)
				hour = 23;
				System.out.print(hour + " " + minute);
			}
			else if (hour > 0) {
				minute += 15; // (60 - 45)
				hour -= 1;
				System.out.print(hour + " " + minute);
			}
		}
		else {
			minute -= 45;
			System.out.print(hour + " " + minute);
		}
		
		input.close();
	}
}
