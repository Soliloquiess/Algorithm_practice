package SWEA;

import java.util.*;
	public class SWEA_6057_그래프삼각형 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int T;
	        T=sc.nextInt();
	         
	        int N, M;
	        int x, y;
	        int i, j, k, count;
	        int[][] map;
	        for(int test_case = 1; test_case <= T; test_case++) {
	            N = sc.nextInt();
	            M = sc.nextInt();
	            map = new int[51][51];
	            for(i=1; i<=M; i++) {
	                x = sc.nextInt();
	                y = sc.nextInt();
	                map[x][y] = 1;
	                map[y][x] = 1;
	            }
	            count = 0;
	            for(i=1; i<=N; i++) {
	                for(j=i+1; j<=N; j++) {
	                    if(map[j][i] == 0 ) continue;
	                    for(k=j+1; k<=N; k++) {
	                        if(map[k][i] == 0 ) continue;
	                        if(map[k][j] == 0 ) continue;
	                        count++;
	                    }
	                }
	            }
	            System.out.format("#%d %d\n", test_case, count);
	        }
	        sc.close();
	    }
	}