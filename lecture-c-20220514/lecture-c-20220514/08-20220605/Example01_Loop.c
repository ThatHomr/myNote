#include <stdio.h>

/*
	File Name		: Example01_Loop.c
	Data	    	: 2022.06.05
*/

	// n의 정수를 입력받아
	// n개의 *로 직각삼각형을 그려라
	// Enter the number of rows: 7
	//         *
	//        **
	//       ***
	//      ****
	//     *****
	//    ******
	//   *******
	//

	//d2 cording 폰트로 할것
int main()
{
	// 행의 수와 열의 수가 같기 때문에
	// 삼각형을 출력하기 위한
	// 공백(space)과 별(star)의 총합도
	// 모든 행이 동일하다.
	
	// 사용자가 입력한 행의 수
	int rows;
	// 각 행에 출력할 공백의 수
	int spaces;
	// 각 행에 출력할 별의 수
	int stars;

	printf("Enter the number of rows >>> ");
	scanf("%d", &rows);

	// 삼각형을 출력하기 위해 rows 줄 수 만큼 출력
	//  - i 의 값이 1부터 rows 까지 1씩 증가
	//  - i = 1, 2, ..., rows
	for (int i = 1; i <= rows; i++)
	{
		printf("%d : ", i);
		// i 의 값과 행에 출력할 별의 개수와 같다.
		stars = i;
		// spaces + stars = rows
		// spaces = rows - stars
		spaces = rows - i;
		// printf("space = %d, stars = %d", spaces, stars);

		// 공백의 수만큼 공백을 출력
		for (int j = 0; j < spaces; j++) printf(" ");

		// 별의 수만큼 별을 출력
		for (int j = 0; j < stars; j++) printf("*");

		printf("\n");
	}



	return 0;
}