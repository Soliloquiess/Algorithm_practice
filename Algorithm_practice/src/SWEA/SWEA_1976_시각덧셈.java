package SWEA;


import java.io.*;
import java.util.StringTokenizer;

public class SWEA_1976_½Ã°¢µ¡¼À {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			
			int hour = h1+h2;
			if(hour > 12) hour -= 12;
            
			int minute = m1+m2;
			if(minute > 60) {
				minute -= 60;
				hour += 1;
			}
			
			System.out.println("#"+tc+" "+hour+" "+minute);
		}
	}

}