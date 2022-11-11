package package0828;

import java.util.Scanner;

public class Example04_Operator {
	public static void main(String[] args) {
		// 사용자로부터 정수 하나를 입력 받고
		// 입력 받은 정수가 3의 배수이거나 7의 배수이면 true 를
		// 그렇지 않으면 false 를 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		
		int num1 = 0;
		num1 = input.nextInt();
		
		boolean num1_boolean = ((num1 % 3 == 0) || (num1 % 7 == 0));
		System.out.println(num1 + "은 3의 배수이거나 7의 배수인가? :" + num1_boolean);
		
		
		
		
		input.close();
	}
}
