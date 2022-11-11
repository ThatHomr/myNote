package package0918;

import java.util.Scanner;

public class Example03_Array {
	public static void main(String[] args) {
		
		// 사용자로부터 10개의 점수를 입력받아
		// 배열에 저장한 다음 총합과 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		int length = 10;
		
		int[] scoreArr = new int[length];
		int total = 0;
		double avg = 0;
		
		for (int i = 0; i < length; i++) {
			System.out.print("Enter a score >>> ");
			scoreArr[i] = sc.nextInt();
			total += scoreArr[i];
		}
		
		avg = (double)total / length;
		
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
		
		sc.close();
		
	}
}
