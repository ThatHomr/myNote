#include <stdio.h>

/*
	File Name		: Example02_Loop.c
	Data					: 2022.06.04
*/

int main()
{
	// 1 <= n <= 100 사이의 정수들 중에서
	// 짝수만 출력되도록 for문을 작성
	
	// 반복 수행 횟수(조건)
	//  - n 의 값이 1 부터 100이 될 때 까지
	
	// 반복 수행해야될 기능
	//  - n 의 값이 짝수이면 출력
	
	for (int n = 1; n <= 100; n++)
	{
		
		if (n % 2 ==0) printf("n = %d 짝수이다.\n", n);
	}




	return 0;
}