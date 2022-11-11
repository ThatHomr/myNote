package package0903;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 정수 값을 검사하여
		// 값에 맞는 결과 값을 출력
		//  - 3의 배수인 경우 : Fizz
		//  - 5의 배수인 경우 : Buzz
		//  - 3의 배수이면서 5의 배수인 경우 : FizzBuzz
		//  - 그 외인 경우 : 정수 값
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer >>> ");
		
		int num = sc.nextInt();
		
		if (((num % 3 == 0) && (num % 5 == 0)) && num !=0) {
			System.out.println("FizzBuzz");
		}
		else if ((num % 3 == 0) && num !=0) {
			System.out.println("Fizz");
		}
		else if ((num % 5 == 0) && num !=0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(num);
		}
		
		sc.nextLine();
		sc.close();
	}
}
