package package1016;


// 메서드 오버로딩(Method Loading)
//	- 같은 이름의 메서드를 다양하게 정의
//	- 메서드 복사
//  - 상속 관계 상관 없이 가능

// 메서드 오버라이딩(Method Overriding) = 상속 관계에서만 가능
//	- 상위 클래스에 정의되어있는 메서드를
//	  서브 클래스에서 다시 정의하는 것을 의미
//		→ 기존의 메서드를 새롭게 재 정의
//	- 오버라이딩된 메서드(하위 클래스의 메서드)가 
//	  우선 순위가 높기 때문에 상위 클래스의 메서드는
//	  기본적으로 실행되지 않는다.
//		→ 오버라이딩된 메서드를 호출하면 
//		  무조건 오버라이딩된 메서드가 호출
//  	→ 참조 변수를 기준으로 하는 것이 아닌
//		  참조하는 인스턴스를 기준으로 한다.
//  - 상위 클래스의 메서드를 호출하려면 super 레퍼런스를 이용

// 메서드 오버라이딩의 조건
//	- 식별자(이름)가 일치
//	- 매개변수의 타입과 개수가 모두 일치
//  - 반환 타입 일치
//	- static 키워드 유무 일치
//	- 접근 지정자의 범위는 상위 클래스의 메서드보다
//	  범위가 넓거나 같아야한다.
//		범위 : public > protected > default(생략) > private

// 메서드 오버라이딩의 조건이 맞지 않아도
// 오류가 발생하지 않는 경우가 많기 때문에
// 이를 방지가 어렵다.
//  → 이러한 도움을 주기 위한 기능
//	→ @Override  = 어노테이션 중 하나
//			     = 아래 메서드가 오버라이딩된 메서드임을 알리는 태그
//				 = 메서드 오버라이딩의 조건을 검사를 해준다.

class SuperA {
	void print() {
		System.out.println("SuperA Class");
	}
}

class SubA extends SuperA{
	// 메서드의 선언부가 일치하면 이는 오버라이딩된 메서드이다.
	@Override
	void print() {
		//super.print(); // 상위 클래스의 print() 메서드를 호출
		System.out.println("SubA Class");
	}
	
	// 이름이 같지만 매개변수가 다르기 때문에
	// 이는 '메서드 오버로딩'이다.
	void print(int a) {
		System.out.println("SubA Class : " + a);
	}
}

class SubB extends SuperA {
	void print() {
		System.out.println("SubB Class");
	}
}


public class File01_MethodOverriding {
	
	static void print(SuperA sup) {
		// SuperA 클래스 내에 있는 메서드를 지정해서 호출하는 것이 아닌
		// 참조하고 있는 인스턴스 내에 print() 메서드를 호출
		//  → 인스턴스에 오버라이딩된 메서드가 있으면
		//	  오버라이딩된 메서드를 호출한다.
		//  → 동적 바인딩(Dynamic Binding)
		//		: 프로그램 실행 도중에 값 또는 타입, 호출 메서드가
		//		  변경되어 사용되는 경우
		//	↔ 정적 바인딩(Static Binding)
		//		: 프로그램이 실행 될 때 이미 정해진 경우
		//			= 메서드 오버로딩, 일반 메서드
		sup.print();
		
		// sup.print(5);
		// → 해당 메서드는 SubA 클래스에만 정의되어있기 때문에
		//   해당 메서르를 호출하려면 다운 캐스팅을 해야한다.
	}
	
	
	public static void main(String[] args) {
		
		SuperA sp1 = new SuperA();
		SubA sb1 = new SubA();
		SubB sb2 = new SubB();
		
		sp1.print();
		sb1.print();
		sb2.print();
		System.out.println("----------------");
		print(sp1);
		print(sb1);
		print(sb2);
		System.out.println("----------------");
		sb1.print(5);
		// → SubA 클래스에만 정의되어있기 때문에
		//   프로그램 실행할 때 호출될 메서드가 결정된다.
	}
}








