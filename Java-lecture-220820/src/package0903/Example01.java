package package0903;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 사용자로부터 입력 받은 양수 값을 출력하는 프로그램을 작성
		// 이때 사용자가 음수를 입력한 경우에는 0으로 출력되도록 해야한다.
		System.out.println("Enter an integer >>> ");
		int n = input.nextInt();
		
		// n 의 값이 음수인 경우 0 으로 설정
		if (n < 0) 
			n = 0;
		
		
		System.out.println("n = " + n);
		input.close();
	}
}
