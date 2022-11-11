package package0827;

public class File02_Operator {
	public static void main(String[] args) {
		// 연산자(Operator)
		//  - 연산 : 주어진 식을 계산하여 결과를 얻어내는 과정
		//  - 연산자 : 연산을 하기 위한 문자(기호)
		
		//------------------------------------------------------------------------------
		// 형 변환
		//  컴파일러는 연산자의 피 연산자 타입을 일치시키기 때문에
		//  일치하지 않으면 타입을 변환시키거나 오류를 발생시킨다.
		
		//  자동 형 변환
		//		컴파일러가 피 연산자의 타입이 일치하지 않은 경우
		//		알아서 데이터의 타입을 변환한다.
		//			크기가 작은 타입 → 크기가 큰 타입
		//			정수 → 실수
		long a = 100;	// int 형 데이터가 long 타입의 변수에 저장
		// byte b = a;		// long 타입의 데이터가 byte 타입의 변수에 저장, ERROR
		
		//  강제 형 변환
		//		개발자가 필요에 의해 강제로 변환해야하는 경우
		//		변환해야할 데이터 앞에 소괄호와 함께 데이터 타입을 명시
		//		  ※ 데이터의 손실이 발생할 수 있다.
		byte b = (byte)a;
		
		// double c = (double)10 / 7;
		// double c = (double)(1);
		// double c = 1.0;
		double c = (double)10 / 7;
		// double c = 10.0 / 7; // ← 강제 형 변환에 의해 10.0으로 변환
		// double c = 10.0 / 7.0; // ← 자동 형 변환에 의해 7.0으로 변환
		
		System.out.println("c : " + c);
		//-----------------------------------------------------------------------------
		// 산술 연산자
		//  - 사칙연산과 관련된 연산자
		//		덧셈 뺄셈 곱셈 나눗셈 추가적으로 나머지 연산
		//  - 나눗셈과 나머지 연산
		//		- 배수를 검사
		//			n의 배수 : n, n*2, n*3 ....
		//					 : n 으로 나누어 떨어지는 수
		//					 : n 으로 나누었을 때 나머지가 0 인 수
		//		- 그룹 관련 활용
		//			100개의 데이터가 있을 때 이를 7그룹으로 나눌 때
		//			각 그룹에 몇개의 데이터가 포함되고,
		//			그룹에 포함되지 않는 데이터의 수를 구할 수 있다.
		//				각 그룹의 데이터의 수 : 100 / 7
		//				그룹에 포함되지 않는 데이터의 수 : 100 % 7
		//				n 번째 데이터의 그룹 : n % 7
		//		- 단위 변환
		//			kg ↔ g, byte ↔ kb, 숫자 분할
		
		int num1 = 21112313;
		System.out.println(num1 % 3);
		// = 2
		// = 나머지가 0이 아니기 때문에 3의 배수가 아니다.
		
		int num2 = 53;
		// 십의 자리
		int twoDigit = num2 / 10;
		// 일의 자리
		int oneDigit = num2 % 10;
		System.out.println(num2 + "의 일의 자리 : " + oneDigit);
		System.out.println(num2 + "의 십의 자리 : " + twoDigit);
		
		
		
	}
}
