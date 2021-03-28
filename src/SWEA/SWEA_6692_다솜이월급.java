package SWEA;

import java.util.*;
public class SWEA_6692_다솜이월급 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int TT, tt;
        TT = sc.nextInt();
        
        int N, i, x;
        float sum, p;
        for(tt=1; tt<=TT; tt++) {
            N = sc.nextInt();
            sum = 0;
            for(i=0; i<N; i++) {
                p = sc.nextFloat();
                x = sc.nextInt();
                sum += p*x;
            }
            System.out.format("#%d %f\n",tt,sum);
        }
    }
}