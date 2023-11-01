package lab.ssafy.corona;

public class live {

	// 실습 #01

		package lab.ssafy.corona.app;
		
		public class CoronaWithoutThreadTest {
		
			public static void main(String[] args) {
				for( int t=0; t<1000; t++ ) {
					
					System.out.println("#" + t + " is Started");
					for( int i=0; i< 10000; i++ ) {
						int j = i*100;
					}
					System.out.println(t);
		
				}
			}
		}

	// 실습 #02
		
	package lab.ssafy.corona.virus;

	public class CoronaRunnable implements Runnable {
		int num;
		
		public CoronaRunnable(int num) {
			this.num = num;
		}
		
		@Override
		public void run() {
			
			System.out.println("#" + num + " is Started");
			for( int i=0; i<10000; i++ ) {
				int j = i*100;
			}
			System.out.println(num);
		}
	}

	package lab.ssafy.corona.app;

	import lab.ssafy.corona.virus.CoronaRunnable;

	public class CoronaThreadTest {

		public static void main(String[] args) {
			for( int t=0; t<1000; t++ ) {
				
				CoronaRunnable cr = new CoronaRunnable(t);
				Thread thread = new Thread(cr);
				thread.start();
				
			}
		}
	}
		
		
	// 실습 #03

	package lab.ssafy.corona.virus;

	public class CoronaThread extends Thread {
		int num;
		
		public CoronaThread(int num) {
			this.num = num;
		}
		
		@Override
		public void run() {
			
			System.out.println("#" + num + " is Started");
			for( int i=0; i< 10000; i++ ) {
				int j = i*100;
			}
			System.out.println(num);
		}
	}

	package lab.ssafy.corona.app;

	import lab.ssafy.corona.virus.CoronaThread;

	public class CoronaThreadTest {

		public static void main(String[] args) {
			for( int t=0; t<1000; t++ ) {
				
				CoronaThread thread = new CoronaThread(t);
				thread.start();
				
			}
		}
	}


	// 실습 #04

		
	package lab.ssafy.corona.app;

	public class CoronaThreadTest {

		public static void main(String[] args) {
			
			System.out.println("before Thread.sleep()");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("after Thread.sleep()");

		}
	}

	// 실습 #05

	package lab.ssafy.corona.virus;

	public class CoronaThread extends Thread {
		int num;
		
		public CoronaThread(int num) {
			this.num = num;
		}
		
		@Override
		public void run() {
			
			for( int i=0; i< 10000; i++ ) {
				if( i == 5000 && num % 2 == 0 ) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println(num);
		}
	}

	package lab.ssafy.corona.app;

	import lab.ssafy.corona.virus.CoronaThread;

	public class CoronaThreadTest {

		public static void main(String[] args) {
			
			for( int t=0; t<1000; t++ ) {
				
				CoronaThread thread = new CoronaThread(t);
				thread.start();
				
			}
		}
	}

	// 실습 #06

	package lab.ssafy.corona.virus;

	public class CoronaThread extends Thread {
		int num;
		
		public CoronaThread(int num) {
			this.num = num;
		}
		
		@Override
		public void run() {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(num);
		}
	}

	package lab.ssafy.corona.app;

	import lab.ssafy.corona.virus.CoronaThread;

	public class CoronaThreadTest {

		public static void main(String[] args) {
			
			System.out.println("Main Thread Start!!");
			
			CoronaThread thread = new CoronaThread(2020);
			thread.start();
			
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread End!!");
		}
	}

	// 실습 #07

	package lab.ssafy.corona.virus;

	public class CoronaThread extends Thread {
		int num;
		
		public CoronaThread(int num) {
			this.num = num;
		}
		
		@Override
		public void run() {
			try{
				System.out.println("thread try start"); 
				Thread.sleep(5000);  
				System.out.println("thread try end");  
			}catch(InterruptedException e){
				System.out.println("thread interrupted raised"); 
			}
			System.out.println(num);
		}
	}

	package lab.ssafy.corona.app;

	import lab.ssafy.corona.virus.CoronaThread;

	public class CoronaThreadInterruptTest {

		public static void main(String[] args) {
			CoronaThread t = new CoronaThread(2020);
			t.start();
			t.interrupt();
			
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread End!!");
		}
	}	
		
	// 실습 #08

	package lab.ssafy.corona.virus;

	public class Cell {
		public int power = 300;
	}


	package lab.ssafy.corona.virus;

	public class MedicineThread extends Thread{
		Cell cell;
		
		public MedicineThread(Cell cell) {
			this.cell = cell;
		}
		
		@Override
		public void run() {
			
			if( cell.power < 500 ) {
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				cell.power = cell.power + 100;
			}
			
			System.out.println("MedicineThread : " + cell.power);
		}
	}


	package lab.ssafy.corona.app;

	import lab.ssafy.corona.virus.Cell;
	import lab.ssafy.corona.virus.MedicineThread;

	public class MedicineThreadSyncTest {

		public static void main(String[] args) {
			Cell cell = new Cell();
			
			for( int i=0; i< 10; i++) {
				MedicineThread t = new MedicineThread(cell);
				t.start();
			}

			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	// 실습 #09

	package lab.ssafy.corona.virus;

	public class MedicineThread extends Thread{
		Cell cell;
		
		public MedicineThread(Cell cell) {
			this.cell = cell;
		}
		
		@Override
		public void run() {
			
			synchronized(cell) {
				if( cell.power < 500 ) {
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					cell.power = cell.power + 100;
				}
		
				System.out.println(cell.power);
			}
		}
	}


	package lab.ssafy.corona.app;

	import lab.ssafy.corona.virus.Cell;
	import lab.ssafy.corona.virus.MedicineThread;

	public class MedicineThreadSyncTest {

		public static void main(String[] args) {
			Cell cell = new Cell();
			
			for( int i=0; i< 10; i++) {
				MedicineThread t = new MedicineThread(cell);
				t.start();
			}

			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// 실습 #10


	package lab.ssafy.corona.virus;

	public class CoronaThread extends Thread {
		int num;
		Cell cell;
		
		public CoronaThread(int num) {
			this.num = num;
		}
		
		public CoronaThread(Cell cell) {
			this.cell = cell;
		}
		
		@Override
		public void run() {
			synchronized(cell) {
				if( cell.power < 100 ) {
					try {
						cell.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				if( cell.power >= 100 ) {
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					cell.power = cell.power - 100;
					cell.notifyAll();
				}
			}
			System.out.println("CoronaThread : " + cell.power);
		}
	}

	package lab.ssafy.corona.virus;

	public class MedicineThread extends Thread{
		Cell cell;
		
		public MedicineThread(Cell cell) {
			this.cell = cell;
		}
		
		@Override
		public void run() {
			
			synchronized(cell) {
				if( cell.power >= 500 ) {
					try {
						cell.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				if( cell.power < 500 ) {
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					cell.power = cell.power + 100;
					cell.notifyAll();
				}
		
				System.out.println("MedicineThread : " + cell.power);
			}
		}
	}

	package lab.ssafy.corona.app;

	import lab.ssafy.corona.virus.Cell;
	import lab.ssafy.corona.virus.CoronaThread;
	import lab.ssafy.corona.virus.MedicineThread;

	public class MedicineThreadSyncTest {

		public static void main(String[] args) {
			Cell cell = new Cell();
			
			for( int i=0; i< 10; i++) {
				MedicineThread t = new MedicineThread(cell);
				t.start();
			}
			
			for( int i=0; i< 10; i++) {
				CoronaThread t = new CoronaThread(cell);
				t.start();
			}

			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	// 실습 #11

	package com.ssafy;

	import java.net.InetAddress;
	import java.net.UnknownHostException;

	public class NetworkInetAddressTest {

		public static void main(String[] args) {
			try {
				InetAddress[] google = InetAddress.getAllByName("naver.com");
				for (InetAddress addr : google)
					System.out.println(addr.getHostAddress());
				
				InetAddress localhost = InetAddress.getLocalHost();
				System.out.println(localhost);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
	}	

	// 실습 #12

	package com.ssafy;

	import java.io.IOException;
	import java.io.OutputStream;
	import java.io.PrintWriter;
	import java.net.ServerSocket;
	import java.net.Socket;

	public class NetworkSimpleServer {

	public static void main(String[] args) {
		int port = 5100;
		
		try (ServerSocket serverSocket = new ServerSocket(port)) {
			
			System.out.println("NetworkSimpleServer Started");
			
			while (true) {
				Socket socket = serverSocket.accept();
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);
				writer.println("Hello SSAFY!");
			}
			
		 } catch (IOException e) {
			 System.out.println("NetworkSimpleServer exception: " + e.getMessage());
			 e.printStackTrace();
		 }
	}
	}


	package com.ssafy;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.net.Socket;

	public class NetworkSimpleClient {

		public static void main(String[] args) {
			String host = "localhost";
			int port = 5100;
			
			try ( Socket socket = new Socket(host, port) ) {
				
				InputStream input = socket.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
	 
				String message = reader.readLine();
				System.out.println(message);
				reader.close();
				
			 } catch ( IOException e) {
				 System.out.println("NetworkSimpleClient exception: " + e.getMessage());
				 e.printStackTrace();
			 }
		}
	}

	// 실습 #13
	// NetworkSimpleClient 는 변화 없음

	package com.ssafy;

	import java.io.IOException;
	import java.io.OutputStream;
	import java.io.PrintWriter;
	import java.net.ServerSocket;
	import java.net.Socket;

	public class NetworkThreadServer {

		public static void main(String[] args) {
			int port = 5100;
			
			try (ServerSocket serverSocket = new ServerSocket(port)) {
				
				System.out.println("NetworkThreadServer Started");
				
				while (true) {
					Socket socket = serverSocket.accept();
					NetworkThread thread = new NetworkThread(socket);
					thread.start();
				}
				
			 } catch (IOException e) {
				 System.out.println("NetworkThreadServer exception: " + e.getMessage());
				 e.printStackTrace();
			 }
		}
	}

	class NetworkThread extends Thread{
		Socket	 client;
		
		public NetworkThread() {}
		public NetworkThread(Socket client) {
			this.client = client;
		}
		@Override
		public void run() {
			try {
				OutputStream output = client.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);
				writer.println("Hello SSAFY!");			
			} catch (IOException e) {
				 System.out.println("NetworkSimpleServer exception: " + e.getMessage());
				 e.printStackTrace();
			}

		}
	}	
}
