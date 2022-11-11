#include <stdio.h>

/*
	File Name		: File02_Loop.c
	Data					: 2022.05.29
*/

int main()
{
	// 반복문(Loop Statement)
	//	 코드를 반복 수행하는 제어문

	// "Hello World!" 를 다섯 번 출력
	printf("Hello World!\n");
	printf("Hello World!\n");
	printf("Hello World!\n");
	printf("Hello World!\n");
	printf("Hello World!\n");
	printf("---------------------------\n");

	// while 문
	//	 : "~ 하는 동안" 의미
	//	 - 특정 조건을 만족하는 동안 반복 수행

	// 반복문을 이용하여
	// "Hello World!" 를 다섯 번 출력

	// 카운팅
	//  - 카운팅 정보를 저장하기 위한 변수
	//  - 카운팅 검사하는 조건식
	//  - 카운팅 연산식

	// 출력횟수를 저장하기 위한 변수 = 카운팅 횟수
	int currentCount = 0;
	int printCount = 5;
	//  조건 : 출력 횟수가 5보다 작으면 반복 수행
	while (currentCount < printCount)
	{
		printf("%d : Hello World!\n", currentCount+1);
		
		// 출력했으니 카운팅
		currentCount++;
	}

	//--------------------------------------------
	// 1<= num <= 10 의 정수를 모두 출력
	int num = 1;

	while (num <= 10)
	{
		printf("num is %d.\n", num);
		num++;
	}


	return 0;
}