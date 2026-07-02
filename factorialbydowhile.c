#include <stdio.h>

int main() {
    int n, i = 1, fact = 1;

    printf("Enter a number: ");
    scanf("%d", &n);

    do {
        fact = fact * i;
        i++;
    } while (i <= n);

    printf("Factorial = %d", fact);

    return 0;
}