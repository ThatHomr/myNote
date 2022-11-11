#include <stdio.h>

/*
	File Name		: Example01_Conditional.c
	Data					: 2022.05.29
*/

int main()
{
	// 입력받은 정수가
	// 짝수인지 홀수인지 0인지 출력되도록 작성
	//		짝수 : Even Number
	//		홀수 : Odd Number
	//		0	   : Zero

	// 사용자로부터 입력받은 값을 저장하는 변수
	int num = 0;

	// 사용자로부터 입력
	printf("Enter is integer >>> ");
	scanf("%d", &num);

	// 조건의 순서도 신경쓸 것
	if (num == 0)
		printf("num is zero!\n");
	else if (num % 2 == 1)
		printf("num is odd number!\n");
	else if (num % 2 == 0)
		printf("num is even number!\n");

	/*
	if (num % 2 == 0 && num > 0)
		printf("num is even number!\n");
	else if (num % 2 == 1)
		printf("num is odd number!\n");
	else
		printf("num is \n");
	*/

	return 0;
}