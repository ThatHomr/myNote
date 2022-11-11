#include <stdio.h>

/*
	File Name		: Example01_Loop.c
	Data	    	: 2022.06.05
*/

	// n�� ������ �Է¹޾�
	// n���� *�� �����ﰢ���� �׷���
	// Enter the number of rows: 7
	//         *
	//        **
	//       ***
	//      ****
	//     *****
	//    ******
	//   *******
	//

	//d2 cording ��Ʈ�� �Ұ�
int main()
{
	// ���� ���� ���� ���� ���� ������
	// �ﰢ���� ����ϱ� ����
	// ����(space)�� ��(star)�� ���յ�
	// ��� ���� �����ϴ�.
	
	// ����ڰ� �Է��� ���� ��
	int rows;
	// �� �࿡ ����� ������ ��
	int spaces;
	// �� �࿡ ����� ���� ��
	int stars;

	printf("Enter the number of rows >>> ");
	scanf("%d", &rows);

	// �ﰢ���� ����ϱ� ���� rows �� �� ��ŭ ���
	//  - i �� ���� 1���� rows ���� 1�� ����
	//  - i = 1, 2, ..., rows
	for (int i = 1; i <= rows; i++)
	{
		printf("%d : ", i);
		// i �� ���� �࿡ ����� ���� ������ ����.
		stars = i;
		// spaces + stars = rows
		// spaces = rows - stars
		spaces = rows - i;
		// printf("space = %d, stars = %d", spaces, stars);

		// ������ ����ŭ ������ ���
		for (int j = 0; j < spaces; j++) printf(" ");

		// ���� ����ŭ ���� ���
		for (int j = 0; j < stars; j++) printf("*");

		printf("\n");
	}



	return 0;
}