#include <stdio.h>

/*
	File Name		: Example03_Loop.c
	Data					: 2022.06.04
*/

int main()
{
	// ���� num �� �Է��� �ް�
	// num �������� 1���� 1�� �����Ͽ�
	// num�� ���� ��� ����ϴ� for ���� �ۼ�

	// num = 5
	//		>>> 5 4 3 2 1 
	// num = 7
	//		>>> 7 6 5 4 3 2 1 

	int num;

	printf("Enter a integer >>> \n");
	// ���� num �� ����ڷκ��� �Է¹��� ���� ����
	scanf("%d", &num);

	// �Էµ� ���� �״�� �����ؾ��Ѵٸ�
	// �ʱ�Ŀ��� �Էµ� ���� ����� ������ ����
	for (int n = num; n >= 1; n--)
	{
		printf("num = %d\n", n);
	}
	printf("------------------------------\n");

	while (num)  // num�� ���� 0 �̵Ǹ� ����
	{
		printf("num = %d\n", num--);
	}
	printf("------------------------------\n");

	return 0;
}