#include <stdio.h>

/*
	File Name		: Example04_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	int num = 78;

	// num �� ���� 7�� ����̸�
	//   "num is multiple of 7!" �� ����ϰ�
	// �׷��� ������
	//   "num is not multiple of 7!" �� ����ϴٸ� �ۼ�

	if (num % 7)                        // ���� ��� 7�� ����̴�.
		printf("num is not multiple of 7!\n");
	else                                     
		printf("num is multiple of 7!\n");

	//-----------------------------------------------

	if (num % 7 == 0)                // ���� ��� 7�� ����� �ƴϴ�.
		printf("num is multiple of 7!\n");
	else                                     
		printf("num is not multiple of 7!\n");

	//-----------------------------------------------

	if ( !(num % 7))                // ���� ��� 7�� ����̴�.
		printf("num is multiple of 7!\n");
	else
		printf("num is not multiple of 7!\n");

	//-----------------------------------------------

	return 0;
}