package package1001;

// 프로그램을 실행하기 위한 클래스
public class File01_ObjectOriented {
	public static void main(String[] args) {
		// Simple 클래스의 객체를 생성 및 접근
		
		// Simple 객체를 참조할 참조(Reference) 변수 선언
		//  → 해당 변수에는 객체의 특성과 기능이 있는 것이 아니다.
		Simple dataA;
		
		// Simple 객체를 생성 및 참조
		//  - new 연산자 = 데이터를 생성하기 위해 메모리를 동적 할당
		//				 = 결과 값 : 할당된 메모리의 주소
		//  - 생성자     = new 연산자 다음에 작성되는 메서드
		//				 = 클래스의 이름과 동일한 메서드(초기화 용도)
		//  - 참조 변수  = 객체가 생성된 메모리의 주소를 저장하는 변수
		dataA = new Simple();
		
		System.out.println("dataA = " + dataA);
		// package1001.Simple@5aaa6d82
		//  어떤 타입 @ 메모리 주소
		
		// 객체의 멤버 접근
		//  참조변수 뒤에 멤버 접근 연산자(.)를 통해
		//  멤버에 접근할 수 있다.
		dataA.name = "DataA";	// dataA 의 이름
		dataA.data = 1000;		// dataA 의 데이터
		
		dataA.print();			// dataA 의 출력 기능 실행
		
		Simple dataB = new Simple();
		dataB.name = "DataB";
		dataB.data = 2000;
		dataB.print();
	}
}
