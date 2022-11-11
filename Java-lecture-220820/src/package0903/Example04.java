package package0903;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 정수가
		// 양수이면 "n is positive number." 를 출력하고
		// 음수이면 "n if negative number." 를 출력하고
		// 0 이면 "n is zero." 를 출력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer >>> ");
		
		int num = sc.nextInt();
		
		if (num > 0) System.out.println("n is positive number.");
		else if (num < 0) System.out.println("n is negative number.");
		else System.out.println("n is zero.");
		
		
		sc.nextLine();
		sc.close();
	}
}
