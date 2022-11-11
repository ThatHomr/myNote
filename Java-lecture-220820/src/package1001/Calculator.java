package package1001;

public class Calculator {
	// 덧셈
	int add(int x, int y) {
		return x + y;
		// → 연산된 결과 값이 반환된다.
	}
	
	// 뺄셈
	int sub(int x, int y) {
		return x - y;
	}
	
	// 곱셈
	int mul(int x, int y) {
		return x * y;
	}
	
	// 나눗셈
	double div(int x, int y) {
		if (y == 0) {
			System.out.println("0 으로 나눌 수 없습니다.");
			return 0; // 메서드를 종료
		}
		return (double)x / y;
	}
	
	// 나머지
	int mod(int x, int y) {
		if (y == 0) {
			System.out.println("0 으로 나눌 수 없습니다.");
			return 0; // 메서드를 종료
		}
		return x % y;
	}
	
	
}
