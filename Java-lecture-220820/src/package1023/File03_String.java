package package1023;

public class File03_String {
	public static void main(String[] args) {
		// 문자열(String)
		//  - C 언어 같은 경우 문자열을 char 형 배열로 다루지만
		//    객체지향언어에서는 String 클래스로 다룬다.
		//  - Java 의 String 클래스 내에 문자열을 저장하기 위한
		//	  char[] 형인 배열 변수가 있으며, 생성자를 통해 저장
		//  - String 클래스의 객체는 '불변 객체(Immutable)'이기 때문에
		//	  인스턴스에 저장된 문자열은 변경할 수 없다.
		//  - 문자열 리터럴은 클래스가 메모리에 로드될 때 생성
		//	  → JVM 내 '상수 저장소(Constant Pool)' 에 저장
		
		String s1 = "Hello";
		// 문자열 리터럴은 상수 저장소에 저장되며,
		// 같은 문자열 리터럴이 만들어지지 않는다.
		String s2 = "Hello";
		// 이미 상수 저장소에 저장된 문자열 리터럴이기 때문에
		// 저장되어있던 문자열 리터럴을 그대로 사용
		
		if(s1 == s2) System.out.println("같은 문자열입니다.");
		else System.out.println("다른 문자열입니다.");
		
		// 힙 영역에 String 클래스의 객체를 생성
		String s3 = new String("Hello");
		if(s1 == s3) System.out.println("같은 문자열입니다.");
		else System.out.println("다른 문자열입니다.");
		
		// String 클래스에서는 equals() 메서드를 오버라이딩하여
		// 재정의를 해놨다.
		if(s1.equals(s3)) System.out.println("같은 문자열입니다.");
		else System.out.println("다른 문자열입니다.");
		//-------------------------------------------------------------
		
		// compareTo : 문자열을 사전순으로 비교하기 위한 메서드
		String s4 = "egg";
		String s5 = "canndy";
		
		System.out.println(s4.compareTo(s5));
		
		// concat : 문자열을 이어붙여 반환하기 위한 메서드
		String s6 = s4.concat(" + " + s4);	// 붙여진 문자열을 반환
		System.out.println(s4);	//egg
		System.out.println(s6);
		
		// replace :  문자열 내의 일부 문자열을 다른 문자열로
		//			  수정하기 위한 메서드
		String s7 = s6.replace("egg", "apple");
		System.out.println(s6);
		System.out.println(s7);
		
		// split : 문자열을 분환하여 문자열 배열로 반환하는 메서드
		String phone = "010-1234-1234";
		String[] phones = phone.split("-");
		for (int i = 0; i < phones.length; i++) {
			System.out.println("[" + i + "] = " + phones[i]);
		}
		
		// contains() : ()내의 문자열이 포함되어 있는지 검사
		
		// charAt : n 번째 문자를 반환
		char c = s7.charAt(2);
		System.out.println("s7[] = " + c);
		for (int i = 0; i < s7.length(); i++) {
			System.out.println("s7[" + "] = " + s7.charAt(i));
		}
		
		// indexOf : 지정된 문자 또는 문자열의 위치를 반환
		int index = s7.indexOf("candy");
		System.out.println("candy in s7 → " + index);
		
		// isEmpty : 빈 문자열인지 검사
		System.out.println(s7.isEmpty());
		
	}
}
