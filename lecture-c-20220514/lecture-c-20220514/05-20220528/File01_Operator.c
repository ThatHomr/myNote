#include <stdio.h>

/*
	File Name		: File01_Operator.c
	Data					: 2022.05.28
*/

int main()
{
	// ��Ʈ ������
	//  - ��Ʈ �� ������
	//			: ��Ʈ ������ �� ������ �ϴ� ������
	//  - ��Ʈ ����Ʈ ������
	//			: ��Ʈ�� ���� �Ǵ� ���������� �̵��ϴ� ������

	// int firstLight = 0;
	// int secondLight = 0;
	// ������ ���¸� �����ϴ� ����
	//  - �� ��Ʈ �� �ϳ��� ���� ���¸� ǥ��
	//  - 1 : on, 0 : off
	int lightstate = 0b00001011;
	int n;
	// ������ �����ϱ� ���� ��Ʈ�� �ִ� ��
	const int MASK = 0b11111111;

	// ��� ������ on
	lightstate = lightstate | MASK;

	// ��� ������ off
	lightstate = lightstate & (~MASK);

	// n ��° ��ġ�� ������ on
	n = 3; // ����°
	lightstate = lightstate | (1 << (n - 1));

	// n ��° ��ġ�� ������ off
	lightstate = lightstate & ~(1 << (n - 1));
	
	// n ��° ��ġ�� ������ on �̸� off��
	// off �̸� on ���� ��ȯ
	lightstate = lightstate ^ (1 << (n - 1));

	return 0;
}