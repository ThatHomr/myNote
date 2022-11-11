#include <stdio.h>

/*
	File Name		: Example06_Conditional.c
	Data					: 2022.05.28
*/

int main()
{

	// 정수 하나를 입력을 받고
	// 입력받은 정수가 양수인지 음수인지 0인지 출력
	//		양수 : Positive Number
	//		음수 : Negative Number
	//		0	   : Zero

	int num = 0;
	
	printf("Enter is integer >>> ");

	scanf("%d", &num);

	if (num > 0)
		printf("num is positive number!\n");
	else if (num < 0)
		printf("num is negative number!\n");
	else  // 0인 경우
		printf("num is zero!\n");

	//------------------------------------



	return 0;
}