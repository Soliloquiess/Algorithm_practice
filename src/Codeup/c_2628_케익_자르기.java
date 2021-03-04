package Codeup;

import java.util.Scanner;

public class c_2628_케익_자르기 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		    int a, b, c, d, t;
//		    scanf("%d%d%d%d", &a, &b, &c, &d);
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    d=sc.nextInt();
		    if (a < b) {
		    	t = a; a = b; b = t;    // a와 b의 크기가 반대라면 swap! 
		    }
		    
		    int k = 0;    // k : a와 b 사이에 있는 점의 개수 
		    if (a < c || c < b) k++; 
		    if (a < d || d < b) k++;
		    
		    System.out.print(k == 1 ? "cross" : "not cross");  // k == 1이면 Cross, 아니면 Not Cross 
		   

	}
}
