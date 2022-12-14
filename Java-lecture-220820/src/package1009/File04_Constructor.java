package package1009;

// 상속 관계에서의 생성자(Constructor)
//	- 상속 관계의 모든 클래스의 생성자는 실행
//		- 서브 클래스, 슈퍼 클래스의 생성자가 실행
//  - 상속 관계에서의 생성자 호출
//		- 서브 클래스부터 호출이 되어지며
//		  서브 클래스의 생성자가 슈퍼 클래스의 생성자를 바로 호출
//	- 상속 관계에서의 생성자 실행
//		- 슈퍼 클래스의 생성자가 실행하며 초기화가 끝난 다음
//		  서브 클래스의 생성자가 실행된다.

//  - 서브 클래스의 생성자는 기본적으로 
//	  슈퍼 클래스의 기본 생성자를 호출한다. 
//		→ 만약 기본 생성자가 없으면 오류가 발생

//  - 기본적인 원칙
//		필드가 선언된 클래스에서 설정/반환!
//      초기화 역시 선언된 클래스에서 하자!
//  → 슈퍼클래스의 멤버는 슈퍼 클래스의 생성자를 통해 진행
//	→ super() 생성자를 통해 슈퍼 클래스의 생성자를 호출
//	   → super() 생성자를 작성하지 않으면 컴파일러가 
//		 맨 첫 줄에 추가시킨다.
//     → super() 생성자도 반드시 첫 줄에 작성되어야하기 때문에
//		 this() 생성자와 같이 작성될 수 없다.

// super 레퍼런스
//  - 자신의 인스턴스 영역 중 슈퍼 클래스의 영역을 참조
//  - 멤버의 이름이 같은 경우 서브 클래스의 멤버가
//	  우선 순위가 높기 때문에 슈퍼 클래스의 멤버에 접근할 수 없다.
//	- 이때, 슈퍼 클래스의 멤버에 접근하기 위한 레퍼런스
 
public class File04_Constructor {
	public static void main(String[] args) {
		NamedPosition np1 = new NamedPosition("P1", 10, 20);
		
		System.out.println(np1);
		
	}
}












