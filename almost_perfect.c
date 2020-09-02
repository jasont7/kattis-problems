#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void perfect(int n) {
    int sq = (int) sqrt(n);
    int sumOfFactors = 1;
    for (int i=2; i <= sq; i++) {
        if (n % i == 0) {
            int other = n / i;
            if (other != i)
                sumOfFactors += other;
            sumOfFactors += i;
        }
    }

    if (sumOfFactors == n)
        printf("%d perfect\n", n);
    else if (abs(n-sumOfFactors) <= 2)
        printf("%d almost perfect\n", n);
    else
        printf("%d not perfect\n", n);
}

int main() {

    int n;
    while (scanf("%d", &n) == 1)
        perfect(n);

    return 0;
}