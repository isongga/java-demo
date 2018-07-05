package com.rj.demo._2018.concurrent;
/**
 * @author Eric.Wu
 * @date 2018年4月18日 下午4:07:05
 * 
 */
public class FinalDemo {

	private static FinalDemo finalDemo = null;
	
	final int a;
	
	public FinalDemo() {
		a = 100;
		finalDemo = this;
	}
	
	public static void read() {
		if(finalDemo != null) {
			//
			//finalDemo.a = 200;
			System.out.println(finalDemo.a);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				FinalDemo f = new FinalDemo();
				FinalDemo.read();
			}
		};
		t1.start();
	}
}
