#include <stdio.h>

/*
	File Name		: Example05_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	// num 의 값이 3의 배수이거나 7의 배수이면
	//		"Wonderful day" 를 출력하고
	// 그렇지 않으면
	//		"Beautiful day!" 를 출력하도록 작성
	int num = 9;

	if (!((num % 3) || !(num % 7)))                 // 참일 경우 num 이 3의 배수이거나 7의 배수이다.
		printf("Wonderful day!\n");
	else                                          
		printf("Beautiful day!\n");
	
	//---------------------------------

	if ((num % 3 == 0) || (num % 7 == 0))      // 참일 경우 num 이 3의 배수이거나 7의 배수이다.
		printf("Wonderful day!\n");
	else
		printf("Beautiful day!\n");

	//---------------------------------
	// 드모르간의 법칙에 의해 아래와 같이
	// 조건식을 작성할 수 있다.
	if (!((num % 3) && (num % 7)))                 // 참일 경우 num 이 3의 배수이거나 7의 배수이다.
		printf("Wonderful day!\n");
	else
		printf("Beautiful day!\n");

	return 0;
}