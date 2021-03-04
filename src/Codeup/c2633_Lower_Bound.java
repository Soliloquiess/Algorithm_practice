package Codeup;


import java.util.Scanner;

public class c2633_Lower_Bound {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 1;
		int no = 1;
 		for(int i=0; i<n; i++) {
			if(arr[i]>=k) {
				System.out.println(count);
				break;
			}
			if(arr[i]<k) {
				count++;
				no++;
			}
			if(no==n) {
				System.out.println(n+1);
				break;
			}
		}
		
		scan.close();
	}

}
