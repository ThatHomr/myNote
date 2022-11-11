#include <stdio.h>

/*
	File Name		: File01_Operator.c
	Data					: 2022.05.28
*/

int main()
{
	// 비트 연산자
	//  - 비트 논리 연산자
	//			: 비트 단위로 논리 연산을 하는 연산자
	//  - 비트 시프트 연산자
	//			: 비트를 왼쪽 또는 오른쪽으로 이동하는 연산자

	// int firstLight = 0;
	// int secondLight = 0;
	// 전등의 상태를 저장하는 변수
	//  - 각 비트 당 하나의 전구 상태를 표현
	//  - 1 : on, 0 : off
	int lightstate = 0b00001011;
	int n;
	// 전등을 관리하기 위한 비트의 최대 값
	const int MASK = 0b11111111;

	// 모든 전등을 on
	lightstate = lightstate | MASK;

	// 모든 전등을 off
	lightstate = lightstate & (~MASK);

	// n 번째 위치한 전등을 on
	n = 3; // 세번째
	lightstate = lightstate | (1 << (n - 1));

	// n 번째 위치한 전등을 off
	lightstate = lightstate & ~(1 << (n - 1));
	
	// n 번째 위치한 전등이 on 이면 off로
	// off 이면 on 으로 변환
	lightstate = lightstate ^ (1 << (n - 1));

	return 0;
}