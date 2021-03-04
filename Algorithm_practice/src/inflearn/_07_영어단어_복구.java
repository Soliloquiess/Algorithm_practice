package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07_영어단어_복구 {
	public static void main(String[] args) throws IOException {
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char [] a = new char [101];
		char [] b = new char [101];
		int i, p = 0;
		String str = br.readLine();
		str = str.replaceAll(" ", "");

		System.out.println(str.toLowerCase());
		
	}

}
