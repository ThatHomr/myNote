#include <stdio.h>

/*
	File Name		: File02_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	// ���� �� (Conditional Statement)
	//  - Ư�� ���ǿ� ���� ����Ǵ� �ڵ带 �����ϴ� ���
	
	int num = 0;

	//--------------------------------------------
	// 1. �ܼ� if ��
	//		- ������ �����ϴ� ��쿡 �ڵ带 ����
	num = 7;
	num = 17;
	// ���� num �� ���� 10���� ũ��
	//		"num is bigger than 10!" �� ���
	if (num > 10)
		printf("num is bigger than 10!\n");
	//--------------------------------------------
	printf("-------------------------\n");
	
	// 2. if - else ��
	//		- ������ ����� ���� �ڵ带 ����
	num = 17;
	// ���� num �� ���� 10���� ũ��
	//		"num is bigger than 10!" �� ���
	// �׷��� ������
	//		"num is not bigger than 10!" �� ���
	if (num > 10)
		printf("num is bigger than 10!\n");
	else  // ���� ���ǽ��� ����(0)�� �� ����Ǵ� ����
		printf("num is not bigger than 10!\n");

	//--------------------------------------------
	printf("-------------------------\n");

	// 3. if - else if ��
	//		- if - else �����δ� �ϳ��� ���ǿ� ���� �ڵ带 ����
	//		-  �ټ��� ���ǿ� ���� �ڵ带 �����ϴ� ���ǹ�
	//		- else ������ if ���� �߰��� ����
	num = 1;
	
	if (num > 10)
		printf("num is bigger than 10!\n");
	else if (num < 10)  
		// ���� ���ǽ��� �����̰�, �ش� ���ǽ��� ���� ���
		printf("num is smaller than 10!\n");
	else // if (num == 10)
		// ���� ���ǽ��� �����̰�, �ش� ���ǽ��� ���� ���
		printf("num is equal to 10!\n");
	// else {  }
	// ���� ��� ���ǽ��� ������ ��츦 ó���� ����
	// else ������ �ۼ��Ѵ�.

	//--------------------------------------------
	printf("-------------------------\n");



	return 0;
}