package package1002;


class Simple {
	String name;
	int data;
	
	// 생성자(Constructor)
	//  - 객체를 생성한 다음 생성된 객체를 초기화하기 위한 메서드
	//  - 객체를 생성하기 위해 사용되는 new 연산자 다음에 객체의 생성자를 호출
	//  - 클래스에 생성자가 없으면, 컴파일러가 컴파일 하면서 기본 생성자를 삽입
	//		기본 생성자 = 아무런 기능이 없는 생성자
	//  - 생성자도 메서드이기 때문에 메서드의 형태를 가지긴 하나
	//    기존의 메서드와의 차이점이 있다.
	//		- 반환 타입이 없다. (void 조차 작성하지 않는다.)
	//		- 이름은 반드시 클래스의 이름과 동일해야한다.
	//		- 객체를 생성할때만 호출이 가능하다.
	
	// 기본 생성자
	Simple() {
		System.out.println("Defualt Constructor!");
	}
	
	// 이름만 초기화하는 생성자
	Simple(String argName) {
		System.out.println("Name Parametor Constructor!");
		name = argName;
	}
	
	// 필드를 초기화하는 생성자
	Simple(String argName, int argData) {
		System.out.println("Two Parameters Constructor!");
		name = argName;
		data = argData;
	}
	
	
	// 메서드(method)
	//  - 객체가 수행할 기능(행동)을 정의
	
	void print() {
		System.out.println(name + " : " + data);
	}
	
	// 메서드 오버로딩
	//  - 객체 지향의 특성 중 '다형성' 의 하나
	//		→ 다양한 형태를 가지는 특성
	//  - 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 의미
	//  - 이름만 같은 뿐, 매개변수의 개수 또는 타입이 달라야
	//	  메서드가 구분된다.
	//  → 메서드에 전달되는 인자 값만 다를 뿐 동일한 기능을 수행하는 경우에 사용
	
	
	// → 메서드 오버로딩의 조건
	//		1. 메서드의 이름이 동일
	//		2. 매개변수의 개수 또는 타입이 달라야한다.
	//		단, 메서드의 반환 타입과 매개변수의 식별자는 상관 없다.
	
	
	// 필드 data 에 num 의 값을 추가한다.
	void add(int num) {
		data += num;
	}
	
	// 필드 data 에 다른 Simple 객체의 data 를 합한다.
	void add(Simple s) {
		data += s.data;
	}
	
}

public class File01_Constructor {
	public static void main(String[] args) {
		// 생성자를 통해서 객체의 필드를 초기화
		// 만약 생성자를 작성하지 않으면 컴파일러가 삽입
		// 초기화되지 않은 필드들은 기본 값으로 초기화가 되어진다.
		//  → 0, 0.0, false, null
		
		
		
		Simple s1 = new Simple();
		s1.name = "Simple A";
		s1.data = 10;
		s1.print();
		
		s1.add(100);
		s1.print();
		
		Simple s2 = new Simple();
		s2.name = "Simple B";
		s2.data = 50;
		
		s1.add(s2);
		s1.print();
		
		Simple s3 = new Simple("Simple C", 100);
		s3.print();
		
		
		
	}
}
