package package0904;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		// 사용자가 입력한 양수를 출력하는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer >>> ");
		int n = sc.nextInt();
		
		/*
		while (n <= 0) {
			System.out.print("Enter an integer >>> ");
			n = sc.nextInt();
		}
		*/
		
		do {
			System.out.print("Enter an integer >>> ");
			n = sc.nextInt();
		} while (n <= 0);
		
		
		System.out.println("n = " + n);
		
		sc.close();
	}
}
