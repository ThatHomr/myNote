#include <stdio.h>

/*
	File Name		: File02_Loop.c
	Data					: 2022.05.29
*/

int main()
{
	// �ݺ���(Loop Statement)
	//	 �ڵ带 �ݺ� �����ϴ� ���

	// "Hello World!" �� �ټ� �� ���
	printf("Hello World!\n");
	printf("Hello World!\n");
	printf("Hello World!\n");
	printf("Hello World!\n");
	printf("Hello World!\n");
	printf("---------------------------\n");

	// while ��
	//	 : "~ �ϴ� ����" �ǹ�
	//	 - Ư�� ������ �����ϴ� ���� �ݺ� ����

	// �ݺ����� �̿��Ͽ�
	// "Hello World!" �� �ټ� �� ���

	// ī����
	//  - ī���� ������ �����ϱ� ���� ����
	//  - ī���� �˻��ϴ� ���ǽ�
	//  - ī���� �����

	// ���Ƚ���� �����ϱ� ���� ���� = ī���� Ƚ��
	int currentCount = 0;
	int printCount = 5;
	//  ���� : ��� Ƚ���� 5���� ������ �ݺ� ����
	while (currentCount < printCount)
	{
		printf("%d : Hello World!\n", currentCount+1);
		
		// ��������� ī����
		currentCount++;
	}

	//--------------------------------------------
	// 1<= num <= 10 �� ������ ��� ���
	int num = 1;

	while (num <= 10)
	{
		printf("num is %d.\n", num);
		num++;
	}


	return 0;
}