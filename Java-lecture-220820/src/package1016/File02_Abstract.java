package package1016;


//  추상(Abstract)
//   - 여러가지 사물, 개념 등에서 공통되는 특성이나 속성따위를
//	  추출하여 파악하는 작용
//   - 두루뭉실한 대상
//  추상적인 형태
//   → 동물, 상품 ...
//  구체적인 형태
//   → 개, 고양이, 컴퓨터, ...
//  추상적인 행동
//   → 동물의 이동
//			고양이의 이동
//			비둘기의 이동

// 추상 클래스(Abstract Class)
//  클래스		= 설계도
//  추상 클래스 = 미완성된 설계도 = 완성되지 못한 채 설계된 설계도
//				= 개발이 덜 된 것이 아닌, 구체적으로 작성할 수 없는 
//				  기능(추상 메서드)들을 포함한 설계도
//				= 그 외 생성자, 멤버를 기존 클래스처럼 가질 수 있다.

// 추상 메서드(Abstract Method)
//  메서드		= 행동, 기능
//  추상 메서드	= 추상적인 행동 또는 기능
//				= 메서드의 선언부만 있으며 구현부가 없는 메서드

// 추상 클래스의 특징
//  - 추상적인 개념이기 때문에 구체화할 수 없다.
//		→ 추상 클래스는 인스턴스를 생성할 수 없다.
//  - 추상 클래스는 오로지 상속을 위한 클래스이며
//	  하위 클래스에 의해 완성이 되어진다.
//		→ 만약 하위 클래스에서도 완성을 하지 못하면
//		  하위 클래스도 추상 클래스로 된다.
//  - class 키워드 앞에 abstract 키워드를 작성

// 추상 메서드의 특징
//  - 메서드의 구현부가 없기 때문에 하위 클래스에서 
//    메서드 오버라이딩을 통해 구현을 해야한다.
//  - 하위 클래스는 추상 메서드를 반드시 구현해야하며
//    구현하지 않으면 하위 클래스는 추상 클래스로 취급된다.
//  - 접근 지정자 뒤에 abstract 키워드를 작성


// 추상 클래스
abstract class AbstractSuper {
	int data;
	public AbstractSuper() {
		this(0);
	}
	public AbstractSuper(int data) {
		this.data = data;
	}
	
	// 추상 메서드
	//  - 선언부만 작성되며 소괄호 다음에 세미콜론(;)을 작성
	public abstract void print();
	
}

// 추상 클래스 또한 클래스이기 때문에
// extends 로 상속받으며, 하나만 상속 받을 수 있다.
class SubClass extends AbstractSuper {
	// 추상 메서드를 가진 추상 클래스를 상속 받으면
	// 하위 클래스 이름에 오류가 발생하는데
	//  → 추상 메서드가 있으니 구현을 해라
	//  → 아니면 해당 클래스를 추상 클래스로 선언해라
	
	@Override
	public void print() {
		System.out.println("SubClass!");
	}
	
}

public abstract class File02_Abstract {
	public static void main(String[] args) {
		// 추상 클래스는 인스턴스를 생성할 수 없다.
		// 단, 참조 변수 선언, 배열 생성이 가능
		// AbstractSuper as1 = new AbstractSuper();
		
		AbstractSuper as1 = new SubClass();	// 업 캐스팅 용도로 사용하겠다!
		
		// 추상 클래스에 선언된 추상 메서드를 호출하면
		// 하위 클래스에 오버라이딩된 메서드를 호출한다.
		//  → 추상 클래스는 반드시 하위 클래스에 의해 완성되기 때문에
		//	  메서드를 호출한 시점에는 무조건 오버라이딩된 상태이다.
		as1.print();
		
		
		AbstractSuper[] array = new AbstractSuper[10];
		// AbstractSuper 클래스의 인스턴스를 생성하는 것이 아니라
		// AbstractSuper 클래스 타입의 참조 변수를 10개 만드는 것
		
		// 캐스팅 오버라이딩 복습
		
		
	}
}
