package package0827;

import java.util.Scanner;

public class Example03_Operator {
	public static void main(String[] args) {
		// 세 자리 정수(100 ~ 999) 까지의 정수를 입력을 받아서
		// 일의 자리, 십의 자리, 백의 자리를 출력하는 프로그램을 작성
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("세 자리 정수를 입력하세요 : ");
	    int num1 = input.nextInt();
	    
	    int oneDigit = num1 % 10;
	    System.out.println("일의 자리 : " + oneDigit);
	    
	    int twoDigit = (num1 / 10) % 10;
	    // int twoDigit = (num1 % 100) / 10;
	    System.out.println("십의 자리 : " + twoDigit);
	    
	    int threeDigit = num1 / 100;
	    System.out.println("백의 자리 : " + threeDigit);
	    
	    System.out.print("백의 자리 : " + threeDigit);
	    System.out.print(", 십의 자리 : " + twoDigit);
	    System.out.println(", 일의 자리 : " + oneDigit);

	    input.close();
	}
}
