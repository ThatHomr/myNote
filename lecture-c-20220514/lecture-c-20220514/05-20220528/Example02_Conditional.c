#include <stdio.h>

/*
	File Name		: Example02_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	int num = 21;

	// num 의 값이 짝수이면 "num is even number!" 를 출력하고
	// 그렇지 않으면 "num is odd number!" 를 출력하는
	// 조건문을 작성

	if ((num % 2) == 0)   // 짝수일때
		printf("num is even number!\n");

	else                          // 홀수일때
		printf("num is odd number!\n");
	//-------------------------------------------------
	if (num % 2)   // 정수 값이 0이 아니면 참
		printf("num is odd number!\n");
	else                         
		printf("num is even number!\n");

	return 0;
}