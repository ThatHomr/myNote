package package1023;

import java.io.IOException;

public class File01_throw_throws {
	// 예외 관련 구문
	//  - try-catch : 예외 처리
	//  - throws 	: 예외 전달
	//  - throw		: 예외 발생
	
	// 예외 전달
	//  - 메서드에서 예외가 발생했을 때 호출한 메서드한테
	//	  예외를 전달하여 예외 처리를 넘긴다.
	//  - 예외 전달하는 방법
	//		1. 우선 메서드가 어떤 예외를 전달할 것인지 정의
	//		2. 메서드의 선언부 마지막에 throws 키워드를 작성
	//		3. throws 키워드 다음 전달하고자하는 예외를 작성
	//  - 장점
	//      1. 메서드 선언부에 처리할 예외를 선언함으로써
	//		   메서드에서 발생 가능한 예외를 알 수 있다.
	//			→ 개발자가 처리해야할 예외를 알 수 있다.
	//		2. 보통 RuntimeException 을 제외한 예외를 선언하면
	//		   반드시 예외 처리를 하도록 강제성을 띄운다.
	//		3. 각 메서드에서 동일하게 처리할 예외 처리를
	//		   한 메서드 내에서 한 번에 처리할 수 있다.
	
	public static void methodA() throws IOException, ArithmeticException  {
		System.out.println(10 / 1);
	}
	public static void methodB() throws IOException, ArithmeticException  {
		System.out.println(10 % 0);
	}
	
	// 예외 발생
	//  - 개발자의 의도하에 강제로 예외를 발생시킨다.
	//  - 프로그램 상의 예외가 아닌 사용자가 의도치 않은 행동을 하거나
	//    예외와 같은 처리를 하고자 할 때 강제로 예외를 발생시킨다.
	//  - 나누기를 할 때 0 은 나눌 수 없는 수이며,
	//	  음수 일 때 도 0 일 때랑 동일하게 처리하고 싶다!.
	
	public static void methodC() throws IOException {
		int n = -10;
		
		// 음수인 경우 ArithmeticException 을 강제로 발생
		if (n < 0)
			// 생성자를 통해 예외 객체에 저장할 메시지를 저장할 수 있다.
			throw new ArithmeticException("/ by " + n);
			
		System.out.println(10 % n);
	}
	
	
	public static void main(String[] args) {
		// methodA() 메서드에서 전달한 예외를 예외 처리해야한다.
		// → 특정 예외는 반드시 예외 처리를 해야한다.
		try {
			
			// methodA();
			// methodB();
			methodC();
		} catch (ArithmeticException e) {
			
			System.out.println(" 0 으로 나눌 수 없습니다 : " + e.getMessage());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
