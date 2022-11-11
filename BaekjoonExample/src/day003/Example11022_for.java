package day003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Example11022_for {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int num1 = 0;
		int num2 = 0;
		int[] sum = new int [num];		
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			sum[i] = num1 + num2;
		}
		
		for (int i = 0; i < num; i++) {
			bw.write("Case #" + (i+1) + ": ");
			bw.write(sum[i] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
