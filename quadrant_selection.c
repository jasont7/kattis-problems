#include <stdio.h>

int main() {

    int x, y, q;
    scanf("%d %d", &x, &y);
    if (x < 0) {
        if (y < 0)
            q = 3;
        else if (y > 0)
            q = 2;
    } else if (x > 0) {
        if (y < 0)
            q = 4;
        else if (y > 0)
            q = 1;
    }
    printf("%d", q);

    return 0;
}