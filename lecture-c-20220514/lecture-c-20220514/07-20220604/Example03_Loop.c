#include <stdio.h>

/*
	File Name		: Example03_Loop.c
	Data					: 2022.06.04
*/

int main()
{
	// 정수 num 을 입력을 받고
	// num 에서부터 1까지 1씩 감소하여
	// num의 값을 모드 출력하는 for 문을 작성

	// num = 5
	//		>>> 5 4 3 2 1 
	// num = 7
	//		>>> 7 6 5 4 3 2 1 

	int num;

	printf("Enter a integer >>> \n");
	// 변수 num 에 사용자로부터 입력받은 값을 저장
	scanf("%d", &num);

	// 입력된 값을 그대로 유지해야한다면
	// 초기식에서 입력된 값을 선언된 변수에 저장
	for (int n = num; n >= 1; n--)
	{
		printf("num = %d\n", n);
	}
	printf("------------------------------\n");

	while (num)  // num의 값이 0 이되면 종료
	{
		printf("num = %d\n", num--);
	}
	printf("------------------------------\n");

	return 0;
}