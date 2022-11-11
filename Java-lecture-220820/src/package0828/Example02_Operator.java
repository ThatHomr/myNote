package package0828;

import java.util.Scanner;

public class Example02_Operator {
	public static void main(String[] args) {
		// 사용자가 입력한 정수 값이
		// 짝수이면 true, 홀수이면 false 를 
		// 출력하는 프로그램 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num1 = 0;
		num1 = input.nextInt();
		
		System.out.println(num1 + "이 짝수이면 true, 홀수이면 false");
		System.out.println(num1 + " → " + ((num1 % 2) == 0));
		
		input.close();
	}
}
