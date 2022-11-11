package day001;

import java.util.Scanner;

public class Example3003_inout {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int king = input.nextInt();
		int queen = input.nextInt();
		int rook = input.nextInt();
		int bishop = input.nextInt();
		int knight = input.nextInt();
		int pawn = input.nextInt();
		
		System.out.print(1 - king + " ");
		System.out.print(1 - queen + " ");
		System.out.print(2 - rook + " ");
		System.out.print(2 - bishop + " ");
		System.out.print(2 - knight + " ");
		System.out.print(8 - pawn);
		
		input.close();
	}
}
