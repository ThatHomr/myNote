#include <stdio.h>

/*
	File Name		: Example03_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	int score = 90;
	// ������ 70�� �̻��̸� "pass" ����ϰ�
	// �׷��� ������ "fail" �� ���
	char* passStatus = (score >= 70) ? "PASS" : "FAIL";
	
	printf("Score : %d\n", score);
	printf("A Passing Result : %s\n", passStatus);


	return 0;
}