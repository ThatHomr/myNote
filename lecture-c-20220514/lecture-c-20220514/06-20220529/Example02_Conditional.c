#include <stdio.h>

/*
	File Name		: Example02_Conditional.c
	Data					: 2022.05.29
*/

int main()
{
	// �Է¹��� ������ �Ʒ� ���ǿ� ���� ����� ��µǵ��� �ۼ�
	//		3�� ����� ��� : "Fizz"
	//		5�� ����� ��� : "Buzz"
	//		3�� ����̸鼭 5�� ����� ��� : "FizzBuzz"
	//		�� ���� ��� : �Է¹��� ����

	int num = 0;

	printf("Enter is integer >>>\n");
	scanf("%d", &num);

	if ((num % 3 == 0) && (num % 5 == 0))
		printf("FizzBuzz");
	else if (num % 3 == 0)
		printf("Fizz");
	else if (num % 5 == 0)
		printf("Buzz");
	else
		printf("%d", num);



	return 0;
}