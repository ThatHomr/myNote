#include <stdio.h>

/*
	File Name		: Example01_Loop.c
	Data					: 2022.06.04
*/

int main()
{
	// 100 <= n <= 150 의 정수들이
	// 아래 조건에 따라 결과가 출력되도록 작성
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


	// 100 이상의 정수 부터 시작하기 때문에
	// 변수 n 에 100 을 저장
	int n = 100;

	// n 의 값이 150 이하이면 반복 수행되도록
	// 조건식을 작성.
	while (n <= 150)
	{
		//	n 의 값이
		//		3의 배수이면서 5의 배수인 경우 : "FizzBuzz"
		if (n % 3 == 0 && n % 5 == 0)
			printf("%d : FizzBuzz\n", n);
			//		3의 배수인 경우 : "Fizz"
		else if (n % 3 == 0)
			printf("%d :Fizz\n", n);
		//		5의 배수인 경우 : "Buzz"
		else if (n % 5 == 0)
			printf("%d :Buzz\n", n);
		//		그 외인 경우 : 입력받은 정수
		else
			printf("n = %d\n", n);
		// 그 다음 값을 검사하기 위해
		// 1증가
		n++;
	}








	return 0;
}