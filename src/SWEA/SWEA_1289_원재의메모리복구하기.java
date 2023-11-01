package SWEA;


import java.util.Scanner;

public class SWEA_1289_원재의메모리복구하기{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int b =sc.nextInt();
        for(int j = 0; j <b; j++) {
            String s = sc.next();
            char a = '0';
            int cnt = 0;
            for(int i= 0; i < s.length(); i++)
                if(s.charAt(i) != a) {
                    cnt++;
                    a = s.charAt(i);
                }
                     
            System.out.printf("#%d %d\n",j+1,cnt);
        }
    }
}
