package SWEA;


import java.util.StringTokenizer;
import java.io.*;

public class SWEA_1204_SW문제해결_기본_1일차_최빈수_구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int num = Integer.parseInt(br.readLine());
			int[] count = new int[101];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int score = 0;
			for(int i=0; i<1000; i++) {
				score = Integer.parseInt(st.nextToken());
				count[score] += 1;
			}
			
			int max = 0; //최댓값을 저장
			int ans = 0; //최댓값을 가지고 있는 index(점수)
			for(int i=0; i<101; i++) {
				if(max <= count[i]) {
					max = count[i];
					ans = i;
				}
			}
			
			System.out.println("#"+tc+" "+ans);
		}
	}

}


/*

import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T, x, xx;
        T = sc.nextInt();
        
        int[] counts;
        int max_count, i, num, max_num;
        for(xx=0; xx<T; xx++) {
            x = sc.nextInt();
            counts = new int[101];
            max_count = 0;
            for(i=0; i<1000; i++) {
                num = sc.nextInt();
                counts[num]++;
                if( counts[num] > max_count ) max_count = counts[num];
            }
            max_num = -1;
            for(i=0; i<101; i++) {
                if( counts[i] != max_count ) continue;
                max_num = i;    
            }
            System.out.format("#%d %d\n", x, max_num);
        }
    }
}

*/