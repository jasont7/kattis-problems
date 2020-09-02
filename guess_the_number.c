#include <stdio.h>
#include <string.h>

int main() {

    int low = 0;
    int high = 1001;
    char buf[7];
    for (int i=0; i < 10; i++) {
        printf("%d\n", low + (high-low)/2);
        fflush(stdout);
        scanf("%s", buf);
        if (strcmp(buf,"lower") == 0) {
            high -= (high-low)/2;
        } else if (strcmp(buf,"higher") == 0) {
            low += (high-low)/2;
        } else if (strcmp(buf,"correct") == 0) return 0;
    }

    return 0;
}