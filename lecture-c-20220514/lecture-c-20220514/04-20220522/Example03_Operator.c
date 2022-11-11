#include <stdio.h>

/*
	File Name		: Example03_Operator.c
	Data					: 2022.05.22
*/

int main()
{
	int score = 90;
	// 점수가 70점 이상이면 "pass" 출력하고
	// 그렇지 않으면 "fail" 을 출력
	char* passStatus = (score >= 70) ? "PASS" : "FAIL";
	
	printf("Score : %d\n", score);
	printf("A Passing Result : %s\n", passStatus);


	return 0;
}