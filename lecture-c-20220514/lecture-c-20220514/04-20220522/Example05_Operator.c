#include <stdio.h>

/*
	File Name		: Example05_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	// �� ���� ������ �Է��� �ް�
	// �� ������ ���� 3�� ����̰�, 7�� ����̸�
	// �� ���� ���� ū ���� ����ϰ�
	// �׷��� ������ ���� ���� ����ϴ� ���α׷��� �ۼ�
	int num1 = 0, num2 = 0;
	
	printf("2���� ������ �Է��ϼ��� >>> \n");

	scanf("%d %d", &num1, &num2);
	
	// �� ������ ũ�� ��
	int max = (num1 > num2) ? num1 : num2;
	int min = (num1 < num2) ? num1 : num2;
	
	// �� ������ ��
	int sum1 = num1 + num2;
	
	// ���� Ǯ��
	int ans = ((sum1 % 3) == 0) && ((sum1 % 7) == 0) ? max : min;
	
	
	printf("�� ������ ���� 3�� 7�� ����ΰ�?\n");
	printf("������ ū��, Ʋ���� �������� ��� >>> : %d\n", ans);

	return 0;
}