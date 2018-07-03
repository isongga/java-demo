package com.rj.demo._2018.interview.concurrent;
/**
 * @author Eric.Wu
 * @date 2018年4月27日 上午11:36:50
 * 
 */
public class WaitDemo {

	public synchronized void method1() throws InterruptedException {
		System.out.println("method1 start...");
		this.wait();
	}
	
	public static void main(String[] args) {
		WaitDemo waitDemo = new WaitDemo();
		Thread t1 = new Thread(){
			public void run() {
				
			}
		};
		t1.start();
	}
}
