package package0828;

import java.util.Scanner;

public class Example03_Operator {
	public static void main(String[] args) {
		// 사용자로부터 두 개의 정수를 입력을 받고
		// 두 정수가 각각 70보다 크면 true 를 
		// 그렇지 않으면 false 를 출력하는 프로그램을 작성.
		
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("두 개의 정수를 입력해주세요 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println(num1 + "은 70보다 큰가? : " + (num1 > 70));
		System.out.println(num2 + "은 70보다 큰가? : " + (num2 > 70));
		
		boolean num_boolean = (num1 > 70) && (num2 > 70);
		
		System.out.println(num1 + " " + num2 + "은 70보다 큰가? : " + num_boolean);
		
		input.close();
	}
}
