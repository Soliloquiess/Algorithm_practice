package SWEA;

import java.util.Scanner;

public class SWEA_11387_몬스터사냥 {

	static int T;
	static int D, L, N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			D = sc.nextInt();
			L = sc.nextInt();
			N = sc.nextInt();

			int n = 0;
			int damage = 0;
			while (n != N) {
				damage += D + D / 100 * n * L;
				n++;
			}

			System.out.printf("#%d %d\n", i, damage);
		}
	}

}

/*
계산해보니까 규칙은 등차수열이였따
int size;
double l,n,d,sum;
size = sc.nextInt();
for(int t=  0; t<size;t++){
sum =0; 
d=sc.nextInt();
l=sc.nextInt();
n=sc.nextInt();
sum ++d*n;
sum += d*((n/2.0)*(l/100.0*(n-1));
sout(t+1,sum);

*/