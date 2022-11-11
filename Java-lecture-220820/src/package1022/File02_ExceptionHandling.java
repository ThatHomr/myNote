package package1022;

import java.net.Socket;
import java.util.Scanner;

public class File02_ExceptionHandling {
	public static void main(String[] args) {
		// 예외 처리(Exception Handling)
		
		//  프로그램 오류
		//		오류 : 프로그램 실행 중 어떠한 원인에 의해 오동작을 하거나
		//			   비 정상적으로 종료를 하게하는 원인
		//			 : 에러(Error) 라고도 한다.
		//		에러는 크게 3가지로 나눌 수 있다.
		//			- 컴파일 에러(Compile-time Error)
		//				컴파일 단계에서 발생하는 에러
		//				오타, 잘못된 구문, 잘못된 타입 변환 등
		//			- 런타임 에러(Runtime Error)
		//				실행 도중에 발생하는 에러
		//				인덱스 범위 초과, 나누기 0, 입력 값 타입 불일치 등....
		//			- 논리적 에러(Logical Error)
		//				개발자의 의도와 다르게 동작하는 경우
		
		// 에러 검사 순서
		//  1. 소스 코드(.Java)를 컴파일러가 컴파일을 하면서 
		//	   오타, 구문, 자료형 체크 등의 검사를 수행
		//		→ 에러가 없으면 바이트 파일(.class)을 생성
		//		→ 에러가 있으면 에러가 발생한 부분을 알려준다.
		//  2. 바이트 파일을 JVM 이 로드하면서 프로그램을 실행하다가
		//	   배열의 잘못된 인덱스 접근, 잘못된 연산 등의 에러가 발생
		//		→ 예외 처리를 통해 대처를 해야한다.
		//  3. 프로그램을 실행하면서 원하는 값이 제대로 저장, 유지되는지 확인
		//		→ 다수의 데이터를 통해 테스트
		
		// 자바에서 런타임 에러는 두 가지로 분류
		//  - 에러(Error)
		//		프로그램 코드로 수습될 수 없는 심각한 오류
		//  - 예외(Exception)
		//		프로그램 코드로 수습될 수 있는 미약한 오류
		
		// 예외 처리
		//  - 프로그램 실행 시 발생할 수 있는 예외 발생에 대비할 코드를 작성하는 것
		//  - 목적
		//		예외가 발생하더라도 비 정상적인 종료를 막고
		//		개발자가 원하는 형태로 대처하고 프로그램을 유지
		//  - 예외 처리를 하지 않으면, JVM 내의 예외 처리기(UncaughtExceptionHandler)
		//	  발생한 예외의 원인과 발생지를 화면에 출력해준다.
		
		// 예외 처리 방법
		//  1. try-catch 문
		//  2. try-with-resource 문
		
		//  + finally 문
		//		- try-catch 문과 try-with-resource 문의 마지막에 작성되는 구문
		//		- 예외 발생 여부 상관 없이 실행해야할 코드를 포함시킬 때 사용
		//		- try 문 또는 catch 문 내에서 return 을 통해 메서드가 종료될 경우
		//		  종료하기 전에 수행할 코드가 있다면 해당 코드를 작성한다.
		//		- 주 역할 
		//			: try 에서 사용한 스트림(System.in, Buffer, File, Socket...)을 종료
		//
		
		// try-with-resource 문
		//   - JDK1.7 이후 추가된 예외 처리 방법
		//   - 기존의 예외 처리에서 처리했던 할당 받은 자원의 해제를
		//   - 별도의 코드 없이 처리될 수 있도록 도와준다.
		//  구조
		//	 try(할당받은 자원 생성) {
		//	 } catch(... ) { ... }
		
		// System.out.println(10/0);
		
		// Scanner input = new Scanner(System.in);
		try( Scanner input = new Scanner(System.in);
				Socket socket = new Socket() ) {
			// 예외가 발생가능한 코드를 작성하는 블록
			
			// try 구문이 예외 발생 여부 상관없이 끝나게되면
			// 할당 받은 자원들은 자동으로 해제된다.
			
			System.out.println("Enter an integer >>> ");
			int n = input.nextInt();
			
			// 예외 발생
			//  예외 발생 시 catch 구문으로 넘어가며
			//  되돌아오지 않는다.
			System.out.println(10/0);
			
			
			
			return;
		} catch (ArithmeticException e) {
			// 예외가 발생했을 때 처리할 코드를 작성하는 블록
			System.out.println("프로그램 예외 발생! / 연산 오류");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 예외 발생! / 인덱스 범위 오류");
		} catch (Exception e) {	// 모든 예외의 상위 클래스
			// 예외 출력
			//  e.getMessage()		: 예외 클래스의 인터페이스에 저장된 메시지를 반환
			//						: 주로 원인이 되는 내용을 문자열로 반환
			//  e.printStackTrace()	: 예외 발생 당시의 호출 스택(call stack)에 있던
			//						  메서드들의 정보를 화면에 출력
			
		} finally {
			// 예외 발생 여부 상관 없이 메서드 종료하기 전에는 무조건 실행된다. 
			System.out.println("프로그램 종료");
			// input.close();
		}
		
		
		
		
	}
}
