package package0828;

import java.util.Scanner;

public class Example06_Operator {
	public static void main(String[] args) {
		
		// 사용자로부터 두 개의 정수를 입력을 받고
		// 두 정수 중 큰 값과 작은 값의 두 정수의 차이를 절대 값으로
		// 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요 : ");
		
		int num1 = 0, num2 = 0;
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		int bigger = num1 > num2 ? num1 : num2;
		System.out.println("큰 값 : " + bigger);
		
		int min = num1 > num2 ? num2 : num1;
		
		int difference = bigger - min;
		// int difference = num1 > num2 ? num1 - num2 : num2 - num1;
		
		System.out.println("두 정수의 차이는 : " + difference);
		
		input.close();
		
	}
}
