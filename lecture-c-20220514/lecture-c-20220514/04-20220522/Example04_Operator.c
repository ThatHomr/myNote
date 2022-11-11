#include <stdio.h>

/*
	File Name		: Example04_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	int num = 3125;
	int n1 = 15, n2 = 21;

	// num 의 값이 7의 배수이면 n1의 값을 출력하고
	// 그렇지 않으면 n2의 값을 출력

	int res1 = (num % 7 == 0) ? n1 : n2;
	// int res2 = (num % 7) ? n2 : n1;
	//  나머지의 값이 0이면 거짓으로 간주하기 때문에
	//  순서를 바꿔야한다.
	printf("RESULT : %d\n", res1);

	return 0;
}