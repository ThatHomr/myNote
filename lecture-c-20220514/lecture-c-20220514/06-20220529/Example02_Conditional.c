#include <stdio.h>

/*
	File Name		: Example02_Conditional.c
	Data					: 2022.05.29
*/

int main()
{
	// 입력받은 정수가 아래 조건에 따라 결과가 출력되도록 작성
	//		3의 배수인 경우 : "Fizz"
	//		5의 배수인 경우 : "Buzz"
	//		3의 배수이면서 5의 배수인 경우 : "FizzBuzz"
	//		그 외인 경우 : 입력받은 정수

	int num = 0;

	printf("Enter is integer >>>\n");
	scanf("%d", &num);

	if ((num % 3 == 0) && (num % 5 == 0))
		printf("FizzBuzz");
	else if (num % 3 == 0)
		printf("Fizz");
	else if (num % 5 == 0)
		printf("Buzz");
	else
		printf("%d", num);



	return 0;
}