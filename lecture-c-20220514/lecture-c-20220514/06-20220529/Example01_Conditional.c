#include <stdio.h>

/*
	File Name		: Example01_Conditional.c
	Data					: 2022.05.29
*/

int main()
{
	// �Է¹��� ������
	// ¦������ Ȧ������ 0���� ��µǵ��� �ۼ�
	//		¦�� : Even Number
	//		Ȧ�� : Odd Number
	//		0	   : Zero

	// ����ڷκ��� �Է¹��� ���� �����ϴ� ����
	int num = 0;

	// ����ڷκ��� �Է�
	printf("Enter is integer >>> ");
	scanf("%d", &num);

	// ������ ������ �Ű澵 ��
	if (num == 0)
		printf("num is zero!\n");
	else if (num % 2 == 1)
		printf("num is odd number!\n");
	else if (num % 2 == 0)
		printf("num is even number!\n");

	/*
	if (num % 2 == 0 && num > 0)
		printf("num is even number!\n");
	else if (num % 2 == 1)
		printf("num is odd number!\n");
	else
		printf("num is \n");
	*/

	return 0;
}