package day005;

import java.util.Scanner;

public class Example1546_array {
	public static void main(String[] args) {
		// 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다.
		// 모든 점수를 점수/M*100으로 고쳤다.
		// , 새로운 평균을 구하는 프로그램을 작성
		// 첫재줄에 과목갯수
		// 두번째줄에 과목점수
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] score = new int [num];
		int max = 0;
		double[] score1 = new double[num];
		double sum = 0;
		
		for (int i = 0; i < num; i++) {
			score[i] = sc.nextInt();
			max = max > score[i] ? max : score[i];
		}
		
		for (int i = 0; i < num; i++) {
			score1[i] = ((double)score[i] / max) * 100;
			sum += score1[i];
		}
		
		System.out.print((sum / num));
		sc.close();
	}
}
