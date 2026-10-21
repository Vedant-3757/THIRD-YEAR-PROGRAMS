#include <stdio.h>
int main(){
    int a;
    float b;
    char c;
    char str[20];
    printf("Enter an integer: ");
    scanf("%d", &a);
    printf("Enter a float: ");
    scanf("%f", &b);
    printf("Enter a character: ");  
    scanf(" %c", &c);
    printf("Enter a string: ");
    scanf("%s", str);
    printf("Integer: %d\n", a);
    printf("Float: %f\n", b);
    printf("Character: %c\n", c);
    printf("String: %s\n", str);
}