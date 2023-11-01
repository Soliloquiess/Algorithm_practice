package SWEA;

//public class SWEA_1979_어디에_단어가_들어갈_수_있을까 {
//

import java.util.*;

public class SWEA_1979_어디에_단어가_들어갈_수_있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int l = sc.nextInt();
			int[][] map = new int[n][n];
			int words = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < n; i++) {
				int cnt = 0;
				for(int j = 0; j < n; j++) {
					if(map[i][j] == 0) {
						if(cnt == l)
							words++;
						cnt = 0;
					}
					else
						cnt++;
				}
				if(cnt == l)
					words++;
			}
			
			for(int j = 0; j < n; j++) {
				int cnt = 0;
				for(int i = 0; i < n; i++) {
					if(map[i][j] == 0) {
						if(cnt == l)
							words++;
						cnt = 0;
					}
					else
						cnt++;
				}
				if(cnt == l)
					words++;
			}
			System.out.println("#" + t + " " + words);
		}
	}
}

