#include <stdio.h>


int main()
{
	// 사용자로부터 정수형태의 점수 3개를 입력을 받아서
	// 점수와 평균을 출력하는 프로그램을 작성
	//  - 평균은 소수 둘째자리까지 출력
	int score1 = 0, score2 = 0, score3 = 0;

	printf("Enter a score >>> ");

	scanf("%d %d %d", &score1, &score2, &score3);

	double avg = (score1 + score2 + score3) / 3;

	printf("score1 = %d, score2 = %d, score3 = %d, avg = %.2f\n", score1, score2, score3, avg);

	return 0;

}