package day001;

import java.util.Scanner;

public class Example2480_if {
	public static void main(String[] args) {
		/*
		 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 
		 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

		 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		 4. 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

		 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		 
		 */
		
		Scanner input = new Scanner(System.in);
		
		int dice1 = input.nextInt();
		int dice2 = input.nextInt();
		int dice3 = input.nextInt();
		
		int prize_money = 0;
		int max1 = dice1 > dice2 ? dice1 : dice2;
		int max2 = max1 > dice3 ? max1 : dice3;
		
		if ((dice1 == dice2) && (dice1 == dice3)) {
			prize_money = (dice1 * 1000) + 10000;
			System.out.print(prize_money);
		}
		else if ((dice1 == dice2) || (dice1 == dice3)) {
			prize_money = (dice1 * 100) + 1000;
			System.out.print(prize_money);
		}
		else if (dice2 == dice3) {
			prize_money = (dice2 * 100) + 1000;
			System.out.print(prize_money);
		}
		else {
			prize_money = max2 * 100;
			System.out.print(prize_money);
		}
		
		input.close();
	}
}
