package package0904;

public class File01_LoopStatement {
	public static void main(String[] args) {
		// 반복문(Loop Statement)
		//  - 코드를 반복 수행하기 위한 제어문
		//  - 주어진 조건을 만족하는 동안 코드를 수행한다.
		//  - 대부분의 반복문은 조건식을 포함하고 있다.
		//  - 종류
		//		while 문
		//		  : 특정 조건을 만족하는 동안 반복 수행
		//		do while 문
		//		  : 특정 조건을 만족하는 동안 반복 수행, 최소 1 번
		//		for 문
		//		  : 특정 횟수, 범위를 다룰 때 
		//		for each 문
		//		  : 배열, 컬렉션을 순차 탐색하며 반복 수행
		//---------------------------------------------------------
		System.out.println("Start!");

		// "Hello World!" 를 다섯번 출력
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		// → 중복된 코드가 작성된다. 
		// → 원하는 수만큼 동작시킬 수 없다.
		
		System.out.println("End!");
		
		System.out.println("while 문");
		// while 문
		//  : ~ 동안
		//  : 특정 조건을 만족하는 동안 반복 수행하는 반복문
		//  : while 문은 조건식만 지정된다. 구조는 if 와 동일
		//  : 코드가 끝난 다음 조건식을 다시 검사한다.
		
		// while 문을 이용하여 
		// "Hello World!"를 다섯 번 출력 
		
		// 카운팅
		int count = 0;
		
		while(count < 5 /*다섯 번을 출력했는가?*/) { 
			System.out.println(count + " : Hello World!");
			
			// 출력이 되었으니 1 증가
			count++;
		}
		
		System.out.println("do while 문");
		// do-while 문
		//  - while 문처럼 조건에 의해 수행되는 반복문
		//  - 단, 무조건 최소 한 번은 수행된다.
		//		while    : 선 검사, 후 실행
		//		do-while : 선 실행, 후 검사
		
		// do-while 문을 이용하여
		// "Hello World!" 를 다섯번 출력
		count = 0;
		
		do {
			System.out.println("Hello World!");
			count++;
		}while(count < 5);
		
		System.out.println("for 문");
		// for 문
		//  - 특정 횟수, 범위를 다룰 때 사용되는 반복문
		//  - 반복문에 필요한 변수 선언과 증감식을 작성할 수 있다.
		//  - 구조는 제어문 중에서는 제일 복잡하지만
		//    직관적이라서 이해하는데는 어렵지않다.
		//  - for문의 구조
		//		초기식
		//			: 반복문에서 사용할 변수를 선언 및 초기화
		//		조건식
		//			: 반복 수행하기 위한 조건
		//		반복 후 처리 
		//			: 반복 수행이 끝난 다음 수행할 명령어
		
		// for 문을 이용하여
		// "Hello World!"를 다섯번 출력
		for(int count2=0; count2 < 5; count2++) {
			// count2 의 값이 0 부터 5가 될 때 까지 1씩 증가하는 반복문
			System.out.println(count2 + " : Hello World!");
		} // 블록이 끝난 다음 '반복 후 처리' 로 넘어간다.
		
	}
}
