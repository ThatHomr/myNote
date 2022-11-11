package day013;

import java.util.ArrayList;

public class Example4673_function {
	
	public static int selfNum(int n) {
		int dNum = 0;
		int num = 0;
		if (n < 10) num = n + (n % 10);
		else if (n < 100) num = n + (n / 10) + (n % 10);
		else if (n < 1000) num = n + (n / 100) + ((n % 100) / 10) + (n % 10);
		else if (n < 10000) num = n + (n / 1000) + ((n % 1000) / 100) + ((n % 100) / 10) + (n % 10);
		else if (n == 10000) num = n + 1;
		else num = 0;
		dNum = num;
		return dNum;
	};


	public static void main(String[] args) {
		ArrayList<Integer> selfNumList = new ArrayList();
		
		for (int i = 1; i < 10000; i++) {
			selfNumList.add(selfNum(i));
		}
	
		for (int i = 1; i < 10000; i++) {
			if (!selfNumList.contains(i)) {
				System.out.println(i);
			}
		}
		
	}

}
