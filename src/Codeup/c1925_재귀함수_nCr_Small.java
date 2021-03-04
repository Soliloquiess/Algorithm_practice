package Codeup;

import java.util.Scanner;

public class c1925_Àç±ÍÇÔ¼ö_nCr_Small {
	static Scanner sc = new Scanner(System.in);
	public static int nCr(int a, int b)
	{
		if(b==0||b==a){
			return 1;
		}
		return nCr(a-1,b-1)+nCr(a-1,b);
	}
	
	public static void main(String[] args) {
		int n,r; 
		n = sc.nextInt();
		r = sc.nextInt();
		System.out.printf("%d",nCr(n,r)); 
	}
	
}