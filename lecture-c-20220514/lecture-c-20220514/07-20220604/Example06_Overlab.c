#include <stdio.h>

/*
	File Name		: Example06_Overlab.c
	Data					: 2022.06.04
*/

int main()
{
	/*
	for (int day = 1; day <= 20; day++) 
	{
		for (int hour = 1; hour <= 3; hour++) 
		{
			printf("%d일차 %d교시 입니다.\n", day, hour);
			printf("====================\n");
		}
	}
	*/
	int day = 1;
	int hour = 1;

	while (day <= 20)
	{
		hour = 1;
		while (hour <= 3)
		{
			printf("%d일차 %d교시 입니다.\n", day, hour);
			hour++;
		}
		day++;
		printf("====================\n");

	}

	return 0;
}