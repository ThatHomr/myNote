package day017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example1929_Math2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());	// 첫번째 수 M
		int N = Integer.parseInt(st.nextToken());	// 두번째 수 N
		
		// M <= N 사이의 소수 구해서 1줄씩 출력
		
		
		boolean[] num = new boolean[N+1];
		
		num[0] = true;
		num[1] = true;
		
		for (int i = 2; i * i <= N; i++) {
			for (int j = i * i; j <= N; j+=i) {
				num[j] = true;
			}
		}
		
		
		for (int i = M; i <= N; i++) {
			if(num[i] == false) System.out.println(i);
		}
		br.close();
	}

}
