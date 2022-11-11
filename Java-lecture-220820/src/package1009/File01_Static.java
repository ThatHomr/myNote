package package1009;

// static 제어자
//	- '클래스의', '공통적인' 의 의미
//  - 일반 필드 같은 경우, 인스턴스(객체)가 생성된 후 만들어진다.
//	  각 객체마다 다른 값을 유지한다.
//  - static 멤버 변수는 인스턴스에 관계없이 같은 값을 갖는다.
//		→ 하나의 변수를 서로 공유한다.

// static 멤버 변수
//  - 모든 인스턴스 공통적으로 사용하는 클래스 변수
//  	= 객체가 가지는 변수가 아닌 클래스가 가지는 변수
//  - 인스턴스를 생성하지 않고 사용 가능
//		= 클래스를 통해서 static 멤버 변수에 접근
//	- JVM이 클래스를 로드할 때 생성

// static 메서드
//	- 인스턴스를 생성하지 않고 사용 가능
//	- static 메서드 내에서는 static 멤버만 접근 가능
//	  즉, 인스턴스 멤버에는 접근할 수 없다.

// static 멤버의 특성
//	- 공간적 특성
//		클래스에 하나 생성
//		인스턴스(객체)에 생성되는 것이 아니다.
//	- 시간적 특성
//		클래스를 로드할 때 생성
//		아무런 참조 변수가 없어도 사라지지 않는다.
//		프로그램이 종료될 때 사라진다.
//	- 공유 특성
//		동일한 클래스의 모든 인스턴스들이 공유한다.

class SimpleA {
	// 인스턴스 변수
	int defaultData;
	// static 멤버 변수 / 클래스 변수
	static int staticData;
	
	// 인스턴스 메서드
	void defaultPrint() {
		System.out.println("defaultData = " + defaultData);
		System.out.println("staticData  = " + staticData);
	}
	
	// static 메서드
	static void staticPrint() {
		// System.out.println("defaultData = " + defaultData);
		// 인스턴스 멤버는 객체를 생성한 다음 접근이 가능하기 때문에
		// 생성되는 시기가 맞지 않아 접근할 수 없다.
		
		System.out.println("staticData  = " + staticData);
	}
}

public class File01_Static {
	
	public static void main(String[] args) {
		SimpleA s1 = new SimpleA();
		
		// 객체를 통해서 각 멤버에 접근
		s1.defaultData = 100;
		s1.staticData = 200;
		
		System.out.println("s1.defaultData = " + s1.defaultData);
		System.out.println("s1.staticData = " + s1.staticData);
		
		SimpleA s2 = new SimpleA();
		System.out.println("s2.defaultData = " + s2.defaultData);
		System.out.println("s2.staticData = " + s2.staticData);
		
		// 클래스에 생성된 변수이며
		// 클래스를 통해서 접근하는 것이 원칙이다.
		System.out.println("SimpleA.staticData = " + SimpleA.staticData);
		//---------------------------------------------------------------
		s1.defaultPrint();
		//---------------------------------------------------------------
		String.format(null, args);
		Math.abs(-11);
		double pi = Math.PI;
		
	}
}











