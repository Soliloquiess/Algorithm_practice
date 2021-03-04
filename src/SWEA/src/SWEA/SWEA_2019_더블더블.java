package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2019_더블더블 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N>30) {return;}
		for(int i =0; i<=N;i++) {
			System.out.print((int)Math.pow(2, i) +" ");
		}
		
	}
}
