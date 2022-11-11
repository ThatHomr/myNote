package day003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Example10871_for {
	public static void main(String[] args) throws IOException {
		// 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
		// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. 
		//  X보다 작은 수는 적어도 하나 존재한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num_N = Integer.parseInt(st.nextToken());
		int num_X = Integer.parseInt(st.nextToken());
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int[] num_A = new int [num_N];
		
		for (int i = 0; i < num_N; i++) {
			int num_st1 = Integer.parseInt(st1.nextToken());
			num_A[i] = num_st1;
			if (num_X > num_A[i]) {
				bw.write(num_A[i] + " ");
			}
		}
			
		br.close();
		bw.flush();
		bw.close();
	}
}
