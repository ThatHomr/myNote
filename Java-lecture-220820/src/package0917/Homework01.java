package package0917;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		
		// 두 정수 a, b 입력 a 와 b 사이의 정수들 중 3의 배수 출력
		// input : 4 20
		// output : 6 9 12 15 18
		// input : 17 1
		// output : 15 12 9 6 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.print("output : ");
			for (int i = num1; i <= num2; i++) {
				if ((i % 3 == 0) && i !=0) System.out.print(i + " ");
			}
		}
		
		// num2 == num1 || num2 < num1
		// num2 와 num1 이 같은 경우이면서 3의 배수인 경우도 있으므로
		else {
			System.out.print("output : ");
			for (int i = num1; i > num2; i--) {
				if ((i % 3 == 0) && i != 0) System.out.print(i + " ");
			}
		}
		
		sc.nextLine();
		sc.close();
	}
}
