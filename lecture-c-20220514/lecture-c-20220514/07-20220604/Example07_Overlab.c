#include <stdio.h>

/*
	File Name		: Example07_Overlab.c
	Data					: 2022.06.04
*/

int main()
{
	// ������ 2�ܿ��� 9�ܱ��� ��� ���

	/*
		2��
		2 * 1 = 2
		2 * 1 = 2
		...
		9��
		9 * 1 = 9
		9 * 9 = 81
	*/

	/*
	for (int dan = 2; dan <= 9; dan++)
	{
		printf("%d��\n", dan);
		for (int n = 1; n <= 9; n++)
		{
			printf("%d * %d = %d\n", dan, n, dan * n2);
		}
	}
	*/

	int dan = 2;
	int n = 1;
	while (dan <= 9)
	{
		printf("%d��\n", dan);
		n = 1;
		while (n <= 9)
		{
			printf("%d * %d = %d\n", dan, n, dan * n);
			n++;
		}
		dan++;
	}

	return 0;
}