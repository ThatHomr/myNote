package package0918;

import java.util.Scanner;

public class Example02_Array {
	public static void main(String[] args) {
		
		// 사용자로부터 자연수 N 을 입력을 받고
		// 정수형 N 개를 저장할 배열을 생성한 다음
		// 10 부터 10씩 증가하는 값들을 저장한뒤 출력
		//	10, 20, 30, ...
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array's size >>> ");
		int N = sc.nextInt();
		
		int[] N_arr = new int[N];
		
		
		for (int i = 0; i < N;i++) {
			N_arr[i] = (i + 1) * 10;
			System.out.println("N_arr[" + i + "] = " + N_arr[i]);
		}
		
		sc.close();
	}
}
