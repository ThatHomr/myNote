package package1022;

// 인터페이스 작성

interface SuperInterfaceA { }
interface SuperInterfaceB { }

// 인터페이스에서 다른 인터페이스를 상속 받을 때 'extends(확장)' 를 사용
// 다수의 인터페이스를 상속 받을 수 있다.
interface InterfaceA extends SuperInterfaceA, SuperInterfaceB {
	// 상수
	//  - public static final 이 기본 제어자
	//  - public static final 을 생략
	public static final int CONSTANT_NAME1 = 10;
	int CONSTANT_NAME2 = 10;
	
	// 추상 메서드
	//  - public abstract 이 기본 제어자
	//  - public abstract 을 생략
	public abstract void methodName1();
	void methodNmae2();
	
	// 인터페이스의 변화
	//  - Java8(JDK1.8)
	//		일반(default) 메서드 추가
	//  - Java9(JDK1.9)
	//		private 메서드 추가
	//		static 메서드 추가
	
	// 일반 메서드
	//  - 나중에 추가된 메서드이기 때문에 default 키워드를 작성
	//  - public 기본 제어자이며, 생략이 가능
	public default void methodName3() {
		System.out.println("InterfaceA : methodName3()");
	}
	
}

interface InterfaceB { } 

// 클래스에서 다른 클래스 또는 추상 클래스를 상속 받을 때는 'extends(확장)' 를 사용
// 클래스에서 인터페이스를 상속 받을 때는 'implements(구현)' 를 사용
class SimpleA implements InterfaceA, InterfaceB {

	@Override
	public void methodName1() {
		System.out.println("SimpleA : methodName1()");
		
	}

	@Override
	public void methodNmae2() {
		System.out.println("SimpleA : methodName()");
		
	}
	
}

public class File01_Interface {
	public static void main(String[] args) {
		// 인터페이스(Interface)
		//  - 사물과 사물 사이 또는 사물과 사람 사이의
		//	  소통을 위해 만들어진 매개체 또는 규격
		//   ex) 국내 전자제품 ↔ 콘센트 사이의 규격 : 220V, 콘센트의 모양
		//  - 규격이 정해지고 정해진 규격에 맞춰서 사물을 만들게 되면
		//    다른 사람들이 유사한 사물을 만들더라도 동일하게 소통이 가능해진다.
		
		// 자바에서의 인터페이스
		//  - 클래스들이 갖춰야할 규격을 정의한 타입
		//	  = 특정 데이터 또는 객체와 상호작용하기 위한 규격
		//  - 추상 클래스의 극단적인 형태의 구성
		//		- 추상 매서드와 상수로만 구성
		//		- JDK 1.8 이후로 일반 메서드, static 메서드, private 메서드가 추가가 됨
		
		// 클래스 → 완성된 설계도
		// 추상 클래스 → 미완성된 설계도
		// 인터페이스 → 밑그림만 있는 기본 설계도
		
		// 인터페이스의 특징
		//  - 인터페이스를 상속받은 클래스는 인터페이스의 추상 메서드를 구현
		//    만약 구현하지 않으면 해당 클래스를 추상 클래스로 선언
		//  - 인스턴스를 생성할 수 없다.
		//	  단, 인터페이스 타입의 레퍼런스 변수는 선언이 가능
		//    즉, 캐스팅, 오버라이딩 메서드 호출이 가능하다.
		//  - 인터페이스는 다른 인터페이스를 상속 받을 수 있다.
		//  - 인터페이스는 다중 상속이 가능하다.
		//		하나의 인터페이스에서 다수의 인터페이스를 상속
		//		하나의 클래스에서 다수의 인터페이스를 상속
		
		// 인터페이스의 장점
		//  - 모든 클래스들의 표준화
		//		= 모든 클래스가 동일한 규격을 가지게 된다.
		//  - 개발 시간 단축
		//  	= 클래스들이 갖출 규격을 상속을 통해 구현
		//  - 상속 관계에 없는 클래스들 간의 관계를 맺을 수 있다.
		//  - 클래스들간의 독립적인 프로그래밍이 가능하다.
		
		
		SimpleA s1 = new SimpleA();
		
		s1.methodName1();
		s1.methodNmae2();
		s1.methodName3();
		
		// 참조 변수는 선언이 가능하나
		// 인스턴스는 생성이 되지 않는다.
		// InterfaceA interA = new InterfaceA();
		
		InterfaceA interA = s1;	// 업캐스팅이 가능하다.
		interA.methodName1();   // 추상 메서드 호출
		interA.methodNmae2();   // 추상 메서드 호출
		interA.methodName3();   // 일반 메서드 호출
		
	}
}


// 클래스들간의 독립적인 프로그래밍이 가능하다.
//  → A 클래스에서 B 클래스의 기능을 사용해야한다면
//	  전제는 B 클래스의 기능이 완성이 되어져 있어야한다.
//		→ 직접적으로 사용되는 기능

class A {
	// 직접적으로 사용되는 메서드
	void methodA(B b) {
		// b.methodB();
	}
	
	void methodA(I i) {
		i.methodB();
	}
}

interface I {
	void methodB();
}

class B implements I{

	@Override
	public void methodB() {
		
		
	}
	
}
