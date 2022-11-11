#include <stdio.h>

/*
	File Name		: Example06_Loop.c
	Data					: 2022.05.29
*/

int main()
{
	// 두 정수 a 와 b 를 입력을 받고
	// a <= n < b 의 정수를 모두 출력

	int a = 0, b = 0, n = 0;

	printf("Enter two integer >>> \n");
	scanf("%d %d", &a, &b);

	n = a;

	while (n >= a && n < b)  // (n < b) 
	{
		printf("n : %d\n", n);
		n++;
	}

	return 0;
}