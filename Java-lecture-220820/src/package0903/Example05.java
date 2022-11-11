package package0903;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 정수의 값이
		// 짝수이면 "n is even number." 를 출력하고
		// 홀수이면 "n is odd number." 를 출력하고
		// 0 이면 "n is zero." 를 출력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer >>> ");
		
		int num = sc.nextInt();
		
		if (num == 0) System.out.println("n is zero.");
		else if ((num % 2) == 0) System.out.println("n is even number.");
		else if ((num % 2) != 0) System.out.println("n is odd number.");
		
		sc.nextLine();
		sc.close();
	}
}
