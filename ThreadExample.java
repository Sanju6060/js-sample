package com.fpt.trainingpackage;

public class ThreadExample extends Thread {
	void m1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("value of i :" + i);

		}
	}

	public void run() {
		System.out.println("---------------------------");
		try {
			for (int j = 1; j <= 10; j++) {
				System.out.println("value of j:" + j);

				Thread.sleep(10);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws Exception {
		ThreadExample te = new ThreadExample();
		Thread t = new Thread(te);
		te.m1();
		Thread t2 =new Thread(te);
		t.start();
		t2.start();
	}
}
