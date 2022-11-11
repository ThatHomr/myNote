package package1009;

// final 제어자
//	- 클래스, 메서드, 필드에 작성할 수 있다.
//	- "최종 형태로 유지시킨다." 라는 공통적인 특성을 가진다.
//  - final 변수
//		: 값을 수정할 수 없는 변수 = 상수
//  - final 메서드
//		: 오버라이딩을 할 수 없는 메서드 = 동일한 메서드를 만들 수 없다.
//  - final 클래스
//		: 상속할 수 없는 클래스

class SimpleB {
	// 상수 필드
	//  - 선언시 초기화
	//  - 생성자를 이용한 초기화
	final int FINAL_DATA;
	
	SimpleB() {
		FINAL_DATA = 100;
	}
	
	SimpleB(int data) {
		FINAL_DATA = data;
	}
	
}

public class File02_final {
	public static void main(String[] args) {
		final double PI = 3.1415; // 상수 = 수정할 수 없다.
		
		// PI = 3.111;
	}
}
