#include <stdio.h>

/*
	File Name		: File02_break.c
	Data			: 2022.06.05
*/

int main()
{
	// 입력한 양의 정수들의 합계를 출력하는 프로그램을 작성
	// 음수를 입력 받으면 합계를 출력하고 프로그램을 종료
	// 단, 음수 중 '-1' 입력받으면 total 의 값을 0으로 설정하고 다시 입력

	// 1. 사용자로부터 입력
	// 2. 양수인지 음수인지 검사
	// 2-1. 음수이면 합계 출력 후 프로그램 종료
	// 2-2. 양수이면 합계에 누적 → 1 번 반복

	// 사용자로부터 정수를 입력받는 변수
	int n = 0;
	// 양의 정수들의 합계를 저장하는 변수
	int total = 0;

	while (1) // 무한루프
	{
		// 사용자로부터 입력
		printf("Enter a positive number >>> ");
		scanf("%d", &n);

		// 사용자로부터 입력된 값이
		// 우리가 연산하기 위한 값인지 검사
		// → 유효성 검사(Validation)
		if (n == -1)
		{
			total = 0;
			continue;
		}
		if (n < 0) break;  // 반복문 종료

		// n 의 값이 유효한 값이면
		// 해당 라인부터 연산을 하기 위한 코드를 작성
		total += n;
	}

	printf("total = %d\n", total);



	return 0;
}