package Jungol;

import java.util.Scanner;

public class Jungol_1733_오목 {

static int om[][] =new int[19][19];
static Scanner sc = new Scanner(System.in);

static int win, win_x, win_y;
public static void main(String[] args) {
	

//	Scanner sc = new Scanner(System.in);
//	void scan(void); //입력 받는 함수
//	void search(void); //승패를 판단하는 함수
//	int go(int x, int y); //가로 세로 대각선 판단
	
	 	{
	    //검은색이 이겼을 경우 1, 흰색이 이겼을 경우 2
	  
	    scan();
	    search();
	  
	    System.out.printf("%d\n", win);
	    if(win!=0)
	    	System.out.printf("%d %d", win_x, win_y);
		}
	}
	private static void scan()
	{
	    int i, j;
	  
	    for(i=0; i<19; i++)
	    {
	        for(j=0; j<19; j++)
//	            scanf(" %d", &om[i][j]);
	        	om[i][j] = sc.nextInt();
	    }
	}
	private static void search()
	{
	    int i, j, a;
	  
	    for(i=0; i<19; i++)
	    {
	        for(j=0; j<19; j++)
	        {
	            if(i>14 && j>14)
	                break;
	  
	            else if(om[i][j]!=0)
	            {
	                a=go(i, j);
	  
	                if(a!=0)
	                {
	                    win=a;
	                    win_x=i+1;
	                    win_y=j+1;
	                    break;
	                }
	            }
	        }
	    }
	}
	private static int go(int x, int y)
	{
	    int i, j, h, a=0;
	    h=om[x][y]; //흰색 혹은 검은색 
	  
	    for(i=x+1; i<=(x+5) && i<19; i++) //세로줄 판단 
	    {
	        if(om[i][y]!=h) //같은 색의 바둑돌이 놓여있지 않을 경우
	            break;
	  
	        a++;
	    }
	    if(a==4) //5개의 바둑알이 된 경우
	    {
	        if(om[x-1][y]!=h) //여섯알이 아닌 경우
	            return h;
	    }
	  
	    a=0;
	    for(j=y+1; j<=(y+5) && j<19; j++) //가로줄 판단
	    {
	        if(om[x][j]!=h) //같은 색의 바둑돌이 놓여있지 않을 경우
	            break;
	  
	        a++;
	    }
	    if(a==4) //5개의 바둑알이 된 경우
	    {
	        if(om[x][y-1]!=h) //여섯알이 아닌 경우
	            return h;
	    }
	  
	    a=0;
	    for(i=x+1, j=y+1; i<=(x+5) && i<19 && j<19; i++, j++) //오른쪽 아래 방향 대각선 판단 
	    {
	        if(om[i][j]!=h) //같은 색의 바둑돌이 놓여있지 않을 경우
	            break;
	  
	        a++;
	    }
	    if(a==4) //5개의 바둑알이 된 경우
	    {
	        if(om[x-1][y-1]!=h) //여섯알이 아닌 경우 
	            return h;
	    }
	  
	    a=0;
	    for(i=x-1, j=y+1; i>=(x-5) && i>=0 && j<19; i--, j++) //오른쪽 위 방향 대각선 판단 
	    {
	        if(om[i][j]!=h) //같은 색의 바둑돌이 놓여있지 않을 경우
	            break;
	  
	        a++;
	    }
	    if(a==4) //5개의 바둑알이 된 경우
	    {
	        if(om[x+1][y-1]!=h) //여섯알이 아닌 경우 
	            return h;
	    }
	  
	    return 0;
	}
}
