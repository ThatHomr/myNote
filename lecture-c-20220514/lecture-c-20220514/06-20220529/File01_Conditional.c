#include <stdio.h>

/*
	File Name		: File01_Conditional.c
	Data					: 2022.05.29
*/

int main()
{
	// switch 문

	int num = 4;

	if (num == 1 || num == 0)
		printf("num is 0 or 1.\n");
	else if (num == 2)
		printf("num is 2.\n");
	else if (num == 3)
		printf("num is 3.\n");
	else
		printf("maybe bigger than 3.\n");
	//-----------------------------------------
	// 하나의 블록으로 코드가 작성되기 때문에
	// 별도로 블록을 중단하지 않는 한 코드를 모두 수행
	// 중간에 블록을 중단(탈출)하기 위해 break 키워드를 사용
	
	switch (num)
	{
	case 0: case 1:      // num 의 값이 0 또는 1 일 때
		printf("num is 0 or 1.\n");
		break;     // switch 문을 탈출
	case 2:      // num 의 값이 2 일 때
		printf("num is 2.\n");
		break;
	case 3:      // num 의 값이 3 일 때
		printf("num is 3.\n");
		break;
	default:
		printf("maybe bigger than 3.\n");
	}

	return 0;
}