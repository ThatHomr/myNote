#include <stdio.h>

/*
	File Name		: File01_Conditional.c
	Data					: 2022.05.29
*/

int main()
{
	// switch ��

	int num = 4;

	if (num == 1 || num == 0)
		printf("num is 0 or 1.\n");
	else if (num == 2)
		printf("num is 2.\n");
	else if (num == 3)
		printf("num is 3.\n");
	else
		printf("maybe bigger than 3.\n");
	//-----------------------------------------
	// �ϳ��� ������� �ڵ尡 �ۼ��Ǳ� ������
	// ������ ����� �ߴ����� �ʴ� �� �ڵ带 ��� ����
	// �߰��� ����� �ߴ�(Ż��)�ϱ� ���� break Ű���带 ���
	
	switch (num)
	{
	case 0: case 1:      // num �� ���� 0 �Ǵ� 1 �� ��
		printf("num is 0 or 1.\n");
		break;     // switch ���� Ż��
	case 2:      // num �� ���� 2 �� ��
		printf("num is 2.\n");
		break;
	case 3:      // num �� ���� 3 �� ��
		printf("num is 3.\n");
		break;
	default:
		printf("maybe bigger than 3.\n");
	}

	return 0;
}