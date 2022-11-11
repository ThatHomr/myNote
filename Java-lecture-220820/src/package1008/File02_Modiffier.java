package package1008;

// import package1001.Student;



class SimpleB {
	// 필드
	private String name;
	private int data;
	
	// 생성자
	SimpleB() {
		this(null, 0);
	}
	SimpleB(String name) {
		this(name, 0);
	}
	SimpleB(String name, int data) {
		setName(name);
		setData(data);
	}
	
	
	// 필드를 외부에서 사용할 수 있도록 메서드를 정의
	String getName() {				// 필드 name 을 반환하는 메서드
		return name;
	}
	void setName(String name) {		// 필드 name 을 설정하는 메서드
		if (name == null || name.isEmpty())
			name = "UnKnown";
		this.name = name;
	}
	int getData() {
		return data;
	}
	void setData(int data) {
		this.data = data;
	}
	
	void print() {
		// 같은 클래스 내에서 접근이 가능
		System.out.println(name + " : " + data);
	}
}





public class File02_Modiffier {
	// 제어자(Modifier)
	//  - 클래스, 메서드 또는 변수의 선언부에 사용되며
	//	  부가적인 의미를 부여한다.
	//  - 종류 크게 두 가지로 나뉜다.
	//		접근 제거자 : public, protected, default, private
	//		그 외	    : static, final, abstract ...
	//  - 제어자는 하나의 대상에 여러 제어자를 사용할 수 있지만
	//    접근 제어자는 4가지 중 하나만 사용할 수 있다.
	
	// 패키지(Package)
	//  - 연관된 클래스들의 묶음
	//  - 서로 관련된 클래스들 끼리 그룹 단위로 묶어 놓음으로써
	//    클래스들을 보다 효율적으로 관리할 수 있다.
	//  - 패키지는 클래스의 이름의 일부분으로 사용된다.
	//	  따라서 다른 패키지에 동일한 클래스가 있을 수 있다.
	//		Class Full Name = packageName.className
	
	// 접근 제어자(Access Modifier)
	//  - 클래스 또는 멤버에 사용되며,
	//    사용된 대상을 외부에서 접근하지 못하도록 제한하는 제어자
	//  - 종류
	//		public			: 어디서든 접근이 가능
	//		protected		: 같은 패키지에서 접근 가능,
	//						  다른 패키지에서는 서브 클래스에서만 접근 가능
	// 		default(생략)	: 같은 패키지에서만 접근 가능
	//		private			: 선언된 클래스 스코프 내에서만 접근 가능
	
	// 캡슐화(Encapsulation)
	//  - 클래스 내부에 선언된 데이터를 외부로부터 보호하기 위함
	//  - 데이터를 항상 유효한 값으로 유지가 되며, 
	//    외부에서 쉽게 변경되지 않도록 하기 위함
	
	//  - 접근 제어자를 통해 접근 범위를 최소화하게 되면
	//    유지 보수, 테스트 등의 검사할 범위가 그만큼 최소화된다.
	
	//  - 캡슐화된 데이터들은 메소드를 통해서 외부에서 사용할 수 있도록 작성.
	//		캡슐화된 데이터의 값을 설정 : setter 메서드
	//		캡슐화된 데이터의 값을 반환 : getter 메서드
	
	
	
	public static void main(String[] args) {
		// 다른 패키지의 클래스를 불러올 때
		// 해당 클래스를 import 하면 사용할 수 있다.
		// Student std1 = new Student();
		// 또는 패키지 명을 포함한 클래스 명을 작성하면
		// import 하지 않고도 사용할 수 있다.
		//  → 패키지에 이미 있는 클래스와
		//    다른 패키지에 있는 클래스의 이름이 같은 경우
		// package1001.Student std1 = new package1001.Student();
		
		
		SimpleB s1 = new SimpleB("DataA", 100);
		s1.print();
		
		// SimpleB 의 모든 필드가 private 이기 때문에
		// SimpleB 클래스 외부에서는 접근이 불가능하다.
		// s1.name = "Simple1";
		
		s1.setName("Simple1");
		s1.print();
		
	}
}
