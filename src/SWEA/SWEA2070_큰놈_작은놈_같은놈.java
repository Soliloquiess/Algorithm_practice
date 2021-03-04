package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2070_Å«³ð_ÀÛÀº³ð_°°Àº³ð {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T= Integer.parseInt(br.readLine());
		for(int i =1; i<=T; i++) {
			
			st= new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A>B) { System.out.printf("#%d >\n",i);}
			if(A==B) { System.out.printf("#%d =\n",i);}
			if(A<B) { System.out.printf("#%d <\n",i);}
			
		}			
	}
}


	


