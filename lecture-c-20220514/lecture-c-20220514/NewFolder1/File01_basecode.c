#include <stdio.h>
#include <stdlib.h> // rand함수를 사용하기 위한 헤드 파일



int main()
{
	int num = 0; // 자신이 입력한 보너스 번호를 저장하기 위한 변수
	printf("*** 로또 프로그램을 시작합니다. ***\n");
	printf("5개의 랜덤한 번호와 당신이 입력할 1개 수동 번호가 출력됩니다.\n");
	printf("당신이 넣을 보너스 번호(1 ~ 45) 숫자를 입력 후 Enter를 클릭해주세요\n");
	
	scanf("%d", &num);

	// 1 ~ 45 범위 외 숫자를 입력시 다시 입력
	while (!((num > 0) && (num < 46)))  
	{
		printf("보너스 숫자를 잘못 입력하셨습니다.\n");
		printf("다시 보너스숫자(1~45)를 입력해주세요");
		scanf("%d", &num);
	}

	// 로또 자동번호 5개를 저장하기 위한 5개 크기의 배열 생성 및 초기화
	int lotto[ 5 ] = { 0 };

	printf("수동 : %d \n", num);
	printf("자동 : ");

	// 자동번호 생성
	for (int i = 0; i < 5; i++)
	{
		int ran = rand() % 45 + 1;
		// rand() % 45 는 범위가 0 ~ 44 이기때문에 +1
		
		lotto[i] = ran;

		// 생성된 숫자와 수동숫자 중복시 재추첨
		if (lotto[i] == num)
		{
			ran = rand() % 45 + 1;
			lotto[i] = ran;
		}

		// 생성된 숫자와 자동숫자, 수동숫자 중복시 재추첨
		for (int j = 1; j <= 5; j++)
		{
			if (lotto[j] == lotto[i])
			{
				ran = rand() % 45 + 1;
				lotto[i] = ran;
			}
			if (lotto[i] == num)
			{
				ran = rand() % 45 + 1;
				lotto[i] = ran;
			}
		}
	}

	// 출력을 위한 반복문
	for (int i = 0; i < 5; i++) {
		printf("%d ", lotto[i]);
	}

	printf("\n");
	printf("당첨되길 바랍니다!\n");

	return 0;
}