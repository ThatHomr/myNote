#include <stdio.h>

/*
	File Name		: Example05_Loop.c
	Data					: 2022.06.04
*/

int main()
{
	// 두 정수(n1 , n2)를 입력을 받아서
	// 두 정수 사이의 모든 정수들의 합을 출력
	
	int n1 , n2 ;
	int sum = 0;

	printf("Enter two integer >>> ");
	scanf("%d %d\n", &n1, &n2);

	int max = (n1 > n2) ? n1 : n2;
	int min = (n1 < n2) ? n1 : n2;

	
	
	for (int n = min; n <= max; n++)
	{
		sum += n;
	}

	printf("n1 과 n2 사이의 정수의 합은 >>> %d\n", sum);

	/*

	// 사용자로부터 입력받은 정수를 저장하는 변수
	int n1, n2;
	// 두 정수 사이의 합을 저장하는 변수
	int sum = 0;
	// 두 정수 중에 큰 값과 작은 값을 저장하는 변수
	int max, min;

	printf("Enter two integer >>> ");
	scanf("%d %d\n", &n1, &n2);

	// n1 < n2
	//  → for(int n = n1; n <= n2; n++) {...}
	// n2 > n1
	//  → for(int n = n1; n >= n2; n--) {...}
	//  → for(int n = n2; n <= n1; n++) {...}

	// 두 변수(n1, n2) 중 큰 값과 작은 값을 구분하여
	// 작은 값에서 큰 값까지의 합을 구하자!

	max = (n1 > n2) ? n1 : n2;
	min = (n1 < n2) ? n1 : n2;

	// min 에서 부터 max 까지 1씩 증가하여
	// 모든 정수들의 합을 누적

	for (int n = min; n <= max, n++)
	{
		sum += n;
	}

	printf("sum = %d\n", sum);
	*/

	return 0;
}