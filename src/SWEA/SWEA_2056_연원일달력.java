package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SWEA_2056_연원일달력 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = scan.nextInt();
        int T = Integer.parseInt(br.readLine());
        int lim[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=0; i<T; i++) {
            int ymd = Integer.parseInt(br.readLine());
 
            int year = ymd/10000;
            int month = (ymd-year*10000)/100;
            int day = ymd%100;
            
            if ((month<1 || month>12) || (day<1 || day>lim[month-1]))
                System.out.printf("#%d -1\n", i+1);
            else
                System.out.printf("#%d %04d/%02d/%02d\n", i+1,year,month,day);
        }
//        scan.close();
    }

}


