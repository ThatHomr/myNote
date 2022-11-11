package package0917;

import java.util.Scanner;

public class File01_Loop {
	public static void main(String[] args) {
		// 반복문을 제어하기 위한 제어문
		//  - 반복문의 흐름이 보통 선 검사 후 실행으로 되어져 있어서
		//    원하는 부분에서 검사하여 종료하기가 힘들다.
		//  - 반복문의 흐름을 보다 원할하게 하기 위한 제어문
		
		//  - 종류
		//		break 		: 반복문을 종료하기 위한 제어문
		//		continue	: 수행 중인 반복을 종료위한 제어문
		//					  종료를 하고 다음 반복으로 넘어간다.
		//						for 문 → 반복 후 작업으로 이동
		//						while 문 → 조건식
		
		for (int i = 0;  i < 100; i++) {
			if(i == 30) break;			// 반복문을 즉시 종료
			if(i % 3 == 0) continue;	// 수행 중인 블록을 종료
			
			
			System.out.println("i = " + i);
		}
		
		System.out.println("----------------------------------------");
		//---------------------------------------------------------------------
		
		// 실행 검사 실행
		Scanner sc = new Scanner(System.in);
		// 사용자가 0을 입력할 때 까지 정수를 입력받도록 작성
		// 음수인 경우 다시 입력을 받도록 작성
		while(true) {
			// 입력
			System.out.println("Enter an integer >>> ");
			int  n = sc.nextInt();
			
			// 검사
			if (n == 0) break;
			if (n < 0) continue;
			
			// 출력
			System.out.println("n = " + n);
		}
		
		sc.close();
	}
}
