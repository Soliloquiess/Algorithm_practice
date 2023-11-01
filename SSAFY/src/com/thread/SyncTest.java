package com.thread;
//bedroom(), kitchen()�޼ҵ忡 synchronized Ű���带 �ٿ��� �ô� Ȯ���� ����
public class SyncTest implements Runnable {
	
	public SyncTest() {
		//thread ����, start
		Thread tom = new Thread(this,"Tom");//Tom: thread name���� ������.getName()�ϸ� ����
		Thread jerry = new Thread(this,"Jerry");
		tom.start();
		jerry.start();
	}
	
	public static void main(String[] args) {
		new SyncTest();
	}

	//thread�� ���� ������ �ִ� �޼ҵ�
	@Override
	public void run() {
		kitchen();
		bedroom();
	}

	private synchronized void bedroom() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " ħ�ǿ� ����");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " ħ�ǿ��� ����");
		
	}

	private synchronized void kitchen() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " �ξ��� ����");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " �ξ����� ����");
		
	}
}
