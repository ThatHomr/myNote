#include <stdio.h>

/*
	File Name		: Example06_Conditional.c
	Data					: 2022.05.28
*/

int main()
{

	// ���� �ϳ��� �Է��� �ް�
	// �Է¹��� ������ ������� �������� 0���� ���
	//		��� : Positive Number
	//		���� : Negative Number
	//		0	   : Zero

	int num = 0;
	
	printf("Enter is integer >>> ");

	scanf("%d", &num);

	if (num > 0)
		printf("num is positive number!\n");
	else if (num < 0)
		printf("num is negative number!\n");
	else  // 0�� ���
		printf("num is zero!\n");

	//------------------------------------



	return 0;
}