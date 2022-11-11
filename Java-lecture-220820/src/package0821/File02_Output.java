package package0821;

// 출력(Output)
//  - 프로그램 내부에서 외부로 데이터가 전달
//  - 모니터, 스피커, 파일 저장 등
//  - 표준 출력 : System.out
//  - 기본 출력 매서드 	: System.out.println()
//						: sysout + 자동완성	
//  - 그 외 출력 메서드
//		- System.out.print(출력할 데이터)
//		- System.out.printf(문자열 서식, 서식지정자에 대입할 데이터)
//			→ C 언어의 printf() 함수와 동일한 기능
public class File02_Output {
	public static void main(String[] args) {
		System.out.println("Hello World!");	// print + line(개행)
		System.out.print("Hello Java!");	// 개행을 하지 않는다.
		System.out.println(2000);
		
		// 문자열 서식(String format)
		//  - 형식화된 문자열된 문자열을 통해 하나의 문자열을 표현
		//  - 문자열 서식 내에 데이터가 대입될 자리를
		//    서식 지정자를 통해 지정한다.
		//  - 서식 지정자는 대입될 데이터에 따라 타입을 명시
		//		%d : decimal(10진수)
		//		%s : string(문자열)
		//		%f : floating-point (실수)
		//		%x : hexa decimal(16진수)
		int value = 100;
		System.out.println("value : " + value);
		
		int value2 = 200;
		System.out.println("value : " + value2);
		
		System.out.printf("value : %d\n", value);
		System.out.printf("value : %d\n", value2);
		
		System.out.println("value1 : " + value + ", value2 : " + value2);
		System.out.printf("value1 : %d, value2 : %d\n", value, value2);
		
		// 서식 지정자의 구조
		//  %[플래그][길이][.정확도]자료형
		System.out.println("|1234567890|");
		System.out.printf("|%d|\n", value);
		System.out.printf("|%10d|\n", value); // 최소 길이, 기본적으로 오른쪽 정렬
		System.out.printf("|%-10d|\n", value); // 왼쪽 정렬
		System.out.printf("|%+10d|\n", value); // 양수(+), 음수(-) 부호 표시
		System.out.printf("|%010d|\n", value); // 빈 공백을 0 으로 출력한다.
		
		double pi = 3.141592;
		System.out.printf("|%f|\n", pi);
		System.out.printf("|%10f|\n", pi);
		System.out.printf("|%10.3f|\n", pi); // 소수 3째자리까지 출력
		
		// String 클래스의 fornat 매서드
		//  문자열 서식을 통해 문자열을 만드는 기능
		String strPI = String.format("|%10.2f|", pi);
		
		System.out.println(strPI);
	}
}
