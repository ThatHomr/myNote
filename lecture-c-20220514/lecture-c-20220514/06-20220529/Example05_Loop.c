#include <stdio.h>

/*
	File Name		: Example05_Loop.c
	Data					: 2022.05.29
*/

int main()
{
	// ���� n �� �Է��� �ް�
	// "Hello Programmer!" �� n �� ����ϵ��� �ۼ�

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