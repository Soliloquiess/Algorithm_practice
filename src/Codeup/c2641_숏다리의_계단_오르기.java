package Codeup;

import java.util.Scanner;

public class c2641_숏다리의_계단_오르기 {

	static Scanner sc = new Scanner(System.in);
	
	static int n = sc.nextInt();
	static int result = 0;
	int total;
	public static int  count_stair(int total, int check3){
	    
	
	    check3 -= 1 ;
	
	    if (n == 0)  return 0;
	
	    if (n - total >= 1)  count_stair(total+1, check3);  
	    if (n - total >= 2) count_stair(total+2, check3);
	    if (n - total >= 3 && check3 <= 0) count_stair(total+3, 3);
	    
	    else if (total == n) result += 1;
		return check3;
	}
	public static void main(String[] args) {
		
	
		count_stair(0, 0);
		
		System.out.print(result);
	}
}



