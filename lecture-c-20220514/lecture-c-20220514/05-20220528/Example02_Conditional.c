#include <stdio.h>

/*
	File Name		: Example02_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	int num = 21;

	// num �� ���� ¦���̸� "num is even number!" �� ����ϰ�
	// �׷��� ������ "num is odd number!" �� ����ϴ�
	// ���ǹ��� �ۼ�

	if ((num % 2) == 0)   // ¦���϶�
		printf("num is even number!\n");

	else                          // Ȧ���϶�
		printf("num is odd number!\n");
	//-------------------------------------------------
	if (num % 2)   // ���� ���� 0�� �ƴϸ� ��
		printf("num is odd number!\n");
	else                         
		printf("num is even number!\n");

	return 0;
}