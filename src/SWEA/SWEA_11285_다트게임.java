package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;
import java.lang.Math;
  
public class SWEA_11285_다트게임
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
  
        for(int test_case = 1; test_case <= T; test_case++)
        {
            System.out.print("#"+test_case+" ");
            int dart = sc.nextInt();
            int answer =0;
            for(int i=0; i<dart; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
                if(dist<=20){answer+= 10;}
                else if(dist>20 && dist<=40){answer+=9;}
                else if(dist>40 && dist<=60){answer+=8;}
                else if(dist>60 && dist<=80){answer+=7;}
                else if(dist>80 && dist<=100){answer+=6;}
                else if(dist>100 && dist<=120){answer+=5;}
                else if(dist>120 && dist<=140){answer+=4;}
                else if(dist>140 && dist<=160){answer+=3;}
                else if(dist>160 && dist<=180){answer+=2;}
                else if(dist>180 && dist<=200){answer+=1;}
            }
            System.out.println(answer);
  
        }
    }
}