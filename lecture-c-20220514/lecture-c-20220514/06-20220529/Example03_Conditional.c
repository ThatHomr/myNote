#include <stdio.h>

/*
	File Name		: Example03_Conditional.c
	Data					: 2022.05.29
*/

int main()
{

	// 시간을 입력을 받아서
	// 45분 전의 시간을 출력
	// (24시간 기준, 00 : 00 ~ 23 : 59)

	int hour, minute;
	hour = 0;
	minute = 0;

	printf("Time >>> ");
	scanf("%d %d", &hour, &minute);
	
	// case  1
	//		 5 50
	//	>> 5 05

	// case  2
	//		 5 30
	//	>> 4 45

	// case  3
	//		 0 10
	//	>> 23 25
	if (minute < 45)
	{
		if (hour == 0)
			hour = 23;
		else
			hour--;
	}
	else
	{
		minute -= 45;
	}
	/*
	if (minute >= 45)
		minute -= 45;
	else	if (minute > 45)		// minute < 45
	{
		minute = minute + 15;
		if (hour == 0)
		{
			hour = 23;
		}
		else
		{
			hour--;
		}
	}
	*/
	/*if (minute >= 45)
		minute -= 45;
	else	if (hour > 0)		// minute < 45
	{
		minute = minute + 15;
		hour--;
	}
	else                         // hour <= 0 && minute < 45
	{
		minute = minute + 15;
		hour = 23;
	}
	*/
	printf("%02d : %02d", hour, minute);
	
	/* 내 풀이 오류 미해결
	if (minute >= 45)
	{	
		minute = minute - 45;
		printf("%2d %2d", hour, minute);
	}
	else if ((minute < 45) && (hour == 0))
	{
		minute = minute + (60 - 45);
		hour = 23;
		printf("%2d %2d", hour, minute);
	}
	else if (minute < 45)
	{
		minute = minute + (60 - 45);
		hour = hour -1;
		printf("%2d %2d", hour, minute);
	}
	*/
	/*
	if (totalMinute < 0)
		totalMinute += (1440); // 60 * 24

	hour = totalMinute / 60;
	minute = totalMinute % 60;
	printf("%02d : %02d\n", hour, minute);
	*/
	return 0;
}