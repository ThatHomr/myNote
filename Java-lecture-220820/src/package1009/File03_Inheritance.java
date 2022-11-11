package package1009;

import package1009_other.OtherClass;

// 상속(Inheritance)
//  - 새로운 클래스를 작성할 때 기존 클래스의 멤버를 
//	  그대로 사용하기 위한 특성
//  - 새로운 클래스가 기존의 클래스만큼 '확장'되어지는 개념

// 상속 관계에서의 접근 제어자
//  - private
//		: 선언/정의된 클래스 내에서만 접근이 가능하다.
//  - protected 
//		: 같은 패키지에서는 접근 가능
//		: 다른 패키지케서는 서브 클래스에서만 접근 가능

// 상속의 특징
//	- 클래스의 다중 상속을 지원하지 않는다.
//		= 자식은 여러 부모를 둘 수 없다.
//  - 상속 횟수는 제한이 없다.
//		= 부모는 여러 자식을 둘 수 있다.
//  - Java 에서의 모든 클래스의 최상위 클래스는 
//	  java.lang.Object 클래스이다.
//		= 모든 클래스는 Object 를 상속 받고 있으며
//		  Object 의 멤버를 모두 가지고 있다.
//		= 별도로 상속을 받지 않으면 컴파일러에 의해
//		  코드가 삽입된다.


class SuperClass{
	private int superData;
	
	public int getSuperData() {
		return superData;
	}
	public void setSuperData(int superData) {
		this.superData = superData;
	}
}

// 서브 클래스가 슈퍼 클래스만큼 확장된다.
// 즉, 슈퍼 클래스의 멤버를 그대로 사용하겠다.
class SubClass extends SuperClass {
	int subData;
	
	void print() {
		// 서브 클래스 내에서 슈퍼 클래스의 멤버의 접근이 가능하다.
		// 단, private 으로 선언된 멤버는 접근할 수 없다.
		System.out.println("superData = " + getSuperData());
		System.out.println("subData   = " + subData);
	}

	@Override
	public String toString() {
		return "SubClass [subData=" + subData + ", getSuperData()=" + getSuperData() + "]";
	}
	
	
}

// 다른 패키지에 있는 클래스를 상속
class Sub2Class extends OtherClass {
	void setData() {
		// 다른 패키지에 있는 클래스의 멤버 접근
		publicData = 100;
		protectedData = 100;
		//defaultData = 100; // 같은 패키지에서만 접근 가능
		//privateData = 100; // 선언된 클래스에서만 접근 가능
	}
}

public class File03_Inheritance {
	public static void main(String[] args) {
		SuperClass sp = new SuperClass();
		
		sp.setSuperData(100);
		// sp.subData = 100;
		//  → 슈퍼 클래스는 자신을 상속한 서브 클래스의 존재를 알 수 없다.	
		
		SubClass sb = new SubClass();
		sb.setSuperData(100);
		//  → 슈퍼 클래스에 선언된 멤버에 접근이 가능하다.
		sb.subData = 200;
		
		sb.print();
		//------------------------------------
		Sub2Class sb2 = new Sub2Class();
		
		sb2.publicData = 100;
		// sb2.protectedData = 100; 
		// 접근하고자 하는 위치가 서브 클래스가 아니기 때문에
		// 접근할 수 없다.
		
		//-------------------------------------
		// 모든 클래스들은 Object 클래스의 하위 클래스이며
		// Object의 멤버를 모두 가지고 있다.
		//  - 이를 이용하면 어떤 클래스를 만들더라도
		//    Object 의 멤버는 모두 가지고 있다.
		
		sb2.toString();
		// = toString() : 객체를 문자열로 표현하는 메서드
		System.out.println(sb2);
		System.out.println(sb2.toString());
		// → 출력메서드에서는 객체가 넘어오면 
		//   객체의 toString() 메서드를 호출시킨다.
		// → 모든 클래스의 객체들은 toString() 메서드를 가지고 있기 때문
		
		
		Position p1 = new Position(10, 20);
		System.out.println("p1 = " + p1);
		// Object의 멤버 중 toString() 메서드를 
		// 오버라이딩(메서드 재정의)하면
		// 원하는 형식의 문자열로 출력된다.
	}
}


















