#include <stdio.h>


int main()
{
	// 반지름이 9인 원의 둘레와 넓이를 구한 다음
	// 반지름, 둘레, 넓이를 출력하는 프로그램을 작성
	// 실수형은 소수 둘째자리까지만 출력

	// 원의 반지름을 저장하는 변수
	int radius = 9;
	// 원의 둘레를 저장하는 변수
	double circumference = 3.14 * 2 * radius;
	// 원의 넓이를 저장하는 변수
	double area = 3.14 * radius * radius;

	// %d 정수형,   %f 실수형
	printf("radius of cicle = %d\n", radius);
	printf("circumference of cicle = %.2f\n", circumference);
	printf("area of cicle = %.2f\n", area);

	return 0;
}