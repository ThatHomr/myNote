#include <stdio.h>

/*
	File Name		: Example04_Loop.c
	Data					: 2022.06.04
*/

int main()
{
	// 1 부터 100까지의 자연수들의 합을 계산하여 출력
	//		for 문을 통해 계산하여 출력
	//		int sum = 1 + 2 + 3 + ... + 99 + 100;
	
	/*
	int sum = 0;
	for (int n = 0;n <= 100; n++)
	{
		sum += n;
	}
	
	printf("sum n = %d\n", sum);
	*/
	
	
	// sum = ( n - 1 까지의 합) + n;

	// sum = 0 + 1 = 1
	// sum = 1 + 2 = 3
	// sum = 3 + 3 = 3
	// sum = 6 + 4 = 10
	// ....

	// sum = 0
	// sum = sum + 1 = 1
	// sum = sum + 2 = 3
	// sum = sum + 3 = 3
	// sum = sum + 4 = 10
	// ....

	// 1부터 100까지의 자연수들의 합계를 저장하기 위한 변수
	//  - 반복문이 끝나고 나서 출력하기 위해
	//		반복문 전에 미리 선언
	int sum = 0;

	// 변수 sum에 1부터 100까지의 자연수들을 더하여 저장
	for (int n = 0; n <= 100; n++)
	{

		// sum = sum + n;
		// 대입 연산자와 산술 연산자의 좌측 피연산자가 같은 변수이면
		// 복합 대입 연산자로 연산식을 만들 수 있다.
		printf("%d + %d = ", sum, n);
		sum += n;
		printf("%d\n", sum);
	}

	printf("sum n = %d\n", sum);

	return 0;
}