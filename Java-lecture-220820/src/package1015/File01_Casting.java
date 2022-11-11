package package1015;

class Setter {
	// 학생의 나이와 선생님의 나이를 설정하는 메서드
	
	//  - 캐스팅을 활용하지 않으면
	//		- 각 타입 별로 메서드를 정의해야한다.
	//		- Person 을 상속받는 다른 클래스를 새롭게 정의하면
	//		  해당 클래스 또한 새로운 메서드를 정의
//	void setAge(Student std, int age) {
//		std.setAge(age);
//	}
//	void setAge(Teacher tch, int age) {
//		tch.setAge(age);
//	}
	// Person 클래스의 타입 뿐만 아니라
	// Person 클래스를 상속 받는 모든 클래스들의 객체를
	// 매개변수로 받아서 참조할 수 있다.
	//		→ Person 을 상속 받는 새로운 클래스를 만들어도
	//		  해당 메서드에서는 캐스팅되어 전달되기 때문에
	//		  추가할 메서드가 없다.
	static void setAge(Person p, int age) {
		p.setAge(age);
		
		// 만약 캐스팅된 인스턴스가 전달됐고 
		// 다운 캐스팅을 해야한다면 클래스 타입을 검사해야한다.
		//  instanceof
		//  → 참조하는 인스턴스의 타입을 검사하는 연산자
		//  → 참조 변수의 타입을 검사하는 게 아니라
		//    참조하는 인스턴스(실제 메모리에 있는 객체)를 기준으로 검사
		//  → 다운 캐스팅할 때는 반드시 타입 검사를 해야한다.
		//  → 검사할 때는 최하위 클래스 타입부터 검사를 해야한다.
		if(p instanceof Student) {
			System.out.println("학생의 나이를 수정했습니다.");
		}
		else if(p instanceof Teacher) {
			System.out.println("선생님의 나이를 수정했습니다.");
		}
		
	}

}

public class File01_Casting {
	
	public static void main(String[] args) {
		// 타입 변환
		//  - 기본 자료형의 변환처럼 클래스 타입간의 변환
		// 		int ↔ double
		//  - 상속 관계에 있는 클래스들 사이에서만 변환이 가능
		//  - 종류
		//		업 캐스팅(Up-Casting)
		//			상위 클래스 타입으로 변환
		//			자동으로 변환이 되어진다.
		//		다운 캐스팅(Down-Casting)
		//			하위 클래스 타입으로 변환
		//			강제로 변환을 해야한다.
		//  - 사람(Person)의 특성을 그대로 가진
		//    학생(Student)와 선생님(Teacher)는 우리가
		//	  사람(Person) 이라고 할 수 있다.
		//		→ 업 캐스팅
		//  - 임의의 사람(Person)을 보고
		//	  학생(Student) 또는 선생님(Teacher)로 부를 수는 없다.
		//	  정확히 누구인지 모르기 때문에
		//		→ 다운 캐스팅
		//------------------------------------------------------------------
		
		Student std1 = new Student("홍길동", 18, "20210000", 2, 3.2);
		System.out.println(std1);
		
		// 하위 클래스의 객체를 참조하는 참조 변수의 주소를
		// 상위 클래스의 참조 변수에 전달(복사)
		//  = 같은 주소를 참조 = 같은 객체를 참조
		//  → 접근할 수 있는 멤버가 제한된다.
		Person p1 = std1;	// 업 캐스팅
		p1.setAge(19);
		
		System.out.println(std1);
		// 두 참조 변수 모두 같은 객체를 참조하고 있다.
		
		Teacher tch1 = new Teacher("김철수", 32, "20100009", "Java");
		System.out.println(tch1);
		
		// Teacher 클래스 또한 Person 을 상속 받았기 때문에
		// Person 클래스 타입으로 캐스팅이 가능하다.
		p1 = tch1;
		p1.setAge(33);
		System.out.println(tch1);
		
		// 상위 클래스 타입의 참조 변수에 저장된 레퍼런스를
		// 하위 클래스 타입의 참조 변수에 전달(복사)
		//  상위 클래스는 하위 클래스에 대한 정보가 없음
		//  하위 클래스가 얼마나 깊게 있는지 모른다.
		Teacher tch2 = (Teacher)p1;	// 다운 캐스팅
		tch2.setSubject("Android");
		//  → 다운 캐스팅한 타입만큼 멤버를 사용할 수 있다.
		System.out.println(tch2);
		
		//-------------------------------------------------------------------
		// 다운 캐스팅의 조건
		//  - 다운 캐스팅하려는 하위 클래스 타입의 멤버가 인스턴스에 있어야 한다.
		//  → 상위 클래스 타입의 참조 변수는 업 캐스팅된 객체를 참조하고 있어야 한다.
		Person p3 = new Person("이영희", 21);
		System.out.println(p3);
		
		// Student std2 = (Student)p3;
		//  → p3 가 참조하는 인스턴스에는 Student 클래스의 멤버가 없다.
		//  → 다운 캐스팅을 해도 접근할 멤버가 없다. → 캐스팅이 되지 않는다.
		//  → 사람(Person) 을 학생(Student) 또는 선생님(Teacher) 으로 칭할 때는
		//	  해당 특성을 가진 사람만 칭할 수 있다.
		//  → 타입 일치 하지 않을 시 오류 발생 : java.lang.ClassCastException
		//-----------------------------------------------------------------------
		
		Setter.setAge(std1, 16);	// Student 클래스 타입의 객체를 전달
		System.out.println(std1);
		Setter.setAge(tch1, 40);
		System.out.println(tch1);
		
		
		
		
	}
}
