#include <stdio.h>

/*
	File Name		: Example02_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	// 변수 time에 저장된 시간(s)이
	// 몇시간 몇분 몇초인지 출력

	int time = 7895; // 단위 : 초(s)
	// 1h = 60m = 3600s
	// 1m = 60s

	int hour = time / 3600;						// 시간
	int minute = (time % 3600) / 60;		// 분
	// int minute = (time / 60) % 60;
	int second = time % 60;					// 초

	printf("%d초\n", time);
	printf("%d시간 %d분 %d초\n", hour, minute, second);

	return 0;

}