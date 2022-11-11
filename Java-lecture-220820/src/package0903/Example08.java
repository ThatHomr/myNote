package package0903;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		// x1, y1, x2, y2 좌표를 정수 값 입력
		// x1 이 x2 보다 크면 x1 이 큰 만큼의 값(양수)을 출력
		// x1 이 작으면 작은 값 만큼의 값(음수)를 출력
		// x1, x2 가 같으면 y1, y2를 위와 같은 방식으로 비교하여 값 출력
		// ex) 
		// input : 7 8 18 5
		// output : -11
		// input : 7 8 7 5
		// output : 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x1, y1, x2, y2 값을 입력하세요 : ");
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		// if(x1 > x2) System.out.println((x1-x2));
		// else if (x1 < x2) System.out.println((x1 - x2));
		// else if (y1 > y2) System.out.println((y1 -y2));
		// else if (y1 < y2) System.out.println((y1 - y2));
		// else System.out.println(0);
		
		if(x1 != x2) System.out.println(x1 - x2);
		else System.out.println(y1 - y2);
		
		sc.nextLine();
		sc.close();
	}
}
