package day001;

import java.util.Scanner;

public class Example10430_inout {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		// (A+B)%C
		System.out.println((num1 + num2) % num3);
		// ((A%C) + (B%C))%C
		System.out.println(((num1 % num3) + (num2 % num3)) % num3);
		// (A×B)%C
		System.out.println((num1 * num2) % num3);
		// ((A%C) × (B%C))%C
		System.out.print(((num1 % num3) * (num2 % num3)) % num3);
		
		input.close();
	}
}
