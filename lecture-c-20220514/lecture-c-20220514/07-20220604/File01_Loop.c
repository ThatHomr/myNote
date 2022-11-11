#include <stdio.h>

/*
	File Name		: HomeWork.c
	Data					: 2022.06.04
*/

int main()
{

	// do-while 문 
	//  - while 문과 같이 조건에 의해 반복 수행하는 반복문
	//  - 단, 최소 1번은 수행한다.
	int count = 0;

	do
	{
		printf("Hello World!\n");
		count++;
	} while (count < 5);
	printf("-------------------------------\n");
	//--------------------------------------------------
	
	// for 문
	//  - 특정 획수 또는 범위를 정의하여 반복 수행하기 위한 반복문
	
	// 변수 count의 값이 0부터 5까지 1씩 증가하는 반복문
	for (int count = 0; count < 5; count++)
	{
		printf("Hello World!\n");
	}
	printf("-------------------------------\n");

	// 10 <= n <= 20 사이의 정수를 출력
	// int n = 0;
	for (int n = 10; n <= 20; n++)
	{
		printf("n = %d\n", n);
	}

	// 변수 n 은 for 문에서만 사용하기 위한 변수이기 때문에
	// for 문이 끝나면 변수 n 도 사라지게 된다.
	//  - 블록(scope) 내에 선언된 변수는
	//	   해방블록(scope) 밖에서 사용할 수 없다.
	//  - 만약 반복문에서 사용한 변수를 반복문 끝나고 나서도
	//		사용해야 한다면, 반복문 전에 미리 선언을 해둬야한다.
	// printf("final n = %d\n", n);







	return 0;
}