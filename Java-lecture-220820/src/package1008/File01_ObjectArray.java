package package1008;


class SimpleA {
	// 필드
	String name;
	int data;
	
	// 생성자
	// 기본 생성자
	SimpleA() {
		this(null, 0);
	}
	// 이름만 초기화하는 생성자
	SimpleA(String name) {
		this(name, 0);
	}
	// 이름과 데이터를 초기화하는 생성자
	SimpleA(String name, int data) {
		
		// 필드의 유효성을 검사하는 코드를 추가해야한다면
		// 해당 생성자에서만 추가를 해도 된다.
		if(name == null || name.length() <= 2)
			name = "Unknwon";
		
		// 필드의 이름과 매개변수의 이름이 동일하기 때문에
		// 필드에 접근하기 위해서는 this 레퍼런스를 이용
		this.name = name;
		this.data = data;
	}
	
	// 같은 타입의 객체를 받아서 같은 필드로 초기화하기 위한 생성자
	// 즉, 필드를 복사할 객체만 전달 받아 초기화
	SimpleA(SimpleA other) { 	// 복사 생성자
		this.name = other.name;
		this.data = other.data;
	}
	
	// 자신의 복사 복사본을 반환하는 메서드
	SimpleA copy() {			// 복사 팩토리
//		SimpleA copyObject = new Simple(name, data);
//		return copyObject;
		
		// 복사 생성자가 있는 경우
		return new SimpleA(this);
	}
	
	void print() {
		System.out.println(name + " : " + data);
	}
	
}


public class File01_ObjectArray {
	public static void main(String[] args) {
		SimpleA s1 = new SimpleA("DataA", 100);
		s1.print();
		
		// 얕은 복사(Shallow copy)와 깊은 복사(Deep copy)
		//  얕은 복사 : 주소 값을 복사 = 같은 메모리를 공유
		//  깊은 복사 : 실제 값을 새로운 메모리 공간에 복사
		
		// 얕은 복사
		SimpleA s2 = s1;
		// 참조 변수 s1 에 저장된 객체의 주소가 s2 에 복사
		// 즉, 같은 객체를 참조
		s2.print();
		
		s1.name = "-";
		s1.data = 300; 	// 참조 변수 s1 을 통해 data 를 수정
		
		s2.print(); 	// 참조 변수 s2 를 통해 data 를 출력할 때
						// 수정된 data 가 출력
		
		// 깊은 복사
		
		// 만약 필드의 값만 같은 별도의 객체를 생성하려면
		// 객체를 따로 생성하고 필드를 같은 값으로 초기화
		SimpleA s3 = new SimpleA(s1.name, s1.data);
		
		SimpleA s4 = new SimpleA(s1);
		SimpleA s5 = s1.copy();
		s3.print();
		s4.print();
		s5.print();
		//---------------------------------------------------------------
		// 객체 배열(Object Array)
		//  - 배열(Array)
		//		같은 타입의 저장 공간들의 집합
		//  - 객체 배열
		//		같은 타입 또는 상위 타입의 객체들의 주소의 집합
		//		즉, 다수의 객체들의 주소를 배열로 관리
		
		// SimpleA 객체 5개를 다루기 위한 배열
		SimpleA[] simples = new SimpleA[5];
		// SimpleA 객체 5개를 참조할 저장 공간을
		// 동적 할당으로 생성
		//  = 참조 변수 5개를 생성
		
		// 빈 참조변수이기 때문에 아무런 객체가 없다.
		System.out.println(simples[0]);
		// 인덱스 0 번 참조변수에 객체를 생성 및 참조
		simples[0] = new SimpleA("Simple0", 100); 
		System.out.println(simples[0]);
		simples[0].print();
		
		// 모든 원소에 SimpleA 객체를 생성 및 참조
		for(int i = 0; i < simples.length;i++) {
			simples[i] = new SimpleA("simple"+(i+1), 100*i);
		}
		
		// 모든 원소가 참조하는 객체에 접근
		for(int i = 0; i < simples.length;i++) {
			simples[i].print();
		}
		
	}
}
