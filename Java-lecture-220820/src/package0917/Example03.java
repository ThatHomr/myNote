package package0917;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("========계산기========");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기(몫)");
			System.out.println("5. 나머지");
			System.out.println("6. 종료");
			System.out.println("======================");
			System.out.println("기능을 입력해주세요 : ");
			
			int num = sc.nextInt();
			
			if (num == 1) {
				System.out.print("두 정수를 입력해 주세요 : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("Result : " + (a + b) );
			}
			else if (num == 2) {
				System.out.print("두 정수를 입력해 주세요 : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("Result : " + (a - b) );
			}
			else if (num == 3) {
				System.out.print("두 정수를 입력해 주세요 : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("Result : " + (a * b) );
			}
			else if (num == 4) {
				System.out.print("두 정수를 입력해 주세요 : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (b == 0) {
					System.out.println("나눌수 없는 수 입니다.");
					continue;
				}
				System.out.println("Result : " + (a / b) );
			}
			else if (num == 5) {
				System.out.print("두 정수를 입력해 주세요 : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (b == 0) {
					System.out.println("나눌수 없는 수 입니다.");
					continue;
				}
				System.out.println("Result : " + (a % b) );
			}
			else if (num == 6) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("없는 기능입니다.");
			}
		}
		
		sc.close();
	}
}
