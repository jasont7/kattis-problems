import java.util.Arrays;
import java.util.Scanner;

public class ColoringSocks {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        int n = console.nextInt();
        int cap = console.nextInt();
        int diff = console.nextInt();
        int[] A = new int[n];
        for (int i=0; i < n; i++) {
            A[i] = console.nextInt();
        }
        Arrays.sort(A);
        
        int cg = 1; 
        int ccg = 0;
        int min = A[0];
        for (int i=0; i<n; i++) {
            if (ccg == cap || A[i]-min > diff) {
                cg++;
                ccg = 0;
                min = A[i];
            }
            ccg++;
        }
        System.out.print(cg);
    }
}