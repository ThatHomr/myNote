package package0827;

import java.util.Scanner;

public class Example04_Operator {
	public static void main(String[] args) {
		// 사용자로부터 초 단위의 시간을 입력을 받고
		// 해당 시간이 몇시간 몇분 몇초인지 출력
		//	input : 7315
		//  2시간 1분 55초
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a time in seconds : ");
		int time = input.nextInt();
		
		// 1시간 = 60분 = 3600초
		int hour = (time / 60) / 60;
		// int hour = time / 3600;
		int minute = (time / 60) % 60;
		// int minute = (time % 3600) / 60;		
		int second = time % 60;
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
		
		input.close();
	}
}
