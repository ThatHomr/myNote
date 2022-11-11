package package0917;

public class Example04 {
	public static void main(String[] args) {
		// n * n 사이즈의 정사각형을 출력
		// ex) n = 3
		//	  * * *
		//    * * *
		//    * * *
		
		int n = 5;
		
		for (int line = 1; line <= n; line++) {
			System.out.print(line + " line : ");
			
			for (int count = 0; count < n; count++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println("=======================================");
		// m * n 사이즈의 사각형을 출력하는 반복문을 작성
		//	m : 가로 크기
		//  n : 세로 크기
		
		int m = 0;
		
		m = 8; // 가로 크기
		n = 7; // 세로 크기
		
		for(int line = 0; line < n; line++) {
			for (int count = 0; count < m; count++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		//----------------------------------------------------
		// 높이와 밑변이 동일한 직각 삼각형을 출력
		
		n = 7;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		//----------------------------------------------------
		// 높이와 밑변이 동일한 직각 삼각형을 출력
		// 우측에 직각이 있어야함
		
		n = 5;
		
		for (int i = 1; i <= 5; i++) {
			for(int j = (n - i); j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// ㅂ + 한자키 = 특수문자
		
		System.out.println("--------------------------------------");
		//----------------------------------------------------
		
		
		
		
		
		
	}
}
