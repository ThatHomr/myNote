package day016;

import java.util.Scanner;

public class Example2775_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();
		
		int[] k = new int[testCase];
		int[] n = new int[testCase]; 
		
		for (int i = 0; i < testCase; i++) {
			k[i] = sc.nextInt();
			sc.nextLine();
			
			n[i] = sc.nextInt();
			sc.nextLine();
		}
		for (int l = 0; l < testCase; l++) {
			int[][] pn = new int[k[l]+1][n[l]+1];
			for (int i = 0; i <= k[l]; i++) {
				int sum = 0;
				for (int j = 0; j <= n[l]; j++) {
					if (i == 0) {
						pn[i][j] = j + 1;
					}
					else {
						sum += pn[i-1][j];
						pn[i][j] = sum;
					}
				}
			}
			System.out.println(pn[k[l]][n[l]-1]);
		}
		
		sc.close();
	}
}
