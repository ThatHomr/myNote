package package0827;

import java.util.Scanner;

public class Example02_Input {
	public static void main(String[] args) {
		// 사용자로부터 이름과 나이를 입력을 받아서
		// 이름과 나이와 5년 뒤의 나이를 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = input.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = input.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("5년 뒤의 나이 : " + (age + 5));
		
		input.close();
	}
}
