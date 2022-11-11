package package0904;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		// 시간과 분을 공백 단위로 입력 45분전의 시간 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시간과 분을 입력하세요 >>> ");
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();

		if (((minute - 45) < 0) && (hour == 0)) {
			hour = 23;
			minute += 15;
			System.out.println(hour + "시 " + minute + "분");
		}
		else if ((minute - 45) < 0) {
			hour -= 1;
			minute += 15;
			System.out.println(hour + "시 " + minute + "분");			
		}
		else {
			minute -= 45;
			System.out.println(hour + "시 " + minute + "분");
		}
		
		sc.nextLine();
		sc.close();
	}
}
