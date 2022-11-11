package package0904;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		// 1~12 사이의 정수 입력 
		// 3~5 "봄"
		// 6~8 "여름"
		// 9~11 "가을"
		// 12,1,2 "겨울"
		// 그 외 숫자 입력 "잘못 입력" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12 사이의 정수를 입력하세요 >>> ");
		
		int num = sc.nextInt();
		
		if ((num >= 3) && (num <= 5)) System.out.println("봄");
		else if ((num >= 6) && (num <= 8)) System.out.println("여름");
		else if ((num >= 9) && (num <= 11)) System.out.println("가을");
		else if ((num == 12) || ((num == 1) || (num == 2))) System.out.println("겨울");
		else System.out.println("잘못 입력");
		
		sc.nextLine();
		sc.close();
	}
}
