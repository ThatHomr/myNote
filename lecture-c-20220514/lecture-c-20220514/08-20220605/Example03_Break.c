#include <stdio.h>

/*
	File Name		: Example03_Break.c
	Data			: 2022.06.05
*/

int main()
{
	// 이번 영화의 평점을 입력하세요 >>> 10
	// 평점은 1~5 사이만 입력하세요.
	// 이번 영화의 평점을 입력하세요 >>> -2
	// 평점은 1~5 사이만 입력하세요.
	// 이번 영화의 평점을 입력하세요 >>> 4
	// 평점 : * * * *
	/*
	
	int n = 0;


	while (1)
	{
		printf("이번 영화의 평점을 입력하세요 >>> ");
		scanf("%d", &n);

		if (!(n >= 1 && n <= 5)) continue;
		printf("평점 : ");
		for (int i = 1; i <= n; i++)
		{
			printf("* ");
		}
		if (n >= 1 && n <= 5) break;
	}
	*/
	// 영화 평점
	int rating = 0;

	// 평점을 입력
	// 평점이 범위 안의 값인지 검사
	//  → 유효한 값이 아니면 다시 입력
	//  → 유효한 값이면 별을 출력

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

		// 더 이상 수행할 필요가 없기 때문에 종료
		break;
	}

	return 0;
}