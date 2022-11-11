package day017;

import java.util.Scanner;

public class Example11653_Math2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		while(N > 1) {
			for (int i = 2; i <= N; i++) {
				if (N % i == 0) {
					N /= i;
					System.out.println(i);

					break;
				}
			}
			
		}
		
		sc.close();
	}
}
