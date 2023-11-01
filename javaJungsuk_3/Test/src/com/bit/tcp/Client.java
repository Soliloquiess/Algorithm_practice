package com.bit.tcp;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client extends Frame implements Runnable{
	TextArea ta;
	InputStream is;
	
	public Client(InputStream is) {
		this.is=is;
		ta=new TextArea();
		add(ta);
		setSize(300,200);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Socket sock=null;
		OutputStream os=null;
		PrintStream ps=null;
		try {
			sock=new Socket("localhost",5000);
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			Client me=new Client(sock.getInputStream());
			Thread thr=new Thread(me);
			thr.start();
			while(true) {
				System.out.print("모두 #메시지, 귓말 번호#메시지>");
				ps.println(sc.nextLine());// 
				ps.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		BufferedReader br=null;
		
		try {
			br=new BufferedReader(new InputStreamReader(is));
			while(true) {
				String msg=br.readLine();
				ta.append("\n"+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}














