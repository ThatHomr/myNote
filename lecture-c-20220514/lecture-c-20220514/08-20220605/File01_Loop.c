#include <stdio.h>

/*
	File Name		: File01_Loop.c
	Data			: 2022.06.05
*/

int main()
{
	// 무한 루프
	//  - 무한히 반복하는 경우를 의미
	
	//  - 조건식 또는 증감식을 잘못 작성한 경우 발생되어지며
	//  - 하지만 목적에 따라서 무한 루프를 이용하여
	//	  코드를 작성하는 경우도 있다.
	//	   → 의도적으로 무한히 반복되도록 해야한다.
	//	   → 조건식에 '참'을 의미하는 1을 작성한다.

	// 잘못된 방식으로 무한 루프가 된 경우
	//  → 프로그램 강제 종료 : ctrl + c
	
	/*
	int i = 0;
	while (i < 10)
	{
		printf("Hello World!");
	}
	*/
	
	while (1)
	{
		printf("Hello World!\n");
	}

	return 0;
}