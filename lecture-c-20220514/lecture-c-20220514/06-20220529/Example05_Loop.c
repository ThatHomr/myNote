#include <stdio.h>

/*
	File Name		: Example05_Loop.c
	Data					: 2022.05.29
*/

int main()
{
	// 정수 n 을 입력을 받고
	// "Hello Programmer!" 를 n 번 출력하도록 작성

	int n = 0;
	int count = 0;

	printf("Enter an integer >>> \n");
	scanf("%d", &n);

	while (count < n)
	{
		printf("Hello Programmer!\n");
		
		count++;
	}
	printf("---------------------------------\n");
	while (n)
	{
		printf("Enter an integer >>> \n");

		--n;
	}




	return 0;
}