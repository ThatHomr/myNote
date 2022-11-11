package day004;

import java.util.Scanner;

public class Example1110_for {
	public static void main(String[] args) {
		// 첫째줄에 N이 주어진다
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int copy = N;
		int count = 0;
		do {
			N = ((N % 10)* 10) + (((N / 10) +(N % 10)) % 10);
			count++;			
		}
		while (copy != N);
		
		System.out.print(count);	
		
		sc.close();
		
	
	}
}
