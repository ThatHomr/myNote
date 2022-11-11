#include <stdio.h>

/*
	File Name		: Example05_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	// 두 개의 정수를 입력을 받고
	// 두 정수의 합이 3의 배수이고, 7의 배수이면
	// 두 정수 중의 큰 값을 출력하고
	// 그렇지 않으면 작은 값을 출력하는 프로그램을 작성
	int num1 = 0, num2 = 0;
	
	printf("2개의 정수를 입력하세요 >>> \n");

	scanf("%d %d", &num1, &num2);
	
	// 두 정수의 크기 비교
	int max = (num1 > num2) ? num1 : num2;
	int min = (num1 < num2) ? num1 : num2;
	
	// 두 정수의 합
	int sum1 = num1 + num2;
	
	// 문제 풀이
	int ans = ((sum1 % 3) == 0) && ((sum1 % 7) == 0) ? max : min;
	
	
	printf("두 정수의 합이 3과 7의 배수인가?\n");
	printf("맞을수 큰수, 틀릴시 작은수를 출력 >>> : %d\n", ans);

	return 0;
}