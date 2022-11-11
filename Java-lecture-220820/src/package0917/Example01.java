package package0917;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		// 두 정수 a, b 를 입력을 받아
		// 두 정수 사이의 3의 배수 정수를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two integer >>> ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		/*
		if (a < b) {
			for (int n = a; n < b; n++) {
				if (n % 3 == 0) System.out.println("n = " + n);
			}
		}
		else {
			for (int n = a; n > b; n--) {
				if(n % 3 == 0) System.out.println("n = " + n);
			}
		}
		*/
		
		int one = (a <= b) ? 1: -1;
		
		for  (int n = a; n != (b + one) ; n += one) {
			if (n % 3 == 0) {
			System.out.println("n = " + n);
			}
		}
		
		sc.close();
	}
}
