package com.rj.demo._2018.interview.concurrent;
/**
 * @author Eric.Wu
 * @date 2018年4月27日 上午11:36:50
 * 
 */
public class JoinDemo {

	public synchronized void method1() throws InterruptedException {
		System.out.println("current thread is "+ Thread.currentThread().getName() + " method1 start...");
	}
	
	public static void main(String[] args) throws InterruptedException {
		JoinDemo joinDemo = new JoinDemo();
		Thread t1 = new Thread(){
			public void run() {
				try {
					//System.out.println("current thread is "+ Thread.currentThread().getName());
					for(int i=0;i<10;i++) 
						joinDemo.method1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			public void run() {
				try {
					//System.out.println("current thread is "+ Thread.currentThread().getName());
					for(int i=0;i<10;i++) 
						joinDemo.method1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t2.start();
		Thread t3 = new Thread(){
			public void run() {
				try {
					//System.out.println("current thread is "+ Thread.currentThread().getName());
					for(int i=0;i<10;i++) 
						joinDemo.method1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("main thread is "+ Thread.currentThread().getName());
	}
}
