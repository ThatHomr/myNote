package package1001;


// 객체를 만들기 위한 클래스( = 설계도)
//  → 절대 main 메서드를 작성하지 않는다.
//  → 하나의 파일에는 하나의 클래스만 작성하는 것이 원칙
//  → 파일의 이름과 클래스의 이름은 동일해야한다.
//  → class 키워드를 통해 클래스를 선언
public class Simple {
	// 클래스의 블록에는 객체가 가질
	// 특성(속성)과 기능(행동)을 정의한다.
	//  특성 = 값(데이터)
	//  기능 = 명령어
	
	// 객체가 가징 특성들을 객체에 저장을 하기 위해
	// 객체의 특성을 저장하는 변수
	//  = 필드(field) = 멤버 변수
	String name;	// Simple 객체의 이름을 저장하기 위한 변수
	int data;		// Simple 객체의 데이터를 저장하기 위한 변수
	
	// 객체가 수행할 기능들을 구현하기 위해 메서드 정의
	//  = 메서드(method) = 멤버 함수
	void print() {
		System.out.println(name + " : " + data);
	}
	
	
}
