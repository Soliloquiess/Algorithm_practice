package SWEA;
import java.util.Scanner;

public class SWEA_2001_ÆÄ¸®ÅðÄ¡ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][n];
            int i, j, k, l;
            for(i=0; i<n; i++) {
                for(j=0; j<n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int sum, max = 0;
            for(i=0; i<=n-m; i++) {
                for(j=0; j<=n-m; j++) {
                    sum = 0;
                    for(k=0; k<m; k++) {
                        for(l=0; l<m; l++) {
                            sum += a[i+k][j+l];
                        }    
                    }
                    if( sum > max ) max = sum;
                }
            }
            System.out.format("#%d %d\n", t, max);
        }
    }
}