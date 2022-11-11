#include <stdio.h>

/*
	File Name		: Example01_printf.c
	Data					: 2022.05.15
*/
int main()
{
	// 너비(width)가 30, 높이(height)가 25인 사각형의
	// 너비, 높이, 둘레, 넓이를 출력
	
	// 너비 출력
	printf("width = %d\n", 30);
	// 높이 출력
	printf("height = %d\n", 25);
	// 둘레 출력
	printf("perimeter = %d\n", (30 + 25) * 2);
	// 넓이 출력
	printf("area = %d\n", (30 * 25));

	return 0;
}