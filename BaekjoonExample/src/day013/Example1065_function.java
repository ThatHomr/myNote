package day013;

import java.util.Scanner;

public class Example1065_function {

	public static int numList(int num) {
		
		
		int count = 0;
		for (int i = 1; i <= num; i++) {
			int numGap2 = ((i / 100) % 10) - ((i % 100) / 10);
			int numGap1 = ((i % 100) / 10) - (i % 10);
			
			if (i >= 100 && i < 1000) {
				if (numGap2 == numGap1) {
					
					count++;
				}
			}
			else if (i < 100) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = numList(num);
		
		System.out.println(count);
		
		sc.close();
	}

}
