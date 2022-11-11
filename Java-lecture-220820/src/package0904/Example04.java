package package0904;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		
		// 두 정수 a, b를 입력을 받고 a, b 를 포함한 두 정수 사이의
		// 정수들을 출력하는 for문을 작성
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
