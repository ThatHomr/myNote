#include <stdio.h>

/*
	File Name		: Example02_Loop.c
	Data			: 2022.06.05
*/

int main()
{
	int rows;
	int star;
	int space;

	printf("Enter the number of rows >>> ");
	scanf("%d", &rows);
	
	for (int j = 0; j <= rows; j++)
	{
		space = 0;
		star = rows - j;

		for (int i = star; i > 0; i--) printf("*");

		for (int i = 0; i <= rows; i++) printf(" ");

		printf("\n");
	}
	/*
		for (int i = rows; i >= 1; i--)
	{
		star = i;
		space = rows - star;

		for (int j = 0; j < star; i++) printf("*");
		for (int j = 0; j < space; i++) printf(" ");

		printf("\n");
	}
	*/

	return 0;
}