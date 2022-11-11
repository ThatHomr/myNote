package day002;

import java.util.Scanner;

public class Example25304_for {
	public static void main(String[] args) {
		// 구매한 각 물건의 가격과 개수
		// 구매한 물건들의 총 금액
		// 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
		// 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
		// 후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
		
		
		Scanner input = new Scanner(System.in);
		
		int money_sum = input.nextInt();
		int num = input.nextInt();
		
		int[] goods = new int[num];
		int[] price = new int[num];
		int goods_price = 0;
		
		for (int i = 0; i < num; i++) {
			goods[i] = input.nextInt();
			price[i] = input.nextInt();
			goods_price += (goods[i] * price[i]);
		}
		
		if(money_sum == goods_price) System.out.print("Yes");
		else System.out.print("No");
		
		input.close();
	}
}
