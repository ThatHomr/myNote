#include <stdio.h>

/*
	File Name		: Example03_Break.c
	Data			: 2022.06.05
*/

int main()
{
	// �̹� ��ȭ�� ������ �Է��ϼ��� >>> 10
	// ������ 1~5 ���̸� �Է��ϼ���.
	// �̹� ��ȭ�� ������ �Է��ϼ��� >>> -2
	// ������ 1~5 ���̸� �Է��ϼ���.
	// �̹� ��ȭ�� ������ �Է��ϼ��� >>> 4
	// ���� : * * * *
	/*
	
	int n = 0;


	while (1)
	{
		printf("�̹� ��ȭ�� ������ �Է��ϼ��� >>> ");
		scanf("%d", &n);

		if (!(n >= 1 && n <= 5)) continue;
		printf("���� : ");
		for (int i = 1; i <= n; i++)
		{
			printf("* ");
		}
		if (n >= 1 && n <= 5) break;
	}
	*/
	// ��ȭ ����
	int rating = 0;

	// ������ �Է�
	// ������ ���� ���� ������ �˻�
	//  �� ��ȿ�� ���� �ƴϸ� �ٽ� �Է�
	//  �� ��ȿ�� ���̸� ���� ���

	while (1)
	{
		printf("Enter your movie rating >>> ");
		scanf("%d", &rating);
		if (rating < 1 || rating > 5)
		{
			printf("Enter a rating between 1 and 5.");
			continue;
		}
		printf("Movie Rating : ");
		for (int i = 1; i <= rating; i++)
		{
			printf("* ");
		}
		printf("\n");

		// �� �̻� ������ �ʿ䰡 ���� ������ ����
		break;
	}

	return 0;
}