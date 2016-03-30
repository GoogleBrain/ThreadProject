package com.sun.newthread;

/**
 * 创建线程的两种方式
 * 
 * @author google
 *
 */
public class ThreadInstance {
	public static void main(String[] args) {

		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println(" 1  " + Thread.currentThread().getName());
			}
		};
		thread.start();

		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(" 2 " + Thread.currentThread().getName());
			}
		});
		th.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("runnable");
			}
		}) {
			public void run() {
				System.out.println("run");
			};
		}.start();
	}
}
