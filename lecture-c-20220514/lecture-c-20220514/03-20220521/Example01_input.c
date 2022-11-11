#include <stdio.h>

int main()
{
	// 사용자로부터 원의 반지름을 입력을 받아서
	// 원의 둘레와 넓이를 구한 다음
	// 반지름, 둘레, 넓이를 각각 출력하도록 작성
	int radius = 0;
	double PI = 3.14;
	double circumference = 0;
	double area = 0;

	// 프롬프트
	printf("Enter a radius of the circle >>> ");

	// 정수 형태의 원의 반지름을 입력
	scanf("%d", &radius);

	circumference = PI * 2 * radius;
	area = PI * radius * radius;

	printf("radius of the cicle >>> %d\n", radius);
	printf("circumference of the cicle >>> %.2f\n", circumference);
	printf("area of the cicle >>> %.2f\n", area);

	return 0;

}