#include <stdio.h>

/*
	File Name		: Example03_Conditional.c
	Data					: 2022.05.29
*/

int main()
{
	// �ð��� �Է��� �ް�
	// �˶��� �︮�� ���� Ÿ�̸�(m)�� �Է¹޾Ƽ�
	// ���� �˶��� �︮���� �ð��� ���

	int hour, minute;
	int timer;

	printf("Enter the current time >>> \n");
	scanf("%d %d", &hour, &minute);

	printf("Enter a timer >>> \n");
	scanf("%d ", &timer);

	minute += timer;
	hour += (minute / 60);
	hour %= 24;
	minute %= 60;

	printf("%02d : %02d\n", hour, minute);



/* ��Ǯ�� Ʋ��
	int time_01;

	printf("Enter the current time >>> \n");
	scanf("%d %d", &hour, &minute);
	
	printf("Enter a timer >>> \n");
	scanf("%d ", &timer );

	time_01 = minute + timer;

	if (time_01 >= 60)
	{
		time_01 -= 60;
		if (hour >= 23)
		{
			hour = 0;
		}
		else
		{
			hour++;
		}
	}
	else
		time_01 = time_01;

	printf("%02d : %02d\n", hour, minute);
	*/

	return 0;
}