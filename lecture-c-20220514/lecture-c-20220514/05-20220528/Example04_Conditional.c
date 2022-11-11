#include <stdio.h>

/*
	File Name		: Example04_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	int num = 78;

	// num 의 값이 7의 배수이면
	//   "num is multiple of 7!" 을 출력하고
	// 그렇지 않으면
	//   "num is not multiple of 7!" 을 출력하다를 작성

	if (num % 7)                        // 참인 경우 7의 배수이다.
		printf("num is not multiple of 7!\n");
	else                                     
		printf("num is multiple of 7!\n");

	//-----------------------------------------------

	if (num % 7 == 0)                // 참인 경우 7의 배수가 아니다.
		printf("num is multiple of 7!\n");
	else                                     
		printf("num is not multiple of 7!\n");

	//-----------------------------------------------

	if ( !(num % 7))                // 참인 경우 7의 배수이다.
		printf("num is multiple of 7!\n");
	else
		printf("num is not multiple of 7!\n");

	//-----------------------------------------------

	return 0;
}