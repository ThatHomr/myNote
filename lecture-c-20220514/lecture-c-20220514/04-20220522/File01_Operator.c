#include <stdio.h>

/*
	File Name		: File01_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	// ������

	// 1. ��� ������
	//			- ��Ģ������ �ϱ����� ������
	//			- ����, ����, ����, ������, �߰������� ������ ������ ����
	//
	int a = 10;
	int b = 20;
	int min;
	int max;
	// ����
	printf("a + b = %d\n", a + b);
	// ����
	printf("a - b = %d\n", a - b);
	// ����
	printf("a * b = %d\n", a * b);
	// ������
	printf("a / b = %d\n", a / b);                    // ���� / ���� = ����
	printf("a / b = %.2f\n", (double)a / b);    // ���� / ���� = �Ǽ�
	// ������
	printf("a % b = %d\n", a % b);

	// ������� ������ �������� Ȱ�� �뵵
	//		1. ���� ��ȯ or ����
	//			3021g �� 1kg ��� �ָӴ��� �ʿ䰳��, ���� g�� ���
	//		2. ��� Ȯ��
	//			n�� ��� = n * 1, n * 2, n * 3 ....
	//						 = n ���� ������ �������� ��
	//						 = n ���� ������ �� �������� 0�� ��
	//		3. �׷�(�迭)
	//			�׷� �� ������, �й� ��
	//-------------------------------------------------------
	// ���� ���� ������
	//  - �ٸ� �����ڿ� ���� �����ڸ� ���ÿ� �����ϴ� ������
	//  - ���� �����ڿ� �ٸ� �������� '���� ������ ���� ������ ���' 
	//  - ���� ���� �����ڸ� ���� ������ �� �ִ�.
	//  - ��� �����ڻӸ� �ƴ϶� ��Ʈ �����ڵ� ���� ���� �����ڷ�
	a = 10;
	printf("a = %d\n", a);
	// a�� ����� ���� 5 ��ŭ ����
	//a = a + 5;
	a += 5;
	printf("a = %d\n", a);

	// a�� ����� ���� 3��ŭ ����
	a -= 3;
	printf("a = %d", a);
	//--------------------------------------------
	// ���� ������
	//  - ������ ����� ���� 1��ŭ ���� �Ǵ� ���ҽ�Ű�� ������
	//  -  ++ ������(1����),  -- ������(1����)
	//  - ���� �����ڴ� ����ϴ� ����� �� ������.
	//			���� ����
	//				 : ������ ����� ���� 1����
	//				 : ���� ��� ���� ������ ��
	//			���� ����
	//				 : ������ ����� ���� 1����
	//				 : ���� ��� �� = �����Ǳ� ���� ��
	a = 10;
	b = 10;
	printf("a = %d\n",a);
	printf("b = %d\n",b);
	++a;  // ���� ����
	b++;  // ���� ����
	printf("a = %d\n",a); // 11
	printf("b = %d\n",b); // 11
	printf("++a = %d\n", ++a);  // ������ ����� ������ �� = 12
	printf("b++ = %d\n", b++);  // ������ ����� �����Ǳ� ���� �� = 11
	// a = 12, b = 12						
	// ++a + a = 13 + 13 = 26
	// b++ + b = 12 + 13 = 25
	//---------------------------------------------------
	printf("\n");
	// �� ������
	//  - �������� ��ҿ� � ���踦 '�˻�'�ϴ� ������
	//  - ����� ��(1) �Ǵ� ����(0)�� ��ȯ�Ѵ�.
	//  - ���ǽ��� ���� �� ����Ѵ�. �� ������� ���
	a = 10;
	b = 7;

	// a �� b ���� ũ��.
	printf("a > b : %d\n", a > b);
	// a �� b ���� ũ�ų� ����.
	printf("a >= b : %d\n", a >= b);
	// a �� b ���� �۴�.
	printf("a < b : %d\n", a < b);
	// a �� b ���� �۰ų� ����.
	printf("a <= b : %d\n", a <= b);
	// a �� b �� ����.
	printf("a == b : %d\n", a == b);
	// a �� b �� �ٸ���.
	printf("a != b : %d\n", a != b);

	// 0 <= a < 50
	printf("0 <= a < 50 : %d\n", 0 <= a < 50);
	// printf("0 <= a < 50 : %d\n", 1 < 50);
	// printf("0 <= a < 50 : %d\n", 1 );
	// C ������ �ټ��� �����ڸ� ���ÿ� ������ �� ����.
	// ���� ���� ������ ���������� �����Ѵ�.
	//--------------------------------------------
	// ���� ������
	//  - ���� ������ �����Ͽ�
	//  - ��� ���� ��(1) �Ǵ� ����(0)�� ��ȯ
	//  - �� ���ǽ��� �˻��Ͽ� �ϳ��� ����� ���� �� ���
	//  - ������ ���ǽ��� ���� �� ���
	//  - ��𸣰��� ��Ģ, ī����� ���� ����
	//			������ �������� ���� �ۼ��ϰų� �����ϰ� �ۼ��� �� �ִ�.
	
	// 0 <= a < 50
	//  ���� ǥ������ C ������ �� �� ���� ������ ���� �����ڷ� ǥ��
	//  �� ���� �������� �������Ѵ�.
	//   - a �� 0 ���� ũ�ų� ����.  �� a >= 0 
	//   - a �� 50 ���� �۴�.          �� a < 50
	a = 10;
	b = 0;
	printf("0 <= a < 50 : %d\n", (a >= 0) && (a < 50));

	// a �� 10 ���� ũ�ų� b �� 10 ���� ũ��.
	printf("a > 10 or b > 10 : %d\n", (a > 10) || (b > 10));

	printf("10 && 0 : %d\n", 10 && 0);
	printf("10 && 5 : %d\n", 10 && 5);
	//----------------------------------------------------
	// ���� ������(���� ������)
	//  - �� �����ڿ� ���� �����ڸ� ���� ���ǽ��� ǥ��
	//  - ���ǽ��� ����� ���� ǥ���� �����Ͽ� ��ȯ�ϴ� ������
	//  - ǥ����
	//			���ǽ� ? ���ΰ�� ��ȯ�� ǥ���� : ������ ��� ��ȯ�� ǥ����;
	a = 10;
	b = 5;
	// a �� b �߿� ���� ���� ���
	min = (a < b) ? a : b;
	printf("The smaller of %d and %d is %d.\n", a, b, min);

	// a �� b �߿� ū ���� ���
	max = (a > b) ? a : b;
	printf("The greater of %d and %d is %d.\n", a, b, max);

	return 0;
}