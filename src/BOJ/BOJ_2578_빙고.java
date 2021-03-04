package BOJ;


import java.io.InputStream;
	
import java.util.Scanner;
	
public class BOJ_2578_ºù°í {
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int a[][] = new int[27][27] ;
	    int b[][] = new int[27][27];
	    for (int i = 1; i <= 25; i++)
	        for (int j = 1; j <= 25; j++)
	        {
	            a[i][j] = sc.nextInt();
	            b[i][j] = 0;
	        }

	    for (int i = 1; i <= 25; i++) {
	        for (int j = 1; j <= 25; j++)
	        {
	            b[i][j] = a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
	            if (a[i][j] == 0)
	                b[i][j] = b[i][j] == 3 ? 1 : 0;
	            else
	                b[i][j] = (b[i][j] >= 4 || b[i][j] <= 1) ? 0 : 1;
	           System.out.print(b[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}




