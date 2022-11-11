package day014;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numArr = sc.nextInt();
		String[] strArr = new String[numArr];
		String[] str = new String[numArr];
		int count = 0;
		String dummy = sc.nextLine();
		for (int i = 0; i < numArr; i++) {
			strArr[i] = sc.nextLine();
		}
		int count1 = 0;
		
		for (int i = 0; i < numArr; i++) {
			int num = strArr[i].length();
			int length = 0;
			for (int j = 0; j < num;j++) {
				char ch = strArr[i].charAt(j);
				
				str[i] = strArr[i];
				str[i] = str[i].replace(ch, 'A');
				str[i] = str[i].replaceAll("[A-Z]+", "A");
				str[i] = str[i].replace('A', ch);
				length = str[i].length();
				
				if (length == 0) break;
				else if ((length == 1) || (length == 2)) {
					count++;
					System.out.println(count+"+ 0");
					break;
				}
				else if (length > 2) {
					if (str[i].indexOf(ch, j) < 0) {
						count1++;
						System.out.println(count+"+ 1");
						System.out.println(count1 + "count1");
						break;
					}
					else continue;
				}
			}

			
		}
		System.out.println(count);
		
			
		
		
		sc.close();
	}
}
