#include <stdio.h>

int main()
{
	// ����ڷκ��� ���� �������� �Է��� �޾Ƽ�
	// ���� �ѷ��� ���̸� ���� ����
	// ������, �ѷ�, ���̸� ���� ����ϵ��� �ۼ�
	int radius = 0;
	double PI = 3.14;
	double circumference = 0;
	double area = 0;

	// ������Ʈ
	printf("Enter a radius of the circle >>> ");

	// ���� ������ ���� �������� �Է�
	scanf("%d", &radius);

	circumference = PI * 2 * radius;
	area = PI * radius * radius;

	printf("radius of the cicle >>> %d\n", radius);
	printf("circumference of the cicle >>> %.2f\n", circumference);
	printf("area of the cicle >>> %.2f\n", area);

	return 0;

}