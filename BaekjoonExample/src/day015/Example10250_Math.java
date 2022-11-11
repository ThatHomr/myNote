package day015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example10250_Math {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int[] height = new int[n];
		int[] width = new int[n];
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			height[i] = Integer.parseInt(st1.nextToken());
			width[i] = Integer.parseInt(st1.nextToken());
			num[i] = Integer.parseInt(st1.nextToken());		
		}
		for (int i = 0; i < n; i++) {
			int num2 = 0;
			if ((num[i] % height[i]) == 0) {
				num2 = (height[i] * 100) + (num[i] / height[i]);
				System.out.println(num2);
			}
			else if (num[i] < height[i]) {
				num2 = (num[i] * 100) + ((num[i] / height[i])+1);
				System.out.println(num2);
			}
			else if (num[i] > height[i]) {
				num2 = ((num[i] % height[i]) * 100) + ((num[i] / height[i])+1);
				System.out.println(num2);
			}
			
		}
		
		br.close();
	}
}
