#include <stdio.h>

/*
	File Name		: Example07_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	// 입력받은 정수가
	// 짝수인지 홀수인지 0인지 출력되도록 작성
	//		짝수 : Even Number
	//		홀수 : Odd Number
	//		0	   : Zero

	int num = 0;
	printf("Enter is integer >>> ");
	scanf("%d", &num);

	if (num == 0)
		printf("num is zero!\n");
	else if (num % 2)
		printf("num is odd number!\n");
	else
		printf("num is even number!\n");



	return 0;
}