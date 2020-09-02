#include <stdio.h>

int main() {

    int c;
    scanf("%d", &c);
    while (c-- > 0) {
        int n;
        scanf("%d", &n);

        double sum = 0;
        double average;
        double grades[n];
        for (int i=0; i<n; i++) {
            scanf("%lf", &grades[i]);
            sum += grades[i];
        }
        average = sum/n;

        double num_above = 0;
        double percent_above;
        for (int i=0; i<n; i++) {
            if (grades[i] > average)
                num_above++;
        }
        percent_above = (num_above/n)*100;
        printf("%.3f%%\n", percent_above);
    }

    return 0;
}