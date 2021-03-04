package BOJ;
import java.util.*;

public class BOJ_2442_별찍기5 {
	
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<2*n;j++) {
				if(j>=n-i && j<=n+i) { // 중앙을 기준으로 +-i 범위에서는 별을 찍는다.
					System.out.print("*");
				}else { // 아닌 경우는 앞 자리에 공백을 채워준다.
					System.out.print(" ");
				}
				if(j> n+i) break; // j가 별의 범위를 넘어서는 순간 반복문을 벗어난다.
			}			
			System.out.println();
		}
		
		
	}
	
}