#include <stdio.h>

/*
	File Name		: Example04_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	int num = 3125;
	int n1 = 15, n2 = 21;

	// num �� ���� 7�� ����̸� n1�� ���� ����ϰ�
	// �׷��� ������ n2�� ���� ���

	int res1 = (num % 7 == 0) ? n1 : n2;
	// int res2 = (num % 7) ? n2 : n1;
	//  �������� ���� 0�̸� �������� �����ϱ� ������
	//  ������ �ٲ���Ѵ�.
	printf("RESULT : %d\n", res1);

	return 0;
}