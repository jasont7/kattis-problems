#include <stdio.h>
#include <math.h>

int main() {

    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    while (a + b + c != 0) {
        if (c < a || c < b) {
            if (b < a) {
                if (sqrt((a*a) - (b*b)) == c)
                    printf("right\n");
                else printf("wrong\n");
            } else if (b > a) {
                if (sqrt((b*b) - (a*a)) == c)
                    printf("right\n");
                else printf("wrong\n");
            } else {
                printf("wrong\n");
            }
        } else {
            if (sqrt((a*a) + (b*b)) == c)
                printf("right\n");
            else printf("wrong\n");
        }
        scanf("%d %d %d", &a, &b, &c);
    }

    return 0;
}