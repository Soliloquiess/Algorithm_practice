package BOJ;

import java.util.Scanner;

public class BOJ_2477_Âü¿Ü¹ç {

	static int num, a;
	static int length[][] =new int[6][2];
	static int area=1;
	static int minarea = 1;
	public static void main(String[] args) {
	{
	
		Scanner sc=  new Scanner(System.in);
		
		
		num = sc.nextInt();
	
		for (int i = 0; i < 6; i++) {
			length[i][0] = sc.nextInt();
			length[i][1] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			if (area < length[i][1] * length[(i + 1) % 6][1]) {
				area = length[i][1] * length[(i + 1) % 6][1];
				a = i;
			}
		}
			minarea = length[(a + 3) % 6][1] * length[(a + 4) % 6][1];
			System.out.print( (area - minarea) * num);
		}
	}
}