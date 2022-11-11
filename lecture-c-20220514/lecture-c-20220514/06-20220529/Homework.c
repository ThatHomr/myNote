#include <stdio.h>

/*
	File Name		: Homework.c
	Data					: 2022.05.29
*/

int main()
{
	// 100 <= n <= 150 의 정수들이
	// 정수가 아래 조건에 따라 결과가 출력되도록 작성
	//		3의 배수인 경우 : "Fizz"
	//		5의 배수인 경우 : "Buzz"
	//		3의 배수이면서 5의 배수인 경우 : "FizzBuzz"
	//		그 외인 경우 : 입력받은 정수

	//  100 : "Buzz"
	//  101 : 101
	//  102 : "Fizz"
	//   ...
	//  149 : 149
	//  150 : "FizzBuzz"

	int n = 0;

	printf("100이상 150이하의 정수를 입력하라 >>> \n");
	scanf("%d", &n);

	


	return 0;
}