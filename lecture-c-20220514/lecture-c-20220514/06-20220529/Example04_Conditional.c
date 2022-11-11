#include <stdio.h>

/*
	File Name		: Example03_Conditional.c
	Data					: 2022.05.29
*/

int main()
{
	// 시간을 입력을 받고
	// 알람을 울리기 위한 타이머(m)를 입력받아서
	// 언제 알람이 울리는지 시간을 출력

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



/* 내풀이 틀림
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