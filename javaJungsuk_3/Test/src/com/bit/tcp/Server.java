package com.bit.tcp;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server extends Thread {
	static Map<Integer,PrintStream> list=new HashMap<>();
	BufferedReader br;
	
	public Server(InputStream is) {
		br=new BufferedReader(new InputStreamReader(is));
		
	}
	
	public void sayAll(String msg) {
		Iterator<Integer> ite = list.keySet().iterator();
		while(ite.hasNext()) {
			PrintStream ps=list.get(ite.next());
			ps.println(msg);
			ps.flush();
		}
	}
	
	public void sayOne(String msg) {
			PrintStream ps=list.get(hashCode());
			ps.println(msg);
			ps.flush();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg=br.readLine();
				if(msg.startsWith("#")) {
					sayAll(hashCode()+":"+msg.substring(1));
				}else {
					sayOne(hashCode()+":"+msg.substring(msg.indexOf('#')+1));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		ServerSocket serv=null;
		Socket sock=null;
		try {
			serv=new ServerSocket(5000);
			while(true) {
				sock=serv.accept();
				Server thr=new Server(sock.getInputStream());
				list.put(thr.hashCode(),new PrintStream(sock.getOutputStream()));
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
