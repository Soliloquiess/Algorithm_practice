package Codeup.src.Codeup;


import java.util.Scanner;

public class c_2625_삼각화단만들기_small {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int a = 1; a < n ;a++) {
            for(int b =1; b < n;b++) {
                for(int c = 1;c < n;c++) {
                    if(a <= b && b <= c && a+b>c && a+b+c == n)
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}