package package0828;

import java.util.Scanner;

public class Example05_Operator {
	public static void main(String[] args) {
		// 사용자로부터 두 개의 점수를 입력을 받고, 평균을 구한뒤
		// 두 점수가 각각 40점 이상이거나 두 점수의 평균이 50 점 초과인지
		// 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		int score1 = 0;
		int score2 = 0;
		
		System.out.print("두 개의 점수를 입력하세요 : ");
		
		score1 = input.nextInt();
		score2 = input.nextInt();
		
		double avg = (double)(score1 + score2) / 2;
		
		System.out.println("평균은 : " + avg);
		
		boolean score_b = (score1 >= 40) && (score2 >= 40);
		boolean score_avg = score_b || (avg > 50);
		
		System.out.println("두 점수가 40점이상이거나, 평균이 50점 초과인가? : " + score_avg);
		
		
		input.close();
	}
}
