#include <stdio.h>

/*
	File Name		: Example01_printf.c
	Data					: 2022.05.15
*/
int main()
{
	// �ʺ�(width)�� 30, ����(height)�� 25�� �簢����
	// �ʺ�, ����, �ѷ�, ���̸� ���
	
	// �ʺ� ���
	printf("width = %d\n", 30);
	// ���� ���
	printf("height = %d\n", 25);
	// �ѷ� ���
	printf("perimeter = %d\n", (30 + 25) * 2);
	// ���� ���
	printf("area = %d\n", (30 * 25));

	return 0;
}