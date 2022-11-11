#include <stdio.h>

/*
	File Name		: Example01_Operator.c
	Data					: 2022.05.28
*/

int main()
{
	// �� ���� ������ �Է��� �ް�
	// �� ������ ���� 3�� ����̰�, 7�� ����̸�
	// �� ���� ���� ū ���� ����ϰ�
	// �׷��� ������ ���� ���� ����ϴ� ���α׷��� �ۼ�
	//-------------------------------------------
	// �Է� ���� ���� �����ϱ� ���� ������ �� �� ����
	int a, b;

	// �� ������ ���� �����ϴ� ����
	int sum;

	// �� ������ ū ���� �����ϴ� ����
	// �� ������ ���� ���� �����ϴ� ����
	int max;
	int min;

	// ���� ��� ���� �����ϴ� ����
	int res;

	// ������Ʈ ���
	printf("Enter two integers >>> ");

	// ����ڷκ��� �Է�
	scanf("%d %d", &a, &b);
	// - �Է� ���� ������ �����ϱ� ����
	//	  ���� ������(&)�� ���� �տ� �ٿ� ����

	printf("a = %d\n", a);
	printf("b = %d\n", b);
	
	// �� ������ ���� ����
	sum = a + b;
    printf("sum = %d\n", sum);

	// �� ���� �� ū ���� ����
	//  - a �� b ���� �̻��̸� a �� ū ���̰�, 
	//     �׷��� ������ b �� ū ��
	max = (a >= b) ? a : b;
	
	// �� ���� �� ���� ���� ����
	//  - a �� b ���� �����̸� a �� ���� ���̰�,
	//     �׷��� ������ b �� ���� ��
	min = (a <= b) ? a : b;

	printf("max = %d\n", max);
	printf("min = %d\n", min);

	// �� ������ ���� 3�� ����̰� 7�� ������� �˻�
	//  - n �� ��� = n ���� ������ �� �������� 0 �� ��
	// �����ϸ� �� ���� �� ū ���� ����ϰ�
	// �������� ������ �� ���� �� ���� ���� ���
	res = ((sum % 3 == 0) && (sum % 7 == 0)) ? max : min;
	
	printf("Result = %d\n", res);

	return 0;
}