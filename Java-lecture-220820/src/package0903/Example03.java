package package0903;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 입력받은 값이
		// 짝수인지 홀수인지 출력하는 프로그램을 작성
		
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if ((num % 2) == 0) {
			System.out.println("num = " + num + "은 짝수 입니다.");
		}
		else {
			System.out.println("num = " + num + "은 홀수 입니다.");
		}
		System.out.println("------------------------------------------------");
		sc.nextLine();
		//---------------------------------------------------------------------
		// 점수 3개를 입력을 받고 평균이 75점 이상이면 "합격입니다" 를 출력하고
		// 그렇지 않으면 "불합격입니다." 를 출력하는 프로그램을 작성
		System.out.print("점수 3개를 입력하세요 : ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		double avg = (double)(n1 + n2 + n3) / 3;
		
		System.out.printf("평균은 : %.2f\n", avg);
		
		if (avg >= 75)
			System.out.println("합격입니다.");
		else 
			System.out.println("불합격입니다.");
		
		sc.nextLine();
		sc.close();
	}
}
