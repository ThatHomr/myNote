package package0827;

import java.util.Scanner;

public class Example01_Input {
	public static void main(String[] args) {
		// 사용자로부터 사각형의 너비와 높이를 입력을 받아서
		// 사각형의 너비, 높이, 넓이를 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형의 너비를 입력하세요 : ");
		int width = input.nextInt();
		
		System.out.print("사각형의 높이를 입력하세요 : ");
		int height = input.nextInt();
		
		System.out.println("사각형의 너비 : " + width);
		System.out.println("사각형의 높이 : " + height);
		System.out.println("사각형의 넓이 : " + (width * height));
		
		input.close();
		
	}
}
