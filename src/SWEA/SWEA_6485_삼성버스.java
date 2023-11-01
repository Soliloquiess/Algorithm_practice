package SWEA;

import java.util.Scanner;

public class SWEA_6485_»ï¼º¹ö½º {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
        int N, i, j, P, C, count;
        int[] A, B;
        for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            A = new int[N+1];
            B = new int[N+1];
            for(i=1; i<=N; i++) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }
            P = sc.nextInt();
            System.out.format("#%d", test_case);
            for(i=1; i<=P; i++) {
                C = sc.nextInt();
                count = 0;
                for(j=1; j<=N; j++) {
                    if(A[j] <= C && C <= B[j]) count++;
                }
                System.out.format(" %d", count);
            }
            System.out.println();
        }
        sc.close();
    }
}