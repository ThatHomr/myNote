package package1023;

import java.util.Objects;

class SimpleA {
	int data;
	
	// 추가된 필드
	int n1;
	int n2;
	
	SimpleA(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Object 객체를 매개변수로 받기 때문에
		// 제대로 구분하여 비교할 수 있도록 해야한다.
		
		if(obj == null) return false;
		if(this == obj) return true;
		if(!(obj instanceof SimpleA)) return false;
		
		SimpleA other = (SimpleA) obj;
		
		// 비교하고자하는 필드를 비교
		if(this.data != other.data) return false;
		if(this.n1 != other.n1) return false;
		if(this.n2 != other.n2) return false; 
		
		// 위의 조건이 모두 false 이면
		// 모든 필드가 동일하기 때문에 true 로 반환
		return true;
	}
	
	@Override
	public int hashCode() {
		// return super.hashCode();
		
		return Objects.hash(data, n1, n2);
	}
	
	@Override
	public String toString() {
		return "data = " + data;
	}
	
}
public class File02_Object {
	public static void main(String[] args) {
		SimpleA a1 = new SimpleA(10);
		SimpleA a2 = new SimpleA(10);
		
		// == 연산자 : 두 피 연산자의 값이 같은지 비교
		//  참조 변수들은 참조하는 객체의 메모리 주소를 가지며
		//  두 변수의 메모리 주소는 다르기 때문에 false
		if(a1 == a2) System.out.println("같은 객체입니다.");
		else System.out.println("다른 객체입니다.");
		
		
		// equals() 메서드 : 같은 객체인지 비교하는 메서드
		//  기본적으로 같은 인스턴스인지 비교
		//  같은 필드인지 비교하려면 오버라이딩을 통해
		//  직접 구현해야한다.
		if(a1.equals(a2)) System.out.println("같은 객체입니다.");
		else System.out.println("다른 객체입니다.");
		
		if(a1.equals("Hello")) System.out.println("같은 객체입니다.");
		else System.out.println("다른 객체입니다.");
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a2));
		System.out.println("a1 : " + a1);
		// System.out.println("a1 : " + a1.toString());
		
	}
}
























