#include <stdio.h>
#include <stdlib.h> // rand�Լ��� ����ϱ� ���� ��� ����



int main()
{
	int num = 0; // �ڽ��� �Է��� ���ʽ� ��ȣ�� �����ϱ� ���� ����
	printf("*** �ζ� ���α׷��� �����մϴ�. ***\n");
	printf("5���� ������ ��ȣ�� ����� �Է��� 1�� ���� ��ȣ�� ��µ˴ϴ�.\n");
	printf("����� ���� ���ʽ� ��ȣ(1 ~ 45) ���ڸ� �Է� �� Enter�� Ŭ�����ּ���\n");
	
	scanf("%d", &num);

	// 1 ~ 45 ���� �� ���ڸ� �Է½� �ٽ� �Է�
	while (!((num > 0) && (num < 46)))  
	{
		printf("���ʽ� ���ڸ� �߸� �Է��ϼ̽��ϴ�.\n");
		printf("�ٽ� ���ʽ�����(1~45)�� �Է����ּ���");
		scanf("%d", &num);
	}

	// �ζ� �ڵ���ȣ 5���� �����ϱ� ���� 5�� ũ���� �迭 ���� �� �ʱ�ȭ
	int lotto[ 5 ] = { 0 };

	printf("���� : %d \n", num);
	printf("�ڵ� : ");

	// �ڵ���ȣ ����
	for (int i = 0; i < 5; i++)
	{
		int ran = rand() % 45 + 1;
		// rand() % 45 �� ������ 0 ~ 44 �̱⶧���� +1
		
		lotto[i] = ran;

		// ������ ���ڿ� �������� �ߺ��� ����÷
		if (lotto[i] == num)
		{
			ran = rand() % 45 + 1;
			lotto[i] = ran;
		}

		// ������ ���ڿ� �ڵ�����, �������� �ߺ��� ����÷
		for (int j = 1; j <= 5; j++)
		{
			if (lotto[j] == lotto[i])
			{
				ran = rand() % 45 + 1;
				lotto[i] = ran;
			}
			if (lotto[i] == num)
			{
				ran = rand() % 45 + 1;
				lotto[i] = ran;
			}
		}
	}

	// ����� ���� �ݺ���
	for (int i = 0; i < 5; i++) {
		printf("%d ", lotto[i]);
	}

	printf("\n");
	printf("��÷�Ǳ� �ٶ��ϴ�!\n");

	return 0;
}