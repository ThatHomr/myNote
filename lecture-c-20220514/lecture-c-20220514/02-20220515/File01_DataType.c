

#include <stdio.h>

// 프로그램의 시작 함수인 main 함수 작성
int main()
{

	// 데이터(Data)
	//  - 프로그램에서 다루는 값
	//  - 사용자로부터 입력을 받거나, 연산/처리된 값들을 의미
	//  - 실생활에서 문자와 숫자가 구분 되듯이
	//    프로그램 내에서도 데이터의 구분이 되어야한다.
	//		→데이터의 종류마다 저장되는 방식, 사용되는 방식 등이 다르다.
	//  - 데이터의 종류들을 표현하기 위한 것이 '자료형(Data Type)' 이다.
	
	// 자료형의 종류
	//  - chr	: 문자(character), 정수
	//  - int	: 정수(integer)
	//  - double: 실수(floating point)
	//	  → 상황에 따라 자료형 앞에 'unsigned' 를 붙이면
	//		부호가 없는 수를 의미하며 0 이상의 수만 표현이 되어진다.
	// --------------------------------------------------------------------------
	
	// 정수형(Integer)
	//  - 소수점이 없는 숫자 형태의 데이터
	//  - 데이터의 크기에 따라 다양한 타입으로 구분이 된다.
	//  - CPU가 정수형을 기본적으로 다룰 때는 'int'형으로 사용된다.
	//  - long 타입은 int 형과 같이 4byte 크기를 가지며,
	//	  크기가 고정이다.
	//  - 10진수 뿐만 아니라 2진수, 8진수, 16진수로도 표현이 가능하다.
	//		10진법(decimal)      : 0 ~ 9 를 사용         : 150123
	//	   	 2진법(binary)       : 0, 1 을 사용		     : 0b101011
	//		 8진법(octal)        : 0 ~ 7 을 사용  	     : 0175 
	//		16진법(hexa decimal) : 0 ~ 9, a ~ f 를 사용  : 0xAF25
	// 
	// 실수형(floating point)
	//  - 소수점이 있는 숫자 형태의 데이터
	//  - 소수점의 오차범위 또는 크기에 따라 종류가 구분 된다.
	//  - CPU 가 실수형을 기본적으로 다룰 때 double 형을 사용한다.
	//  - 소수점 표기 뿐만 아니라 지수 표기법도 가능하다.
	//		소수점 표기 : 1.13, 3.141592
	//		지수 표기법 : 1.2e-7f, 1.534+5f
	
	// 문자형(Character)
	//  - 단 하나의 문자를 표현하기 위한 데이터, 1byte의 크기를 가진다.
	//  - 문자로 표현할 때는 작은따옴표('')로 문자 데이터임을 표현
	//  - 데이터 자체는 정수형으로 저장이 된다.
	//		→ ASCII 코드에 의해 정수 값과 대응되는 문자로 표현된다.
	//		'A' => 65, 'a' => 97, '0' => 48
	//  - 문자로 표현하기 힘든 기능, 문자를 표시하기 위한 문자
	//		: 제어 문자(Escape Character)
	//      
	//  
	// printf("%d", 101412);
	// 
	// 프로그램을 정상적으로 종료
	return 0;
}