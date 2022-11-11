package day002;

import java.util.Scanner;

public class Example10950_for {
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 
		// 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// 각 테스트 케이스마다 A+B를 출력한다.
		
		Scanner input = new Scanner(System.in);
		
		int test_num = input.nextInt();
		
		
		int[] num_a = new int[test_num];
		int[] num_b = new int[test_num];
		
		for (int i = 0; i < test_num; i++) {
			num_a[i] = input.nextInt();
			num_b[i] = input.nextInt();
		}

		for (int i = 0; i < test_num; i++) {
			int sum = num_a[i] + num_b[i];
			System.out.println(sum);
		}
		
		input.close();
	}
}
