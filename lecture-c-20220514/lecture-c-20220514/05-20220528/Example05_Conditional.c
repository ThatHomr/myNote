#include <stdio.h>

/*
	File Name		: Example05_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	// num �� ���� 3�� ����̰ų� 7�� ����̸�
	//		"Wonderful day" �� ����ϰ�
	// �׷��� ������
	//		"Beautiful day!" �� ����ϵ��� �ۼ�
	int num = 9;

	if (!((num % 3) || !(num % 7)))                 // ���� ��� num �� 3�� ����̰ų� 7�� ����̴�.
		printf("Wonderful day!\n");
	else                                          
		printf("Beautiful day!\n");
	
	//---------------------------------

	if ((num % 3 == 0) || (num % 7 == 0))      // ���� ��� num �� 3�� ����̰ų� 7�� ����̴�.
		printf("Wonderful day!\n");
	else
		printf("Beautiful day!\n");

	//---------------------------------
	// ��𸣰��� ��Ģ�� ���� �Ʒ��� ����
	// ���ǽ��� �ۼ��� �� �ִ�.
	if (!((num % 3) && (num % 7)))                 // ���� ��� num �� 3�� ����̰ų� 7�� ����̴�.
		printf("Wonderful day!\n");
	else
		printf("Beautiful day!\n");

	return 0;
}