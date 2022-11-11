package day001;

import java.util.Scanner;

public class Example9498_if {
	public static void main(String[] args) {
		// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
		// 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);
		
		int score = input.nextInt();
		
		if ((score <= 100) && (score >= 90)) {
			System.out.print("A");
		}
		else if ((score < 90) && (score >= 80)) {
			System.out.print("B");
		}
		else if ((score < 80) && (score >= 70)) {
			System.out.print("C");
		}
		else if ((score < 70) && (score >= 60)) {
			System.out.print("D");
		}
		else {
			System.out.print("F");
		}
		
		input.close();
	}
}
