import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		String s = "1 2 3 Z Z";
		int answer = 0;

		String[] str = s.split(" ");

		int length = str.length;
		int[] arr = new int[length];

		s = str[0];
		if (!(s.equals("Z"))) {
			arr[0] = Integer.parseInt(s);
		}
		else {
			arr[0] = 0;
		}
		answer += arr[0];
		String s2 = "";

		for (int i = 1; i < length; i++) {
			s = str[i];
			s2 = str[i-1];

			if (s.equals("Z")) {
				arr[i] = -(arr[i-1]);
			}
			else if (s2.equals("Z") && s.equals("Z")) {
				arr[i] = 0;
			}
			else {
				arr[i] = Integer.parseInt(s);
			}

			answer += arr[i];
		}

	}
		
}
