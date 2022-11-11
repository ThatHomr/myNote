package package0903;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		// 사용자로부터 두 개의 정수를 입력을 받고
		// 두 정수의 차이를 절대값으로 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integer >>> ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		// 두 정수의 차이를 저장
		int abs = n1 - n2;
		
		// 변수 abs 의 값이 음수이면 양수로 변환
		if (abs < 0) 
			// abs *= -1;
			abs = -abs;
		
		System.out.println("|a - b| = " + abs);
		
		input.close();
		
		
		
		
	}
}
