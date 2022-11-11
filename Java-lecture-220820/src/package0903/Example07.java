package package0903;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		// 1 ~ 99 사이의 정수를 입력을 받고
		// 정수 값 중에 3, 6, 9가 한개 있으면 "박수짝" 을 출력하고
		// 두개 있으면 "박수짝짝"을 출력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer >>> ");
		
		int num = sc.nextInt();
		while ((num < 1) || (num > 99)) {
			System.out.println("ERROR"); 
			System.out.println("1 <= number <= 99");
			System.out.print("Enter an integer >>> ");
			num = sc.nextInt();
		}
		
		int num1 = num / 10;
		int num2 = num % 10;
		
		boolean firstMultiple = (num1 > 0 && (num1 % 3 == 0));
		boolean secondMultiple = (num2 > 0 && (num2 % 3 == 0));
		
		if (firstMultiple && secondMultiple) {
			System.out.println("박수짝짝");
		}
		else if (firstMultiple || secondMultiple) {
			System.out.println("박수짝");
		}
		else {
			System.out.println(num);
		}
		
		sc.nextLine();
		sc.close();
	}
}
