package day014;

import java.util.Scanner;

public class Example2941_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.replaceAll("c=", "A");
		str = str.replaceAll("c-", "A");
		str = str.replaceAll("dz=", "A");
		str = str.replaceAll("d-", "A");
		str = str.replaceAll("lj", "A");
		str = str.replaceAll("nj", "A");
		str = str.replaceAll("s=", "A");
		str = str.replaceAll("z=", "A");
		
		System.out.println(str.length());
		
		
		sc.close();
	}
}
