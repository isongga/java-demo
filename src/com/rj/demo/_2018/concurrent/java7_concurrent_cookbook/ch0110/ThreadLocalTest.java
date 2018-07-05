package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0110;

import java.util.concurrent.TimeUnit;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 下午7:51:45
 * 
 */
public class ThreadLocalTest {

	public static void main(String[] args) {
		//UnsafeTask task = new UnsafeTask();
		SafeTask task = new SafeTask();
		for(int i=0; i<10; i++) {
			new Thread(task).start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
