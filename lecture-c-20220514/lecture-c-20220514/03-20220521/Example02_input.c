#include <stdio.h>


int main()
{
	// ����ڷκ��� ���������� ���� 3���� �Է��� �޾Ƽ�
	// ������ ����� ����ϴ� ���α׷��� �ۼ�
	//  - ����� �Ҽ� ��°�ڸ����� ���
	int score1 = 0, score2 = 0, score3 = 0;

	printf("Enter a score >>> ");

	scanf("%d %d %d", &score1, &score2, &score3);

	double avg = (score1 + score2 + score3) / 3;

	printf("score1 = %d, score2 = %d, score3 = %d, avg = %.2f\n", score1, score2, score3, avg);

	return 0;

}