#include <stdio.h>

/*
	File Name		: Example01_input.c
	Data					: 2022.05.22
*/

/*
	변수, 함수 등에 이름을 부여 = 식별자(Identifier)

	식별자를 작성하기 위한 규칙
	1. 영문자, 숫자, 언더바(_)만 사용
	2. 첫글자는 반드시 영문자 또는 언더바로 시작
		→ 숫자로 시작하면 안된다.
	3. 대소문자 구분이 된다. age 와 AGE 는 다른 식별자
	4. C언어의 키워드는 사용 불가능

*/



int main()
{
	// 사용자로부터 정수형태의 점수 3개를 입력을 받아서
	// 점수와 평균을 출력하는 프로그램을 작성
	//  - 평균은 소수 둘째자리까지 출력
	int score1 = 0, score2 = 0, score3 = 0;

	printf("Enter a score >>> ");

	scanf("%d %d %d", &score1, &score2, &score3);

	double avg = (score1 + score2 + score3) / 3;

	printf("score1 = %d, score2 = %d, score3 = %d, avg = %.2f\n", score1, score2, score3, avg);

	return 0;

}