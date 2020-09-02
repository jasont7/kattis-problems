#include <stdio.h>
#include <stdlib.h>

int main() {

    long long n1, n2;
    while(scanf("%lld %lld", &n1, &n2) == 2) {
        printf("%lld\n", llabs(n1-n2));
    }

    return 0;
}