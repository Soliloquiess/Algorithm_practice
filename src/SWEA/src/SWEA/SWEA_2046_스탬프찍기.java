package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2046_½ºÅÆÇÁÂï±â {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n>100000) {return;}
		for(int i =0; i<n;i++) {
			System.out.print("#");
		}
	}
}
