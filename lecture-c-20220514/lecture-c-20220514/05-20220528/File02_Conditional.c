#include <stdio.h>

/*
	File Name		: File02_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	// 조건 문 (Conditional Statement)
	//  - 특정 조건에 따라 수행되는 코드를 결정하는 제어문
	
	int num = 0;

	//--------------------------------------------
	// 1. 단순 if 문
	//		- 조건을 만족하는 경우에 코드를 수행
	num = 7;
	num = 17;
	// 만약 num 의 값이 10보다 크면
	//		"num is bigger than 10!" 을 출력
	if (num > 10)
		printf("num is bigger than 10!\n");
	//--------------------------------------------
	printf("-------------------------\n");
	
	// 2. if - else 문
	//		- 조건의 결과에 따라 코드를 수행
	num = 17;
	// 만약 num 의 값이 10보다 크면
	//		"num is bigger than 10!" 을 출력
	// 그렇지 않으면
	//		"num is not bigger than 10!" 을 출력
	if (num > 10)
		printf("num is bigger than 10!\n");
	else  // 위의 조건식이 거짓(0)일 때 수행되는 구문
		printf("num is not bigger than 10!\n");

	//--------------------------------------------
	printf("-------------------------\n");

	// 3. if - else if 문
	//		- if - else 문으로는 하나의 조건에 따른 코드를 수행
	//		-  다수의 조건에 따라 코드를 수행하는 조건문
	//		- else 구문에 if 문을 추가한 형태
	num = 1;
	
	if (num > 10)
		printf("num is bigger than 10!\n");
	else if (num < 10)  
		// 위의 조건식이 거짓이고, 해당 조건식이 참인 경우
		printf("num is smaller than 10!\n");
	else // if (num == 10)
		// 위의 조건식이 거짓이고, 해당 조건식이 참인 경우
		printf("num is equal to 10!\n");
	// else {  }
	// 위의 모든 조건식이 거짓인 경우를 처리할 때는
	// else 구문을 작성한다.

	//--------------------------------------------
	printf("-------------------------\n");



	return 0;
}