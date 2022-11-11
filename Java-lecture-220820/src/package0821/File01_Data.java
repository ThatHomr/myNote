package package0821;


// 데이터(Data)
//  - 프로그램에서 다루는 값

// 자료형(Data Type)
//  - 프로그램에서 다루는 데이터의 종류
//  - 정수, 실수, 문자, 문자열 논리 등이 있다.
//  - 실 생활에서 숫자와 문자를 구분하여 사용하듯
//    프로그램 내에서도 다양한 형태의 데이터들이 다뤄지며
//    이를 구분하기 위해 여러 타입들이 정의되어있다.

// 자료형의 종류
//  - boolean	: 논리형 데이터(true, false)
//  - char		: 문자형 데이터(아스키코드, 유니코드)
//  - byte		: 정수형 데이터(1byte)
//  - short		: 정수형 데이터(2byte)
//  - int		: 정수형 데이터(4byte, -21억 ~ 21억 정도), 기본 정수 타입
//  - long		: 정수형 데이터(8byte)
//  - float		: 실수형 데이터(4byte, 소수점 7자리)
//  - double	: 실수형 데이터(8byte, 소수점 16 자리), 기본 실수 타입

// 문자열같은 경우는 기본 자료형이 아닌 String 클래스 타입이다.

// 기본 자료형외의 타입 : 참조 타입
//  - new 연산자를 통해 메모리를 동적으로 할당 받는 데이터 타입
//  - 배열, 객체, 인터페이스 객체

// 변수(Variable) = 변할수 있는 수
//  - 프로그램에서 데이터를 다루기 위한 가장 기본적인 수단
//  - 데이터를 저장하고 사용하기 위한 수단
//		→ 프로그램은 스스로 데이터를 저장하지 않기 때문에
//		  입력/연산/처리 된 데이터들을 지운다.
//		→ 이러한 데이터들을 유지하려면 별도의 저장 공간에 저장하여
//		  유지를 해야한다. → 이때 저장되는 저장 공간이 메모리 공간
//		→ 개발자가 데이터를 저장하고, 이를 다시 사용하기 위해
//		  저장 공간에 식별자를 부여한다.
//	→ 변수 = 식별자가 부여된 저장 공간

// 변수가 필요한 이유
//  - 연산/입력된 데이터를 유지
//  - 데이터를 재사용
//  - 사용되는 데이터의 용도/목적

// 변수를 사용하기 위한 방법
//  1. 변수 선언
//		- 데이터를 저장할 저장 공간을 만들고 식별자를 부여하는 단계
//		- 식별자는 저장될 데이터의 용도/목적에 맞게 명명
//		- type identifier;
//  2. 데이터 대입(저장)
//		- 선언된 변수에 데이터를 저장하기 위한 단계
//		- 대입 연산자(=)를 통해 변수에 데이터 또는 표현식의 결과 값을 저장
//		- variable = value;
//  3. 변수 초기화
//		- 변수 선언과 동시에 데이터를 대입하는 단계
//		- type identifier = value;
//  4. 변수 사용
//		- 변수의 식별자를 작성하면, 변수에 저장된 값을 불러온다.

public class File01_Data {
	public static void main(String[] args) {
		
		// boolean 타입
		System.out.println(true); 	// 참
		System.out.println(false);	// 거짓
		
		// char 타입
		System.out.println('A');	// 문자
		
		// int 타입
		System.out.println(100);	// 정수
		
		// double 타입
		System.out.println(3.141592);	// 실수
		
		// String 클래스 타입
		//  문자열은 더하기 연산을 지원하며
		//  다른 타입의 데이터들과 하나의 문자열로 만들어진다.
		System.out.println("Hello");	// 문자열
		System.out.println("Hello" + "World!");
		// = System.out.println("Hello World!");
		System.out.println("Data : " + 0);
		// = System.out.println("Data : 0");
		
		
		//----------------------------------------------------------
		System.out.println("-------------------------------");
		System.out.println("width  : " + 20);
		System.out.println("height : " + 5);
		System.out.println("area   : " + (20 * 5));
		
		System.out.println("-------------------------------");
		// 너비를 저장하기 위한 int 변수 width 선언
		int width;
		
		// 변수 width 에 20 을 대입
		width = 20;
		
		// 높이를 저장하기 위한 int 형 변수 height 를 선언하고 5를 대입
		int height = 5;
		
		// 넓이를 저장하기 위한 int 형 변수 area 를 선언하고
		// 너비와 높이를 곱한 값을 대입
		int area = width * height;
		// int area = 20 * 5;
		// int area = 100;
		// 곱하기 연산을 하기 전에 변수에 저장된 값을 먼저 불러온다.
		// 불러온 값을 곱하기 연산을 통해 값을 구하고 area 변수에 저장
		
		System.out.println("width  : " + width);
		// = System.out.println("width  : " + 20);
		// = System.out.println("width  : 20");
		System.out.println("height : " + height);
		System.out.println("area   : " + area);
		
		// 변수는 '변할 수 있는 수' 이기 때문에
		// 다른 값으로 저장을 할 수 있다.
		//  → 다른 값으로 설정하면 이전에 수행된 명령어에는 아무런 영향이 없다.
		//	  즉, 값을 설정한 이후에 수행되는 명령어에만 적용된다.
		//  → 다른 값으로 설정된 변수로 연산된 값을 저장하는 변수가 있다면
		//    해당 변수도 아무런 영향이 없다.
		//    따라서, 넓이와 같이 다른 값으로 설정된 변수로 연산되어야하는 경우
		//	  다시 연산하여 저장해야한다.
		width = 50;
		System.out.println("width  : " + width);
		System.out.println("height : " + height);
		// System.out.println("area   : " + area);
		area = width * height;
		System.out.println("area   : " + area);
		//----------------------------------------------------
		System.out.println("-------------------------------");
		
		// 리터럴(Literal)
		//  - 프로그램에서 연산/입력된 값이 아니라 코드 상으로 직접 입력된 값
		//  - 데이터의 타입에 따라 여러 리터럴이 있다.
		
		// 정수 리터럴
		//  - 10진수, 2진수, 8진수, 16진수 리터럴이 있다.
		//		10 진수 : 0 ~ 9 로 한 자리를 표현하는 진법
		//		2  진수 : 0 ~ 1 로 한 자리를 표현하는 진법
		//		8  진수 : 0 ~ 7 로 한 자리를 표현하는 진법
		//		16 진수 : 0 ~ 9, A ~ F 로 한 자리를 표현하는 진법
		//  - 정수 리터럴은 int 형으로 컴파일되므로 -21억 ~ 21억까지만 작성
		//	  long 으로 변환을 해주기 위해선 리터럴 뒤에 L, l 을 작성
		int red = 245;
		int green = 131;
		int blue = 95;
		// 16진수 리터럴(Hexa decimal)
		int color = 0xf5835f;
		// 8진수 리터럴(Octal)
		int octal = 0377;
		// 2진수 리터럴(Binary)
		int binary = 0b1101110;
		
		long num = 2200000000L; // 22억은 int 형으로 표현할 수 없는 값이기 때문에
								// long 타입으로 변환
		
		// 실수 리터럴
		//  실수 리터럴은 double 형으로 컴파일이며, float 타입의 리터럴을 사용할 경우에는
		//  리터럴 뒤어 F, f 를 작성
		double pi = 3.1415;
		float f1 = 3.14f;
		
		// 문자 리터럴
		//  - 작은 따옴표로 하나의 문자를 표현
		//  - 아스키 코드 = 미국 ANSI에서 표준화된 정보 교환용 부호체계
		//				  = 정수 형태로 표현
		//  - 유니코드    = 세계 대부분의 문자 체계를 표현하기 위한 2byte 부호체계 
		//				  = '\u0000' 와 함께 16진수 4자리로 표현
		//  - 이스케이프 문자(escape character)
		//		문자로 표현할 수 없는 문자들을 표현하기 위한 확장 문자
		//		종류
		//			- \n : 개행 문자(new line)
		//			- \t : 탭 문자(tab)
		//			- \' : 작은 따옴표
		//			- \" : 큰 따옴표
		//			- \\ : 백슬레쉬 또는 원화
		char c1 = 'A';
		System.out.println("c1 = " + c1);
		
		char c2 = 65; // 'A' 의 아스키 코드 = 65, 'a' = 97
		System.out.println("c1 = " + c2);
		
		char c3 = '\uAC00'; // '가' 의 유니코드
		System.out.println("c1 = " + c3);
		
		System.out.println("Hello World! \nHello Java!");
		
		// 논리 리터럴
		//  - 논리 리터럴은 true 와 false 뿐이다.
		
		// 문자열 리터럴
		//  - 다수의 문자를 큰 따옴표("")로 묶어서 표현
		//  - 문자열 리터럴은 String 클래스의 객체로 처리
		
		// null 리터럴
		//  - 참조 타입의 기본 값으로 사용되는 리터럴
		//  - '아무것도 참조하고 있지 않다.' 를 의미
		
		// JDK 7 부터 허용된 리터럴 표기법
		//  - 숫자 리터럴에 '_'를 허용
		//	  컴파일러가 ㅓㅁ파일 할 때 '_'를 빼고 컴파일 한다.
		//  - 단, 허용되지 않는 경우
		//		- 리터럴 끝에는 사용할 수 없다.
		//		- 소수점(.) 앞, 뒤에 사용할 수 없다.
		//		- F, L 앞에 사용할 수 없다. _F, _L X
		//		- 진수 표기하는 문자 사이에 사용할 수 없다.
		int money = 1_000_000;
		
		// 상수(constant) = 변하지 않는 수
		//  - final 키워드를 사용하여 변수를 초기화
		//  - 초기화 이후 값을 변경할 수 없다.
		//  - 프로그램이 끝날 때 까지 값이 바뀌어선 안되는 경우에 사용
		//  - 상수의 식별자는 모든 문자를 대문자로 작성하며
		//	  두 단어 이상인 경우에는 단어 사이에 '_' 를 작성
		final double PI = 3.141592;
		
		// PI = 3.14; ERROR!
		
		// YES 를 표현하는 데이터 1
		final int YES = 1;
		// NO 를 표현하는 데이터 0
		final int NO = 0;
		// CANCEL 를 표현하는 데이터 -1
		final int CANCEL = -1;
		
		// SEND 를 표현하는 데이터 1
		final int SEND = 1;
		// RECV 를 표현하는 데이터 0
		final int RECV = 0;
		
	}
}
