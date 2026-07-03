#include <stdio.h>

int main() {
    int num, i = 1;
    long  long fact = 1;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (num < 0) {
        printf("Factorial is not defined for negative numbers.\n");
    } else {
        do {
            fact *= i;
            i++;
        } while (i <= num);

        printf("Factorial = %lld\n", fact);
    }

    return 0;
}