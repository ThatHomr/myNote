#include <stdio.h>

/*
	File Name		: Example03_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	// �� ���� ������ �Է��� �޾Ƽ�
	// �� ������ ������ ���� ���� ���
	int a, b;
	a = 0;
	b = 0;

	printf("�ΰ��� ������ �Է��Ͻÿ� >>> \n");

	scanf("%d %d", &a, &b);

	int max, min;
	max = (a > b) ? a : b;
	min = (a < b) ? a : b;

	int ans;
	ans = max - min;

	printf("�� ������ ���� >>> %d\n", ans);

	/*
	int n1 =0, n2 = 0;
	int abs = 0;  // ���� ���� �����ϱ� ���� ����
	printf("Enter two integer >>> \n");
	scanf("%d %d", &a, &b);

	// abs = ū �� - ���� ��
	if (n1` > n2)
	{
		abs = (n1 - n2);
	}
	else
	{
		abs = (n2 - n1);
	}
	printf("absolute value : %d\n", abs);
	//-------------------------------------------
	abs = (n1 - n2);

	// ���� abs �� ����� ���� �����̸�
	// ����� ����ǵ��� -1 �� �����ش�.
	if (abs < 0);
		abs *= -1;
	
	printf("absolute value : %d\n", abs);

	*/
	return 0;
}