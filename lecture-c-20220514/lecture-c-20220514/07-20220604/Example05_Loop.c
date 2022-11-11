#include <stdio.h>

/*
	File Name		: Example05_Loop.c
	Data					: 2022.06.04
*/

int main()
{
	// �� ����(n1 , n2)�� �Է��� �޾Ƽ�
	// �� ���� ������ ��� �������� ���� ���
	
	int n1 , n2 ;
	int sum = 0;

	printf("Enter two integer >>> ");
	scanf("%d %d\n", &n1, &n2);

	int max = (n1 > n2) ? n1 : n2;
	int min = (n1 < n2) ? n1 : n2;

	
	
	for (int n = min; n <= max; n++)
	{
		sum += n;
	}

	printf("n1 �� n2 ������ ������ ���� >>> %d\n", sum);

	/*

	// ����ڷκ��� �Է¹��� ������ �����ϴ� ����
	int n1, n2;
	// �� ���� ������ ���� �����ϴ� ����
	int sum = 0;
	// �� ���� �߿� ū ���� ���� ���� �����ϴ� ����
	int max, min;

	printf("Enter two integer >>> ");
	scanf("%d %d\n", &n1, &n2);

	// n1 < n2
	//  �� for(int n = n1; n <= n2; n++) {...}
	// n2 > n1
	//  �� for(int n = n1; n >= n2; n--) {...}
	//  �� for(int n = n2; n <= n1; n++) {...}

	// �� ����(n1, n2) �� ū ���� ���� ���� �����Ͽ�
	// ���� ������ ū �������� ���� ������!

	max = (n1 > n2) ? n1 : n2;
	min = (n1 < n2) ? n1 : n2;

	// min ���� ���� max ���� 1�� �����Ͽ�
	// ��� �������� ���� ����

	for (int n = min; n <= max, n++)
	{
		sum += n;
	}

	printf("sum = %d\n", sum);
	*/

	return 0;
}