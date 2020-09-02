#include <stdio.h>

int main() {

    int x;
    scanf("%d", &x);

    for (int i=0; i<x; i++) {
        int n, t;
        scanf("%d", &n);
        double largest = 0;
        int largestInd;
        double total = 0;
        int tie = 0;
        for (int i=0; i<n; i++) {
            scanf("%d", &t);
            total += t;
            if (t > largest) {
                largest = t;
                largestInd = i+1;
                tie = 0;
            } else if (t == largest)
                tie = 1;
        }
        if (tie == 1)
            printf("no winner\n");
        else if (largest > total/2)
            printf("majority winner %d\n", largestInd);
        else if (largest <= total/2)
            printf("minority winner %d\n", largestInd);
    }

    return 0;
}