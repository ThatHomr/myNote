#include <stdio.h>


int main()
{
	// �������� 9�� ���� �ѷ��� ���̸� ���� ����
	// ������, �ѷ�, ���̸� ����ϴ� ���α׷��� �ۼ�
	// �Ǽ����� �Ҽ� ��°�ڸ������� ���

	// ���� �������� �����ϴ� ����
	int radius = 9;
	// ���� �ѷ��� �����ϴ� ����
	double circumference = 3.14 * 2 * radius;
	// ���� ���̸� �����ϴ� ����
	double area = 3.14 * radius * radius;

	// %d ������,   %f �Ǽ���
	printf("radius of cicle = %d\n", radius);
	printf("circumference of cicle = %.2f\n", circumference);
	printf("area of cicle = %.2f\n", area);

	return 0;
}