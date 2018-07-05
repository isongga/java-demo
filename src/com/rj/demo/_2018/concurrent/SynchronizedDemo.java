package com.rj.demo._2018.interview.concurrent;
/**
 * @author Eric.Wu
 * @date 2018年4月27日 上午11:27:59
 * 
 */
public class SynchronizedDemo {

	public synchronized void method1() {
		System.out.println("method1");
		method2();
	}
	
	public synchronized void method2() {
		System.out.println("method2");
	}
	
	public static void main(String[] args) {
		SynchronizedDemo sync = new SynchronizedDemo();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				sync.method1();
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				sync.method2();
			}
		};
		t2.start();
	}
}
