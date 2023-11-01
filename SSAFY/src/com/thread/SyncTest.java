package com.thread;
//bedroom(), kitchen()메소드에 synchronized 키워드를 붙였다 뗐다 확인해 보기
public class SyncTest implements Runnable {
	
	public SyncTest() {
		//thread 생성, start
		Thread tom = new Thread(this,"Tom");//Tom: thread name으로 지정함.getName()하면 나옴
		Thread jerry = new Thread(this,"Jerry");
		tom.start();
		jerry.start();
	}
	
	public static void main(String[] args) {
		new SyncTest();
	}

	//thread가 일할 내용이 있는 메소드
	@Override
	public void run() {
		kitchen();
		bedroom();
	}

	private synchronized void bedroom() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 침실에 들어옴");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " 침실에서 나감");
		
	}

	private synchronized void kitchen() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 부엌에 들어옴");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " 부엌에서 나감");
		
	}
}
