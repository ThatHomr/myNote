package package1002;


// name 의 값이 없거나, 빈 문자열("")인 경우 "Unknown" 으로 저장되도록!

class Simple02 {
	String name;
	int data;
	
	Simple02() { 
		this(null, 0);
		System.out.println();
	}
	Simple02(String name) {
		this(name, 0);
		
		//if(name == null || name.isEmpty()) name = "Unknown";
		//this.name = name;
	}
	Simple02(int data) {
		this(null, 0);
		// this.data = data;
	}
	Simple02(String name, int data) {
		// 필드의 이름과 매개변수의 이름이 같아도 오류는 발생하지 않는다.
		// 단, 우선 순위가 매개변수가 높기 때문에 필드에는 접근할 수 없다.
		// name = name;
		// data = data;
		
		// 클래스 내에서 객체의 멤버에 접근하기 위해서는
		// 객체의 메모리 주소를 알고 있어야 접근이 가능하다.
		// '현재 객체'를 의미하는 'this 레퍼런스'를 이용
		
		if(name == null || name.isEmpty()) name = "Unknown";
		
		// 현재 객체의 name 필드에 매개변수 name 의 값을 저장
		this.name = name;
		// 현재 객체의 data 필드에 매개변수 data 의 값을 저장
		this.data = data;
	}

	
	
	// 다른 객체의 필드를 자신의 필드에 '복사'
	void copy(Simple02 other) {
		name = other.name;
		// => this.name = other.name;
		data = other.data;
	}
	
	// 자신의 필드를 다른 객체의 필드에 '붙여넣기'
	void paste(Simple02 other) {
//		other.name = name;
//		other.data = data;
		
		other.copy(this/* 자신의 객체 */);
	}
	
	
	void print() {
		System.out.println(name + " : " + data);
	}
	
	//----------------------------------------------
	// 필드의 값을 설정하기 위한 메서드
	
	Simple02 setName(String name) {
		this.name = name;
		
		// 자신의 레퍼런스를 그대로 반환
		return this;
	}
	
	Simple02 setData(int data) { 
		this.data = data;
		
		return this;
	}
	
}

public class File02_this {
	public static void main(String[] args) {
		// this 레퍼런스, this 생성자
		
		// this 레퍼런스
		//	- 클래스 내에서 자신의 레퍼런스(주소)를 참조하는 참조 변수
		//  - 클래스 내에서 자신의 멤버에 접근할 때 사용
		//		- 필드의 이름과 매개변수의 이름이 같은 경우
		//		- 다른 메서드(또는 객체)에 자신의 레퍼런스를 넘길 때
		//		- 메서드의 반환 값으로 자신의 레퍼런스를 반환할 때 
		//			→ 객체를 반환하는 경우
		//			→ 메서드 체이닝 기법(Method Chaining)을 사용하는 경우
		
		Simple02 s1 = new Simple02("S1", 100);
		Simple02 s2 = new Simple02();
		
		s1.print();
		s2.print();
		
		// s1 의 필드를 복사
		s2.copy(s1);
		
		s2.print();
		
		Simple02 s3 = new Simple02();
		// s2 의 필드를 s3 에 붙여넣기
		s2.paste(s3);
		
		s3.print();
		//---------------------------------------
		Simple02 s4 = new Simple02();
		
		// s4.setName("S4");
		// → setName() 메서드는 자신의 레퍼런스를 반환하기 때문에
		//	 다른 멤버에 접근이 가능하다.
		// → 메서드 체이닝(Method Chaining)
		//		메서드를 연속해서 호출하는 기법
		s4.setName("S4").setData(200).print();
		// = s4.setData(200).print();
		// = s4.print();
		//----------------------------------------------------------------
		// this() 생성자
		//	- 생성자 내에서 다른 생성자를 호출하기 위한 생성자
		//	- 같은 클래스 내의 다른 생성자를 호출할 수 있다.
		//  - 같은 필드를 검사/초기화하는 코드가 동일한 경우가 많다.
		//   	→ 다수의 생성자를 하나의 생성자를 통해 초기화가 되도록 한다.
		// 		→ 다수의 생성자는 모든 필드를 초기화하는 생성자를 호출한다.
		//			→ 모든 필드를 초기화하는 생성자는 
		//			  모든 필드에 대한 검사와 초기화하는 코드가 있기 때문에
		//			  다른 생성자들이 호출하는 식으로 작성
		//  - this() 생성자는 반드시 첫 줄에만 작성되며
		//	  한 생성자에는 한 번의 this() 생성자를 호출할 수 있다.
	}
}






















