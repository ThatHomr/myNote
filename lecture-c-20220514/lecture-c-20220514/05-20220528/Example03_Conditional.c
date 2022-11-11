#include <stdio.h>

/*
	File Name		: Example03_Conditional.c
	Data					: 2022.05.28
*/

int main()
{
	// 두 개의 정수를 입력을 받아서
	// 두 정수의 차이의 절대 값을 출력
	int a, b;
	a = 0;
	b = 0;

	printf("두개의 정수를 입력하시오 >>> \n");

	scanf("%d %d", &a, &b);

	int max, min;
	max = (a > b) ? a : b;
	min = (a < b) ? a : b;

	int ans;
	ans = max - min;

	printf("두 정수의 차는 >>> %d\n", ans);

	/*
	int n1 =0, n2 = 0;
	int abs = 0;  // 절대 값을 저장하기 위한 변수
	printf("Enter two integer >>> \n");
	scanf("%d %d", &a, &b);

	// abs = 큰 값 - 작은 값
	if (n1` > n2)
	{
		abs = (n1 - n2);
	}
	else
	{
		abs = (n2 - n1);
	}
	printf("absolute value : %d\n", abs);
	//-------------------------------------------
	abs = (n1 - n2);

	// 변수 abs 에 저장된 값이 음수이면
	// 양수로 저장되도록 -1 을 곱해준다.
	if (abs < 0);
		abs *= -1;
	
	printf("absolute value : %d\n", abs);

	*/
	return 0;
}