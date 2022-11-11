#include <stdio.h>

/*
	File Name		: File02_casting.c
	Data					: 2022.05.21
*/

int main()
{
	// 자료 형 변환
	//  기본 자료형의 타입이 변환되는 것을 의미
	//  컴파일러는 연산자에 의해 연산되는 피 연산자의 타입이
	//  다르면 하나의 타입으로 변환을 시킨다.

	// - 암시적 형 변환(자동 형 변환)
	//		컴파일러가 알아서 변환을 시켜주는 형 변환
	//		정수형에서 실수형으로 변환하는 경우
	//		메모리의 크기가 작은 타입에서 큰 타입으로 변환하는 경우
	// - 명시적 형 변환(강제 형 변환)
	//		컴파일러가 변환을 해주지 않아 개발자가 강제로 변환시키는 형 변환
	//		실수형에서 정수형으로 변환해야하는 경우
	//		메모리의 크기가 큰 타입에서 작은 타입으로 변환해야하는 경우
	//		두 타입이 같은 상환에서 다른 타입을 변환해야하는 경우
	//		표현식 : (자료형)데이터
	//-------------------------------------------------------------------------

	double number = 10;     // 10.0으로 변환
	int number2 = 5.4321;   // 5로 변환    / Compile WARNING!
	short number3 = 70000;  // 4464로 변환 / Compile WARNING!

	printf("number = %.2f\n", number);
	printf("number2 = %d\n", number2);
	printf("number3 = %d\n", number3);

	int number4 = (int)5.4321;       // 정수형으로 강제 형 변환
	short number5 = (short)70000;    // short 형으로 강제 형 변환

	// 두 타입이 같은 경우 다른 타입으로 자동으로 변환되지 않는다.
	// ex) 평균
	// 두 개의 점수
	int score1 = 91, score2 = 80;
	// 평균
	// double avg = (score1 + score2) / 2;
	// double avg = (91 + 80) / 2;
	// double avg = (171) / 2;
	// double avg = 85; → 연산자의 결과 값은 피 연산자들의 타입과 일치한다.
	// double avg = 85.0; → 좌측 피 연산자와 타입을 맞추기 위해 실수형으로 변환
	double avg = (double)(score1 + score2) / 2;
	// double avg = (double)(91 + 80) / 2;
	// double avg = (double)(171) / 2;
	// double avg = 171.0 / 2;
	// double avg = 171.0 / 2.0; → 타입이 일치하지 않아 컴파일러가 자동 형 변환
	// double avg = 85.5;

	// %~ : 서식지정자
	//  f  : 실수형
	// .2  : 소수 둘 째 자리
	// →  : 실수형 뎅터를 소수 둘 째 자리까지 출력하기 위한 서식 지정자
	printf("avg = %.2f\n", avg);

	return 0;
}

