#include <stdio.h>

/*
	File Name		: Example02_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	// ���� time�� ����� �ð�(s)��
	// ��ð� ��� �������� ���

	int time = 7895; // ���� : ��(s)
	// 1h = 60m = 3600s
	// 1m = 60s

	int hour = time / 3600;						// �ð�
	int minute = (time % 3600) / 60;		// ��
	// int minute = (time / 60) % 60;
	int second = time % 60;					// ��

	printf("%d��\n", time);
	printf("%d�ð� %d�� %d��\n", hour, minute, second);

	return 0;

}