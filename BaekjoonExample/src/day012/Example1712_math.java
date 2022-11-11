package day012;

import java.util.Scanner;

public class Example1712_math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int F_cost = sc.nextInt();				// 고정비용
		int V_cost = sc.nextInt();				// 가변비용
		int S_cost = sc.nextInt();				// 판매비용
		
		int cost = S_cost - V_cost;				// 순이익
		// 가변비용이 판매비용보다 클 경우 계속 마이너스
		if (cost <= 0) System.out.print(-1);	
		
		else if (cost > 0) System.out.print(((F_cost / cost) + 1));
		
		sc.close();
	}
}
