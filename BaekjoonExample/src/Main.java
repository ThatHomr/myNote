import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] nArr = new int[n];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();
		}
		sc.nextLine();
		
		int v = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			if(nArr[i] == v) count++;
		}
		
		System.out.println(count);
		
		
		sc.close();
	}
		
}