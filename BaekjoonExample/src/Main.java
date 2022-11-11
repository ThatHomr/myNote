import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = {3, 30, 34, 5, 9};
		String answer = "";
		
		int length = numbers.length;
		int[] numbers2 = new int[length];
		int[] numbers3 = new int[length];
		
		for (int i = 0; i < length; i++) {
			String n = String.valueOf(numbers[i]);
			char ch = n.charAt(0);
			n = "";
			n += ch;
			int k = Integer.parseInt(n);
			numbers[i] = k;
		}
		int count = 0;
		int j = 0;
		for (int i = 9; i >= 0; i--) {
			for (int j = 0;)
			if (i == numbers2[j]) {
				numbers3[j] = count;
				count++;
				j++;
			}
		}
		
		for (int)
		
		
	
		System.out.println(answer);
		
		
		sc.close();
	}
		
}
