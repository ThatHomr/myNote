package package0917;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		// 임의의 세자리 정수를 3개 입력받아
		// 세 정수의 곱한 값의 2의 개수를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three integers(100 ~ 999) >>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int n = a * b * c;
		System.out.println(a + " * " + b + " * " + c + " = " + n);
		
		int count = 0;
		// 2의 개수를 저장할 카운트 변수
		for (int i = 1; i <= n; i *= 10) {
			int mod = (n / i) % 10;
			
			if(mod == 2) count++;
		}
		
		System.out.println("2's count : " + count);
		
		sc.close();
	}
}
