package package0828;

import java.util.Scanner;

public class Example01_Operator {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 정수 값이
		// 0 이상의 정수이면 true 를 출력하고
		// 그렇지 않으면 false 를 출력하는 프로그램 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a integer : ");
		int num1 = 0;
		num1 = input.nextInt();
		
		System.out.println("0 <= " + num1 + " : " + (num1 >= 0));
		
		input.close();
	}
}
