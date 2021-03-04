package Codeup;


import java.util.Scanner;

public class c2650_디지털도어락 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = Math.min(Math.min(a, b), c);
		
		for(int i=min; i>=1; i--) {
			if(a%i==0 && b%i==0 && c%i==0) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
		
	}

}