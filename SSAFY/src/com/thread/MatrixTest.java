package com.thread;

class Table
{
	synchronized void printTable(int num)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.println(num*i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}		
	}
}

class Matrix extends Thread{
	//자신이 출력해야 되는 단 정보
	int num;
	
	Table t;
	public Matrix(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(5);
	}
}




public class MatrixTest 
{
	public static void main(String args[]) throws InterruptedException {
		{
			Table obj = new Table();
			Matrix m1 = new Matrix(obj);
			m1.start();
		}
	}	
}
