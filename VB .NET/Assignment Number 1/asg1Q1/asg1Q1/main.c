#include <stdio.h>
int main() {
	int intinput;
	float floatinput;
	char charinput;
	char name[50];
	printf("enter int input: ");
	scanf("%i", &intinput);
	printf("enter float input: ");
	scanf("%f", &floatinput);
	printf("enter char input: ");
	scanf(" %c", &charinput);
	printf("enter string input: ");
	scanf(" %s", name);
	printf("Displaying the Data\n\n");
	printf("Integer input is: %i", intinput);
	printf("Float input is: %f", floatinput);
	printf("Char input is: %c", charinput);
	printf("String input is: %s", name);
}